package com.topsquad.ninzy.userservice.service.abstracts;


import com.topsquad.ninzy.userservice.entity.User;
import com.topsquad.ninzy.userservice.dto.UserRegisterRequestDto;

public interface UserService {

    Boolean isUserExist(String userId);

    void addUser(UserRegisterRequestDto userRegisterRequestDto);

    User getUserByEmail(String email);

    boolean isUserCustomer();

    boolean isUserAdmin();
}
