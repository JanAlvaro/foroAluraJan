package com.foroalurajan.foroalurajan.controller;


import com.foroalurajan.foroalurajan.controller.user.DtoLoginUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody DtoLoginUser dtoLoginUser){

        System.out.println(dtoLoginUser);
    }
}
