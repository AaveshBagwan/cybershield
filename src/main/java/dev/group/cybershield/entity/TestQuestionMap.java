package dev.group.cybershield.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "test_question_map")
public class TestQuestionMap extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_question_map_id")
    private Integer testQuestionMapId;

    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "users_answer_id")
    private Integer usersAnswerId;

    @Column(name = "given_option1")
    private Integer givenOption1;

    @Column(name = "given_option2")
    private Integer givenOption2;

    @Column(name = "given_option3")
    private Integer givenOption3;

    @Column(name = "given_option4")
    private Integer givenOption4;

}
