package com.ent.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private Integer userId;
    private String userName;
    private String address;
    private String phoneNumber;

}
