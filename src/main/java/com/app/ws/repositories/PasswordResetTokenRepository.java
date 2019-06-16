package com.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.ws.entities.PasswordResetTokenEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long> {

    PasswordResetTokenEntity findByToken(String token);
}
