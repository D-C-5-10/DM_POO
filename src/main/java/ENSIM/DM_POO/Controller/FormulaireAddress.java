package ENSIM.DM_POO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormulaireAddress {

    @GetMapping("/adresse")
    public String requestForm(Model model) {
        return "adresse";
    }
}
