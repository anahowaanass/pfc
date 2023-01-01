package football.gestion.pfc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import football.gestion.pfc.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
    
}
