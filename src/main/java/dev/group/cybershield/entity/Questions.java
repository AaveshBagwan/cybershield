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
    public Integer questionId;

    @Column(name = "question")
    public String question;

    @Column(name = "category")
    public String category;

    @Column(name = "level")
    public String level;

    @Column(name = "description")
    public String description;


}
