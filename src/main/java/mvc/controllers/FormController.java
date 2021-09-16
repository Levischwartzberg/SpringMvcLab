package mvc.controllers;

import mvc.models.Form;
import mvc.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    @Autowired
    private FormRepository formRepository;

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formGet(Model model) {
//        model.addAttribute("unBoundTextBox", "Initial Value");
        model.addAttribute("form", new Form() );
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String  formPost(Model model,
                            @ModelAttribute("form") Form form) {
        formRepository.save(form);
        System.out.println(form.toString());
        return "form";
    }

    @ModelAttribute("multiSelectOptions")
    public List<String> getMultiSelectOptions() {
        List<String> multiSelectOptions = new ArrayList<String>();
        multiSelectOptions.add("Choice 1");
        multiSelectOptions.add("Choice 2");
        multiSelectOptions.add("Another Choice");
        return multiSelectOptions;
    }

    @ModelAttribute("radioOptions")
    public List<String> getRadioOptions() {
        List<String> radioOptions = new ArrayList<String>();
        radioOptions.add("Option 1");
        radioOptions.add("Option 2");
        radioOptions.add("Option 3");
        return radioOptions;
    }

    @ModelAttribute("checkBoxOptions")
    public List<String> getCheckBoxOptions() {
        List<String> checkBoxOptions = new ArrayList<String>();
        checkBoxOptions.add("Check Box 1");
        checkBoxOptions.add("Check Box 2");
        checkBoxOptions.add("Check Box 3");
        return checkBoxOptions;
    }


}
