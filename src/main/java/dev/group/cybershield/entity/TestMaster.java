package dev.group.cybershield.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "test_master")
@Entity
public class TestMaster extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "user_id")
    private Integer userId;

    private Integer score; // can be null

    private String category;

    private String level;

    @Column(name = "test_status")
    private String testStatus;


}
