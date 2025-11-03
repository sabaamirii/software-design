package sab.amiri.tarahi.narm.afzar.first.HM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String myName() {
        return "Melina Sharafi - 40113011013";
    }

}
