package com.GamersHub.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class registerUserDTO {
        @NotBlank(message = "Username is required!")
        @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters.")
        @Email(message = "Email must be valid.")
        private String email;

        @NotBlank(message = "Password is required")
        @Size(min = 6, message = "Password must be at least 6 characters")
        private String password;

        @NotBlank(message = "Confirm Password is required")
        @Size(min = 6, message = "Confirm Password must be at least 6 characters")
        private String confirmPassword;
}
