package com.topsquad.ninzy.userservice.service.abstracts;


import com.topsquad.ninzy.userservice.dto.UserAuthenticationResponseDto;
import com.topsquad.ninzy.userservice.dto.UserLoginRequestDto;

public interface AuthService {

    UserAuthenticationResponseDto login(UserLoginRequestDto userLoginRequestDto);

}
