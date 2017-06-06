package org.cimmyt.service.impl;

import java.util.List;

import org.cimmyt.model.User;
import org.cimmyt.repository.UserRepository;
import org.cimmyt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
class LoginServiceImpl implements LoginService{

	private UserRepository userRepository;
	
	@Autowired
	public LoginServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getUserIdByName(String userName) {
		Example<User> example = Example.of(new User(userName)); 
		return userRepository.findAll(example);
	}
	
	

}
