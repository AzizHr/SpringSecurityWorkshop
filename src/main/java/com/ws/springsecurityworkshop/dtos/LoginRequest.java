package com.ws.springsecurityworkshop.dtos;

import lombok.*;

@Data
@NoArgsConstructor
public class LoginRequest {

    private String email;
    private String password;

}
