package ma.projet.graph.entities;

import java.time.LocalDate;
import lombok.Data;

@Data
public class TrRequest {
    private Long compteId;
    private double montant;
    private LocalDate date;
    private TypeTr type;

}
