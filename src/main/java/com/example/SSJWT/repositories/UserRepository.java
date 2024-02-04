package com.example.SSJWT.repositories;

import com.example.SSJWT.models.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
   Optional<UserEntity> findByUsername(String username);
}
