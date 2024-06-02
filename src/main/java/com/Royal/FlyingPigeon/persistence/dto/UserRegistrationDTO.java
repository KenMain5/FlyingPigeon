package com.Royal.FlyingPigeon.persistence.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class UserRegistrationDTO {

    @NotBlank @Email
    private String email;

    @NotBlank @Size(min=3, max=15)
    private String username;

    @NotBlank @Size(min=7, max=15)
    private String password;
}
