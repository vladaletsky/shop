package com.wladyslaw.shop.controller;

import com.wladyslaw.shop.model.First;
import com.wladyslaw.shop.model.Person;
import com.wladyslaw.shop.service.FirstI;
import com.wladyslaw.shop.service.PersonForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private FirstI firstService;

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);

        return message;
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
    public String showAddPersonPage(Model model) {

        PersonForm personForm = new PersonForm ();
        model.addAttribute("personForm", personForm);

        return "addPerson";
    }

    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    public String savePerson(Model model, //
                             @ModelAttribute("personForm") PersonForm personForm) {

        String firstName = personForm.getFirstName();
        String lastName = personForm.getLastName();

        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            Person newPerson = new Person(firstName, lastName);
            persons.add(newPerson);

            return "redirect:/personList";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }

    @GetMapping("/search")
    public String first(@RequestBody First first) {
        return "hello " + firstService.fullName (first);
    }

    /*@PostMapping("/user")
    public String user(){
        return user ();
    }*/

    /*@GetMapping("/")
    public String second() {
        return "default";
    }*/


    /*@DeleteMapping ("/")
    public String delete() {
        return "delete";
    }*/

}
