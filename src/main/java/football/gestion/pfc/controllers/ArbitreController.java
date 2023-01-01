package football.gestion.pfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import football.gestion.pfc.entities.Arbitre;
import football.gestion.pfc.repositories.ArbitreRepository;

@RestController
public class ArbitreController {
    @Autowired
    ArbitreRepository ar;

    @GetMapping("arbitres")
    public List<Arbitre> getAllArbitres(){
        return ar.findAll();
    }

    
    
    
}
