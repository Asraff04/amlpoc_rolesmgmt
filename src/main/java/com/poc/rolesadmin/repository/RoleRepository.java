package com.poc.rolesadmin.repository;

import com.poc.rolesadmin.model.AC_Roles;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<AC_Roles, Integer> {
}

