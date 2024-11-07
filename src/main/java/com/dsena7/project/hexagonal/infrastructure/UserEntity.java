package com.dsena7.project.hexagonal.infrastructure;

import com.dsena7.project.hexagonal.domain.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
public class UserEntity {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idUser;

    @Field(name = "first_name")
    private String firstName;

    @Field(name = "last_name")
    private String lastName;

    public UserEntity() {
    }

    public UserEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User convertToUser(){
        return new User( this.firstName, this.lastName);
    }
}
