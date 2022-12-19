package com.compro.miu.compro.service.impl;

import com.compro.miu.compro.Util.DateAndCodeUtil;
import com.compro.miu.compro.domain.*;
import com.compro.miu.compro.dto.CourseOfferingDto;
import com.compro.miu.compro.exception.NoSuchResourceException;
import com.compro.miu.compro.repository.AcademicBlockRepository;
import com.compro.miu.compro.repository.CourseOfferingRepository;
import com.compro.miu.compro.repository.CourseRepository;
import com.compro.miu.compro.repository.FacultyRepository;
import com.compro.miu.compro.service.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class CourseOfferingServiceImpl implements CourseOfferingService {
    @Autowired
    private CourseOfferingRepository courseOfferingRepository;
    @Autowired
    FacultyRepository facultyRepository;
    @Autowired
    AcademicBlockRepository blockRepository;
    @Autowired
    CourseRepository courseRepository;



    @Autowired
    public CourseOfferingServiceImpl(CourseOfferingRepository courseOfferingRepository) {
        this.courseOfferingRepository = courseOfferingRepository;
    }


    @Override
    public void update(CourseOffering courseOffering) {

    }

    @Override
    public CourseOffering create(CourseOfferingDto courseOfferingDto) {
        CourseOffering courseOffering=new CourseOffering();

        Optional<Faculty> facultyOptional=facultyRepository.findById((long) courseOfferingDto.getFaculty_id());
        facultyOptional.ifPresentOrElse(user -> {
            if (user.getRole()== Role.FACULTY){
                Optional<Course> optionalCourse=courseRepository.findById(courseOfferingDto.getCourse_id());
                optionalCourse.ifPresentOrElse(new Consumer<Course>() {
                    @Override
                    public void accept(Course course) {
                        Optional<AcademicBlock> academicBlockOptional=blockRepository.findById(courseOfferingDto.getBlock_id());
                        academicBlockOptional.ifPresentOrElse(new Consumer<AcademicBlock>() {
                            @Override
                            public void accept(AcademicBlock academicBlock) {
                                courseOffering.setCourse(course);
                                courseOffering.setCode(DateAndCodeUtil.courseOffering(course.getCode(),academicBlock.getCode(),(user.getFirstName().charAt(0)+""+user.getLastName().charAt(0)).toUpperCase()));


                                courseOffering.setFaculty(user);
                                courseOffering.setCapacity(courseOfferingDto.getTotalSeat());
                                courseOfferingRepository.save(courseOffering);
                                boolean contains=  academicBlock.getCourseOfferings().contains(courseOffering);
                                if (!contains){
                                    List<CourseOffering> courseOfferings=academicBlock.getCourseOfferings();
                                    courseOfferings.add(courseOffering);
                                    academicBlock.setCourseOfferings(courseOfferings);
                                    blockRepository.save(academicBlock);
                                }
                            }
                        },()->{

                            new NoSuchResourceException("Academic block is nof found for "+courseOfferingDto.getBlock_id());

                        });
                    }
                },()->{
                    new NoSuchResourceException("Course is nof found for "+courseOfferingDto.getCourse_id());

                });


            }
            else{
                new NoSuchResourceException("Faculty is nof found for "+courseOfferingDto.getFaculty_id());

            }
        },()->{
            new NoSuchResourceException("User is nof found for "+courseOfferingDto.getFaculty_id());

        });


        return courseOffering;
    }
    @Override
    public CourseOffering findById(int id) {
        return null;
    }
    @Override
    public Page<CourseOffering> findAll(Pageable pageable) {
        return courseOfferingRepository.findAll(pageable);
    }

    @Override
    public void delete(int id) {
        courseOfferingRepository.deleteById(id);
    }
}



