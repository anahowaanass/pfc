package football.gestion.pfc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import football.gestion.pfc.entities.Arbitre;


public interface ArbitreRepository extends JpaRepository<Arbitre, Long> {
    
}
