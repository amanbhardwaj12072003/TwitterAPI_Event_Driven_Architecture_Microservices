package com.microservices.api.elastic.query.service.business;

import com.microservices.api.elastic.query.service.dataaccess.entity.UserPermission;

import java.util.List;
import java.util.Optional;

public interface QueryUserService {
    Optional<List<UserPermission>> findAllPermissionsByUsername(String username);
}
