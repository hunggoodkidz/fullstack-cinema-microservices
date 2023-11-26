package com.topsquad.ninzy.userservice.repository;


import com.topsquad.ninzy.userservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUserId(String userId);

    User findUserByEmail(String email);
}
