package football.gestion.pfc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import football.gestion.pfc.entities.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{
    
}
