package football.gestion.pfc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import football.gestion.pfc.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    
}
