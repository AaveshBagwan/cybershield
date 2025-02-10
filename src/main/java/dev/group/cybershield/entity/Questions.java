package dev.group.cybershield.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "question_master")
public class Questions extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question")
    private String question;

    @Column(name = "category")
    private String category;

    @Column(name = "level")
    private String level;

    @Column(name = "description")
    private String description;


}
