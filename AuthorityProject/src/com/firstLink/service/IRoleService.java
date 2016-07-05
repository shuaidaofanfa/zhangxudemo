package com.firstLink.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.firstLink.model.Role;


@Transactional 
public interface IRoleService {
    public List<Role> selectAll();
}
