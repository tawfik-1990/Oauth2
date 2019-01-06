package com.oauth2.security.springoauth2authserver.repository;




import com.oauth2.security.springoauth2authserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;



@Repository("UsersRepository")
public interface UsersRepository extends JpaRepository<User, Integer> {
   public  User findByUsername(String username);
}
