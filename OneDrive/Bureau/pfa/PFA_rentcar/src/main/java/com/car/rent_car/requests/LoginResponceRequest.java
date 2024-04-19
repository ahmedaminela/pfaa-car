package com.car.rent_car.requests;

import com.car.rent_car.models.User;
import lombok.Data;

@Data
public class LoginResponceRequest {

    private User user;
    private String jwt;


}
