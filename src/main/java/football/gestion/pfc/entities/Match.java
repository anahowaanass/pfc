package football.gestion.pfc.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMatch;
    LocalDate dateMatch;
    LocalTime heureMatch;
    Arbitre arbitre;
    
    @OneToMany(mappedBy = "match")
    List<Equipe> equipes;

    
}
