package dev.group.cybershield.repository;

import dev.group.cybershield.entity.TestMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMasterRepo extends JpaRepository<TestMaster, Integer> {

    List<TestMaster> findByUserIdAndTestStatusAndStatus(Integer userId, String testStatus, String status);

}
