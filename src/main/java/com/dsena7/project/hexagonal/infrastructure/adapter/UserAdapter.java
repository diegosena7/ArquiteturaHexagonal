package com.dsena7.project.hexagonal.infrastructure.adapter;

import com.dsena7.project.hexagonal.application.UserUseCase;
import com.dsena7.project.hexagonal.domain.ports.in.UserPortIn;
import com.dsena7.project.hexagonal.infrastructure.UserEntity;
import com.dsena7.project.hexagonal.infrastructure.adapter.repository.UserRepository;
import org.springframework.stereotype.Component;

/*
Camada de Adapter
 */
@Component
public class UserAdapter implements UserPortIn {

    private UserRepository userRepositorio;
    private UserUseCase userUseCase;

    public UserAdapter(UserRepository userRepositorio, UserUseCase userService) {
        this.userRepositorio = userRepositorio;
        this.userUseCase = userService;
    }
    @Override
    public void saveUser(UserEntity userEntity) {
        userUseCase.verifyUserData(userEntity.getFirstName(), userEntity.getLastName());
        userRepositorio.save(userEntity);
    }
}
