package dev.group.cybershield.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    @Column(name = "status")
    private String status;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @PrePersist
    public void onCreation() {
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdation() {
        this.updatedOn = LocalDateTime.now();
    }

}
