package com.application.rest.SpringBootRest.repositories;

import com.application.rest.SpringBootRest.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {



}
