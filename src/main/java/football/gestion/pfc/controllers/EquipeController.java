package football.gestion.pfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import football.gestion.pfc.entities.Equipe;
import football.gestion.pfc.repositories.EquipeRepository;

@RestController
public class EquipeController {

    @Autowired
    EquipeRepository er;

    @GetMapping("equipes")
    public List<Equipe> getAllEquipes(){
        return er.findAll();
    }
    
}
