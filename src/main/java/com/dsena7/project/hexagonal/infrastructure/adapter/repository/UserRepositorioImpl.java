package com.dsena7.project.hexagonal.infrastructure.adapter.repository;

import com.dsena7.project.hexagonal.domain.ports.out.UserRepositorio;
import com.dsena7.project.hexagonal.infrastructure.UserEntity;
import org.springframework.stereotype.Repository;

//Adaptador
//@Repository
public class UserRepositorioImpl implements UserRepositorio {

    private final UserRepository userRepository;

    public UserRepositorioImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUserInBD(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
}
