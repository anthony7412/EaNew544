package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AcademicBlockRepository extends JpaRepository<AcademicBlock,Integer> {
}
