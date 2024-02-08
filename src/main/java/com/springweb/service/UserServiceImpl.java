package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.dto.UserDTO;
import com.springweb.entity.UserEntity;
import com.springweb.repository.UserRepository;
import com.springweb.util.AppModelMapper;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AppModelMapper appModelMapper;

	@Override
	public void saveUser(UserDTO userDTO) {
		UserEntity userEntity = appModelMapper.dtoToEntity(userDTO);
		userRepository.save(userEntity);

	}

}
