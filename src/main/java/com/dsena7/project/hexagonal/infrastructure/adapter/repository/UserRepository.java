package com.dsena7.project.hexagonal.infrastructure.adapter.repository;

import com.dsena7.project.hexagonal.infrastructure.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Infraestrura
@Repository
public interface UserRepository extends MongoRepository<UserEntity, Long> {
}
