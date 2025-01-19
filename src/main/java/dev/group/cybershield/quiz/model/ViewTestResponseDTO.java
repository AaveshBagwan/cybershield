package dev.group.cybershield.quiz.model;

import lombok.Data;

import java.util.List;

@Data
public class ViewTestResponseDTO {
    private Integer questionId;
    private String questionName;
    private Integer selectedOptionId;
    private Integer correctOptionId;
    List<OptionDTO> options;

}
