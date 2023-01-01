package football.gestion.pfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import football.gestion.pfc.entities.Match;

import football.gestion.pfc.repositories.MatchRepository;

@RestController
public class MatchController {

    @Autowired
    MatchRepository mr;

    @GetMapping("matchs")
    public List<Match> getAllMatchs(){
        return mr.findAll();
    }

}

