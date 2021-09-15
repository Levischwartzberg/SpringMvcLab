package mvc.controllers;

import mvc.models.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formGet(Model model) {
//        model.addAttribute("unBoundTextBox", "Initial Value");
        model.addAttribute("form", new Form() );
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String  formPost(Model model,
                            @ModelAttribute("form") Form form) {
        System.out.println(form.getFormText() + " " + form.getFormPassword());
        return "form";
    }
}
