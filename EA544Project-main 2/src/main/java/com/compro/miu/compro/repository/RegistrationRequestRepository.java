package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.RegistrationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface RegistrationRequestRepository extends JpaRepository<RegistrationRequest,Long> {
}
