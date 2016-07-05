package com.firstLink.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.firstLink.service.IRoleService;

@Controller("RoleAction")
public class RoleAction {
    @Autowired
    IRoleService roleService ;
    List<?> roleList;
    
    public String selectAll(){
        roleList=roleService.selectAll();
        System.out.println(roleList.size()+"---");
        return "success";
    }





    public List<?> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<?> roleList) {
        this.roleList = roleList;
    }
}
