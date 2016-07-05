package com.firstLink.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstLink.dao.IRoleDao;
import com.firstLink.model.Role;
import com.firstLink.service.IRoleService;

@Service("RoleService")
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleDao ird;
    public List<Role> selectAll() {
        return ird.selectAll();
    }   
    
}
