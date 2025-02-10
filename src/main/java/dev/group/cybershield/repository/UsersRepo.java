package dev.group.cybershield.repository;

import dev.group.cybershield.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

    Users findByEmail(String email);

}
