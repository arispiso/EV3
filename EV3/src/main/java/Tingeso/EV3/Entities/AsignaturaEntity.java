package Tingeso.EV3.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asignaturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignaturaEntity {
    @Id
    @Column(name = "codasig", nullable = false, unique = true)
    private Long codasig;

    @ManyToOne
    @JoinColumn(name = "codcarr")
    private CarreraEntity carrera;//llave foranea

    private String codplan;

    private String nombreasig;

    private Integer nivel;

    @Column(name = "cupo", nullable = true)
    private Integer cupo;

    @Column(name = "cantidad_estudiantes", nullable = true)
    private Integer cantidadestudiantes;

}