package com.compro.miu.compro.service.impl;


import com.compro.miu.compro.repository.RegistrationEventRepository;
import com.compro.miu.compro.service.RegistrationEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrartionEventServiceImpl implements RegistrationEventService {

  @Autowired
  private RegistrationEventRepository registrationEventRepository;
}
