package com.dsena7.project.hexagonal.domain.service;

import com.dsena7.project.hexagonal.application.UserUseCase;

/*
Camada de regras e validação dos casos de uso
 */
public class UserService implements UserUseCase {
    @Override
    public String verifyUserData(String firstName, String lastName) {
        if(firstName.length() < 3 && lastName.length() < 3){
            return "No first name or last name less than 3 letters";
        }
        return "User validation successful";
    }
}
