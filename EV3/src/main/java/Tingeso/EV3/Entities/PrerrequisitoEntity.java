package Tingeso.EV3.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "prerrequisitos")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PrerrequisitoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprerrequisito;
    @ManyToOne
    @JoinColumn(name = "codasig")
    private AsignaturaEntity asignatura;//llave foranea
    private int codprerrequisito;
}