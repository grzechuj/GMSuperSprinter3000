package pl.codecool.gmsupersprinter3000;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserStory {

    private String title;
    private String description;
    private Status status;


    public enum Status {
        TODO, IN_PROGRESS, REVIEW, DONE
    }
}
