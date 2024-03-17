package com.project.moonwalk.repository;

import com.project.moonwalk.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNickname(String nickname);
    default User getByNickname(String nickname) {
        return findByNickname(nickname)
                .orElseThrow(() -> new );
    }
}
