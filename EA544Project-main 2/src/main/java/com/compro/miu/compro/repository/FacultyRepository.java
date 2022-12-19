package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Long> {

  public   void delete();
}
