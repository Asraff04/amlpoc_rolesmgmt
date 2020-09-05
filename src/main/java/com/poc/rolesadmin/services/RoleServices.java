package com.poc.rolesadmin.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.poc.rolesadmin.model.ACRolesList;
import com.poc.rolesadmin.model.AC_Roles;
import com.poc.rolesadmin.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServices {

    @Autowired
    private RoleRepository roleRepository;

    public List<AC_Roles> getAllRoles() {
        List<AC_Roles>  roles = new ArrayList<>();
        roleRepository.findAll()
                .forEach(roles::add);
        return roles;
    }

    //retriving by list of role ids-
    public ACRolesList getAllRolesByIds(List<Integer> ids) throws JsonProcessingException {
        List<AC_Roles>  roles = new ArrayList<>();
        ids.forEach(id -> roles.add(getRoleId(id).get()));
        ACRolesList acRolesList = new ACRolesList();
//        System.out.println("inside role domain>>> "+roles.get(0));
        acRolesList.setAc_rolesList(roles);
        return acRolesList;
    }

    public Optional<AC_Roles> getRoleId(Integer id) {
        return roleRepository.findById(id);
    }


    public void addRole(AC_Roles role){
        roleRepository.save(role);
    }


    public void updateRole(Integer id, AC_Roles role) {
        roleRepository.save(role);
    }

    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }

}

