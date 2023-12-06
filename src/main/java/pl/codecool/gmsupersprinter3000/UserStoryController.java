package pl.codecool.gmsupersprinter3000;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class UserStoryController {

    private final UserStoryService userStoryService;

    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<UserStory> userStories = userStoryService.getAllUserStories();
        model.addAttribute("userStories", userStories);
        return "index";
    }

    @GetMapping("/new-user-story")
    public String newUserStoryPage(UserStory userStory) {
        return "add_user_story";
    }
}
