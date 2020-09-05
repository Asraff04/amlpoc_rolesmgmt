package com.poc.rolesadmin.repository;




import com.poc.rolesadmin.model.AC_Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<AC_Users, Integer> {
    public AC_Users findByUsername(String username);
}
