package football.gestion.pfc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import football.gestion.pfc.entities.Stade;


public interface StadeRepository extends JpaRepository<Stade, Long>{
    
}
