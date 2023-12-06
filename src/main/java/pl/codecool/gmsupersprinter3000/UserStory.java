package pl.codecool.gmsupersprinter3000;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserStory {

    @Size(min = 5, max = 50, message = "Title must be between 5 and 50 characters")
    private String title;
    @NotBlank(message = "Description cannot be empty")
    private String description;
    @NotNull
    private Status status;


    public enum Status {
        TODO, IN_PROGRESS, REVIEW, DONE, DELETED
    }
}
