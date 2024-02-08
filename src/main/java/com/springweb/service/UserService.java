package com.springweb.service;

import org.springframework.stereotype.Service;

import com.springweb.dto.UserDTO;

@Service
public interface UserService {

	void saveUser(UserDTO userDTO);

}
