package com.compro.miu.compro.dto;

import com.compro.miu.compro.domain.Address;

import javax.management.relation.Role;

public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String title;
    private String email;
    private String password;
    Role role;
    private Address mailingAddress;
    private Address homeAddress;

}
