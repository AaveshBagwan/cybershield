package dev.group.cybershield.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @Column(name="user_id")
    private Integer userId;
    private String email;
    private String password;
    @Column(name="created_on")
    private LocalDateTime createdOn;
    @Column(name="updated_on")
    private LocalDateTime updatedOn;
    private String status;
}
