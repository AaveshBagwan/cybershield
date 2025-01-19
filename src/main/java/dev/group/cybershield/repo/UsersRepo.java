package dev.group.cybershield.repo;

import dev.group.cybershield.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {
    UsersEntity findByUserId(Integer userId);

    UsersEntity findByEmail(String email);
}
