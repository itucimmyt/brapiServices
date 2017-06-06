package org.cimmyt.service;

import java.util.List;

import org.cimmyt.model.User;

/**
 * All the services related to the login process
 * @author RHTOLEDO
 *
 */
public interface LoginService {
	
	/**
	 * Get the Id from the user using the user name
	 * from the table {@link User}
	 * @param userName
	 * @return
	 */
    List<User> getUserIdByName(String userName);

}
