package com.topsquad.ninzy.userservice.service.concretes;


import com.topsquad.ninzy.userservice.entity.Role;
import com.topsquad.ninzy.userservice.repository.RoleRepository;
import com.topsquad.ninzy.userservice.service.abstracts.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role getRoleByRoleName(String roleName) {
        return roleRepository.getRoleByRoleName(roleName); //String
    }
}
