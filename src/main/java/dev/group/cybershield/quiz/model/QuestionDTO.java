package dev.group.cybershield.quiz.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class QuestionDTO {

    @NotNull(message = "questionId is mandatory", groups = {QuizDTO.SubmitQuizGroup.class})
    private Integer questionId;

    private String question;

    private Integer correctOptionId;

    private Integer selectedOptionId;

    private List<OptionDTO> options;
}
