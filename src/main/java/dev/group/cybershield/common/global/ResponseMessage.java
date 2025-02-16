package dev.group.cybershield.common.global;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
public class ResponseMessage {
    private Timestamp landingTime;
    private Timestamp responseTime;
    private String status;
    private HttpStatus httpStatus;
    private String endpoint;
}
