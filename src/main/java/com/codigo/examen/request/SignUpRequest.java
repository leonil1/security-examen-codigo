package com.codigo.examen.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
    private String username;
    private String password;
    private String email;
    private String telefono;
    private String roleName;
}
