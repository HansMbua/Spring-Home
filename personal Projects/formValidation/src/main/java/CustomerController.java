import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class CustomerController {


    //display form
    @RequestMapping("/showform")
    public String showform(Model model){
        //setting up the model
        User theUser = new User();
        model.addAttribute("User",theUser);

        return "login";
    }
}
