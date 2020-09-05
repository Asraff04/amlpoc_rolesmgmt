package com.poc.rolesadmin.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.poc.rolesadmin.model.ACRolesList;
import com.poc.rolesadmin.model.AC_Roles;
import com.poc.rolesadmin.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {

    @Autowired
    private RoleServices roleService;

    // TEST OK
    @RequestMapping("/roles")
    public List<AC_Roles> getAllRoles(){
        System.out.println("Inside get users method");
        return roleService.getAllRoles();
    }

    //TEST OK
    @RequestMapping("/roles/{id}")
    public Optional<AC_Roles> getRoleId(@PathVariable Integer id) {
        return roleService.getRoleId(id);
    }

    // TEST OK
    @RequestMapping("/roles/_list/{id}")
    public ACRolesList getRoleList(@PathVariable List<Integer> id) throws JsonProcessingException {
        return roleService.getAllRolesByIds(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/roles")
    public void addRole(@RequestBody AC_Roles role){
        roleService.addRole(role);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/roles/{id}")
    public void updateRole(@RequestBody AC_Roles role, @PathVariable Integer id){
        roleService.updateRole(id, role);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/roles/{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }

//    @RequestMapping("/users/{id}/roles")
//    public List<RoleMaster> getAllRoles(@PathVariable Integer id){
//        System.out.println("Inside get Roles method");
//        return roleService.getAllRoleId(id);
//    }
//
//    @RequestMapping("/users/{userId}/roles/{id}")
//    public RoleMaster getRole(@PathVariable Integer id) {
//        return roleService.getUserRole(id);
//    }
//
//
//    @RequestMapping(method= RequestMethod.POST, value="/users/{userId}/roles")
//    public void addUserRole(@RequestBody RoleMaster role, @PathVariable Integer userId) {
//        roleService.addUserRole(role);
//    }


//    @RequestMapping(method= RequestMethod.PUT, value="/users/{userId}/roles/{id}")
//    public void updateRole(@RequestBody RoleMaintain role, @PathVariable Integer userId, @PathVariable Integer id) {
//        System.out.println("id "+id);
//        //roleService.updateUser(id, user);
//    }

//    @RequestMapping(method=RequestMethod.DELETE, value="/users/{UserId/roles/{id}")
//    public void deleteRole(@PathVariable Integer id) {
//        //userService.deleteUser(id);
//        System.out.println("Deleted"+id);
//    }
}

