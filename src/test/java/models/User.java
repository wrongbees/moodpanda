package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String firstName;
    String surName;
    String gender;
    String yearOfBirth;
    String email;
    String password;


}

