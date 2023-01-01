package football.gestion.pfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import football.gestion.pfc.entities.Stade;

import football.gestion.pfc.repositories.StadeRepository;

@RestController
public class StadeController {

    @Autowired
    StadeRepository sr;

    @GetMapping("stades")
    public List<Stade> getAllStades(){
        return sr.findAll();
    }

}
