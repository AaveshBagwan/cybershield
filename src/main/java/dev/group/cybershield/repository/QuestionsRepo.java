package dev.group.cybershield.repository;

import dev.group.cybershield.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {

    String randomQuestionQuery = "SELECT * FROM Question_Master WHERE status = 'A' ORDER BY RANDOM() LIMIT :count";

    @Query(value = randomQuestionQuery, nativeQuery = true)
    List<Questions> getRandomQuestions(@Param("count") int count);

    Optional<Questions> findByQuestionId(Integer questionId);
}
