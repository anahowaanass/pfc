package football.gestion.pfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import football.gestion.pfc.entities.Joueur;

import football.gestion.pfc.repositories.JoueurRepository;

@RestController
public class JoueurController {

    @Autowired
    JoueurRepository jr;

    @GetMapping("joueurs")
    public List<Joueur> getAllJoueurs(){
        return jr.findAll();
    }

}
