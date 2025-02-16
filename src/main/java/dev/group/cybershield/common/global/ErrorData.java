package dev.group.cybershield.common.global;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorData {
    private String errorCode;
    private Object errorMessage;
}
