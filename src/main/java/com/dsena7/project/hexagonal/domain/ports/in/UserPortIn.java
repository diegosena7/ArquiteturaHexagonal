package com.dsena7.project.hexagonal.domain.ports.in;

import com.dsena7.project.hexagonal.infrastructure.UserEntity;

//Porta
public interface UserPortIn {
    void saveUser(UserEntity userEntity);
}
