package com.topsquad.ninzy.userservice.service.concretes;


import com.topsquad.ninzy.userservice.entity.Role;
import com.topsquad.ninzy.userservice.service.abstracts.RoleService;
import com.topsquad.ninzy.userservice.service.abstracts.UserService;
import com.topsquad.ninzy.userservice.repository.UserRepository;
import com.topsquad.ninzy.userservice.entity.User;
import com.topsquad.ninzy.userservice.dto.UserRegisterRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Boolean isUserExist(String userId) {

        User user = userRepository.findUserByUserId(userId);

        if (user == null) {
            return false;
        }

        return true;
    }

    @Override
    public void addUser(UserRegisterRequestDto userRegisterRequestDto) {

        Role role = roleService.getRoleByRoleName("CUSTOMER");

        User user = User.builder()
                        .email(userRegisterRequestDto.getEmail())
                        .password(passwordEncoder.encode(userRegisterRequestDto.getPassword()))
                        .fullName(userRegisterRequestDto.getCustomerName())
                        .role(role)
                        .build();
        userRepository.insert(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public boolean isUserCustomer() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getAuthorities().stream().allMatch(
                a -> a.getAuthority().equals("ROLE_CUSTOMER")
        )) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isUserAdmin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getAuthorities().stream().anyMatch(
                a -> a.getAuthority().equals("ROLE_ADMIN")
        )) {
            return true;
        }
        return false;
    }
}
