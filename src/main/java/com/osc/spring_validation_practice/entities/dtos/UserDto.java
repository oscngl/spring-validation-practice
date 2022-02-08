package com.osc.spring_validation_practice.entities.dtos;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDto {

    @NotEmpty(message = "Name is required!")
    @NotBlank(message = "Name is required!")
    private String firstName;

    @NotEmpty(message = "Last Name is required!")
    @NotBlank(message = "Last Name is required!")
    private String lastName;

    @NotEmpty(message = "Email is required!")
    @NotBlank(message = "Email is required!")
    @Email(message = "Email is not valid!")
    private String email;

    @NotEmpty(message = "Password is required!")
    @NotBlank(message = "Password is required!")
    @Size(min = 8, max = 20, message = "Password must contain at least 8 and maximum 20 characters!")
    @Pattern(regexp = "^[0-9a-zA-Z]*$", message = "Password is not valid!")
    private String password;

    @NotEmpty(message = "Phone Number is required!")
    @NotBlank(message = "Phone Number is required!")
    @Size(min = 10, max = 10, message = "Phone Number must be 10 characters!")
    @Pattern(regexp = "^[0-9]*$", message = "Phone Number is not valid!")
    private String phoneNumber;

    @NotEmpty(message = "National Id is required!")
    @NotBlank(message = "National Id is required!")
    @Size(min = 11, max = 11, message = "National Id must be 11 characters!")
    @Pattern(regexp = "^[0-9]*$", message = "National Id is not valid!")
    private String nationalId;

}
