package dev.group.cybershield.login.model;

import lombok.Data;

@Data
public class UserDTO {
    private Integer userId;
    private String email;
    private String password;
}
