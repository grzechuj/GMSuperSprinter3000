package pl.codecool.gmsupersprinter3000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserStoryController {

    private final UserStoryService userStoryService;
    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
