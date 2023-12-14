package Tingeso.EV3.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "asigcursadas")
public class AsignaturaCursadaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asigcursadas_seq")
    @SequenceGenerator(name = "asigcursadas_seq", sequenceName = "asigcursadas_id_seq", allocationSize = 1)
    private Long idasigcursadas;
    @ManyToOne
    @JoinColumn(name = "rut")
    private EstudianteEntity estudiante;//llave foranea
    @ManyToOne
    @JoinColumn(name = "codasig")
    private AsignaturaEntity asignatura;//llave foranea
    private int vecescursada;
    private String estado;

}