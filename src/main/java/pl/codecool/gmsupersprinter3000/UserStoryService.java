package pl.codecool.gmsupersprinter3000;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static pl.codecool.gmsupersprinter3000.UserStory.Status.IN_PROGRESS;
import static pl.codecool.gmsupersprinter3000.UserStory.Status.TODO;

@Service
public class UserStoryService {

    private final List<UserStory> userStories;

    public UserStoryService() {
        userStories = new ArrayList<>();
        userStories.add(new UserStory("us title", "us desc", TODO));
        userStories.add(new UserStory("us title 1", "us desc 1", IN_PROGRESS));
    }

    public List<UserStory> getAllUserStories() {
        return userStories;
    }
}
