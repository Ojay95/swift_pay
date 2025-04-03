package org.swiftpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.swiftpay.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}
