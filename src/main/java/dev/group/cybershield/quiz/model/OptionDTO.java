package dev.group.cybershield.quiz.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class OptionDTO {
    private Integer optionId;
    private String option;
}
