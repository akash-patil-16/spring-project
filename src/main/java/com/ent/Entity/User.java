package com.ent.Entity;

import com.ent.Model.UserRequest;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "User_db",schema = "dbo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    private String userName;
    private String address;
    private String phoneNumber;


}
