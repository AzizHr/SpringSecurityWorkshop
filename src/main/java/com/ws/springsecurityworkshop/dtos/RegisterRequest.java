package com.ws.springsecurityworkshop.dtos;

import lombok.*;

@Data
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
