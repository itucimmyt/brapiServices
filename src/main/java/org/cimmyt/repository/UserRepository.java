package org.cimmyt.repository;

import org.cimmyt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author RHTOLEDO
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
