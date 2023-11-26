package com.topsquad.ninzy.userservice.repository;



import com.topsquad.ninzy.userservice.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role getRoleByRoleName(String roleName);
}
