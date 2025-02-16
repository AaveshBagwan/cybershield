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
    public Integer testQuestionMapId;

    @Column(name = "test_id")
    public Integer testId;

    @Column(name = "question_id")
    public Integer questionId;

    @Column(name = "users_answer_id")
    public Integer usersAnswerId;

    @Column(name = "given_option1")
    public Integer givenOption1;

    @Column(name = "given_option2")
    public Integer givenOption2;

    @Column(name = "given_option3")
    public Integer givenOption3;

    @Column(name = "given_option4")
    public Integer givenOption4;

}
