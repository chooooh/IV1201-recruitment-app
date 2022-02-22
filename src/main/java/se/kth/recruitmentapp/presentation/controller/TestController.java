package se.kth.recruitmentapp.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.kth.recruitmentapp.domain.IllegalCompetenceException;
import se.kth.recruitmentapp.service.PersonService;

import static se.kth.recruitmentapp.presentation.controller.LoginController.LOGIN_PAGE_URL;


@RequestMapping("/test")
@Controller
public class TestController {
    @Autowired
    private PersonService personService;

    @GetMapping("/competence")
    public String showTestCompetencePage(Model model) throws IllegalCompetenceException {
        personService.saveCompetenceTest();
        return LOGIN_PAGE_URL;
    }
}