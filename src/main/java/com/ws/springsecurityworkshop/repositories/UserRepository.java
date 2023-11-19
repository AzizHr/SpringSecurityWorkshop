package com.ws.springsecurityworkshop.repositories;

import com.ws.springsecurityworkshop.entities.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CustomUser, Integer> {

    CustomUser findByEmail(String email);

}
