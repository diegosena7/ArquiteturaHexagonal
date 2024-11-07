package com.dsena7.project.hexagonal.domain.ports.out;

import com.dsena7.project.hexagonal.infrastructure.UserEntity;

//Porta
public interface UserRepositorio {

    void saveUserInBD(UserEntity userEntity);
}
