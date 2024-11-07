package com.dsena7.project.hexagonal.infrastructure.adapter.controller;

import com.dsena7.project.hexagonal.infrastructure.adapter.UserAdapter;
import com.dsena7.project.hexagonal.infrastructure.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Camada da interface do usuário
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserAdapter userAdapter;
    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody UserEntity userEntity){
        userAdapter.saveUser(userEntity);
        return ResponseEntity.ok("Transação realizada com sucesso");
    }
}
