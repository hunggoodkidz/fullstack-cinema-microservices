package com.topsquad.ninzy.userservice.service.abstracts;

import com.topsquad.ninzy.userservice.entity.Role;

public interface RoleService {

    Role getRoleByRoleName(String roleName);
}
