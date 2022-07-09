package com.assessment.userRegistration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private  int id;
    private String mobile_no;
    private String email;
    private String first_name;
    private String last_name;
    private String password;
    private String role;
}
