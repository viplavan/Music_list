package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@ResponseBody
public class SkillsController {

     @GetMapping()
     public String skills() {
         String html = "<h1>Skills Tracker </h1>" +
                 "<h2>We have few skills i would like to learn. List:</h2>" +
                 "<ol>" +
                 "<li>Java</li>" +
                 "<li>JavaScript</li>" +
                 "<li>Tableau</li>" +
                 "</ol>" +
                 "<a href='/new'>Add your favorite Languages</a>";
         return html;
     }

    @GetMapping(value = "new")
    public String form(){
         String html = "<form method='post' action='languages'>" +
                 "Name:<br>" +
                 "<input type='text' name='name' />" +
                 "<br>My favorite language:<br>" +
                 "<select name= 'firstChoice'>" +
                 "<option value = 'Java'>Java</option>" +
                 "<option value = 'JavaScript'>JavaScript</option>" +
                 "<option value = 'Tableau'>Tableau</option>" +
                 "</select>" +
                 "<select name= 'secondChoice'>" +
                 "<option value = 'Java'>Java</option>" +
                 "<option value = 'JavaScript'>JavaScript</option>" +
                 "<option value = 'Tableau'>Tableau</option>" +
                 "</select>" +
                 "<select name= 'thirdChoice'>" +
                 "<option value = 'Java'>Java</option>" +
                 "<option value = 'JavaScript'>JavaScript</option>" +
                 "<option value = 'Tableau'>Tableau</option>" +
                 "</select>" +
                 "<input type='submit' value ='submit'>" +
                 "</form>";
         return html;
     }

    @PostMapping("/languages")
    public String formPage(@RequestParam String name, @RequestParam String firstChoice,@RequestParam String secondChoice,@RequestParam String thirdChoice){
         String html = "<h1>" + name + "</h1>" +
                 "<ol>" +
                 "<li>" + firstChoice + "</li>" +
                 "<li>" + secondChoice + "</li>" +
                 "<li>" + thirdChoice + "</li>" +
                 "</ol>";
         return html;
    }
}
