package com.topsquad.ninzy.userservice.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Role {
    @Id
    String roleId;
    String roleName;

}
