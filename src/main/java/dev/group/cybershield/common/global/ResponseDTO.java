package dev.group.cybershield.common.global;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO {
    private ResponseMessage responseMessage;
    private Object responseData;
    private ErrorData errorData;
}
