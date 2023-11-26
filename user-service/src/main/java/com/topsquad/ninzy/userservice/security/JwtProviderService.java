package com.topsquad.ninzy.userservice.security;

import org.springframework.security.core.Authentication;

public interface JwtProviderService {

    String generateToken(Authentication authentication);
}
