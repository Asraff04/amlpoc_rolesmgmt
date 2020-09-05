package com.poc.rolesadmin.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;


@Entity
//@Table(name="AC_ROLES", schema="FirstMule")
public class AC_Roles {

    @Id
    @GeneratedValue
    @Column(name = "Role_id")
    private Integer roleId;
    @Column(name = "Role_Name")
    private String roleName;
    @Column(name="Role_Short_NM")
    private String roleShortName;
    @Column(name = "User_Add_Dt")
    private Date createdDate;
    @Column(name = "Last_Login_Dt")
    private Date modifiedDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public AC_Roles() {
    }

    public AC_Roles(Integer roleId, String roleName, String roleShortName, Date createdDate, Date modifiedDate) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleShortName = roleShortName;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleShortName() {
        return roleShortName;
    }

    public void setRoleShortName(String roleShortName) {
        this.roleShortName = roleShortName;
    }

}

