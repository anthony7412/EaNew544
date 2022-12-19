package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.RegistrationEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationEventRepository extends JpaRepository<RegistrationEvent,Long> {
}
