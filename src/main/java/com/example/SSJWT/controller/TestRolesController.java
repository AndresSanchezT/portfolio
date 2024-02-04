package com.example.SSJWT.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRolesController {

    @GetMapping("/accessAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String accessAdmin() {
        return "Hola, haz accedido con rol de ADMIN";
    }

    @GetMapping("/accessUser")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")//PARA QUE VARIOS USUARIOS TENGAN PERMISO A ESTE ENDPOINT ("hasAnyRole('USER','ADMIN')")
    public String accessUser() {
        return "Hola, haz accedido con rol de USER";
    }

    @GetMapping("/accessInvited")
    @PreAuthorize("hasRole('INVITED')")
    public String accessInvited() {
        return "Hola, haz accedido con rol de INVITED";
    }


}
