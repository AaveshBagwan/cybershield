package dev.group.cybershield.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "answer_master")
public class Answers extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    public Integer answerId;

    @Column(name = "answer")
    public String answer;

    @Column(name = "question_id")
    public Integer questionId;

    @Column(name = "is_correct")
    public String isCorrect;

}
