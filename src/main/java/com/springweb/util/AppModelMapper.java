package com.springweb.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.springweb.dto.UserDTO;
import com.springweb.entity.UserEntity;

@Component
public class AppModelMapper {
	private ModelMapper modelMapper = new ModelMapper();

	public UserEntity dtoToEntity(UserDTO userDTO) {
		return modelMapper.map(userDTO, UserEntity.class);
	}

	public UserDTO entityToDTO(UserEntity userEntity) {
		return modelMapper.map(userEntity, UserDTO.class);
	}

}
