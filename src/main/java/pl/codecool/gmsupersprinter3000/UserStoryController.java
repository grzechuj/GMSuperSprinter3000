package pl.codecool.gmsupersprinter3000;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
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

    @PostMapping("/new-user-story")
    public String saveNewUserStory(@Valid UserStory userStory, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add_user_story";
        }
        userStoryService.saveNewUserStory(userStory);
        return "redirect:/";
    }

    @ModelAttribute("userStoryStatuses")
    public List<String> userStoryStatuses() {
        return Arrays.stream(UserStory.Status.values())
                .map(Enum::name)
                .toList();
    }
}
