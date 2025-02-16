package dev.group.cybershield.repository;

import dev.group.cybershield.entity.TestQuestionMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestQuestionMapRepo extends JpaRepository<TestQuestionMap, Integer> {

    List<TestQuestionMap> findByTestId(Integer testId);

}
