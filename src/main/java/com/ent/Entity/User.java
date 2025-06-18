package com.ent.Entity;

import com.ent.Model.UserRequest;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "User_db",schema = "dbo")
public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String address;
    private String phoneNumber;


}
