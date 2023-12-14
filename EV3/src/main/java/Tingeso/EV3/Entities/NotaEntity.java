package Tingeso.EV3.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "notas")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota;

    @ManyToOne
    @JoinColumn(name = "rut")
    private EstudianteEntity estudiante;//llave foranea

    @ManyToOne
    @JoinColumn(name = "codasig")
    private AsignaturaEntity asignatura;//llave foranea
    int año;
    int semestre;
    float nota;
}