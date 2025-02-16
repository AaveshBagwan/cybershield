package dev.group.cybershield.repository;

import dev.group.cybershield.entity.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswersRepo extends JpaRepository<Answers, Integer> {

    List<Answers> findByQuestionIdInAndStatus(List<Integer> questionId, String status);

    List<Answers> findByQuestionId(Integer questionId);

    List<Answers> findByQuestionIdInAndIsCorrect(List<Integer> questionId, String isCorrect);

    List<Answers> findByQuestionIdIn(List<Integer> questionId);
}
