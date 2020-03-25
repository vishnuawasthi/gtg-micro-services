package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entities.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

}
