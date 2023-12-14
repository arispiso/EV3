package Tingeso.EV3.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estudiantes")
public class EstudianteEntity {
    @Id
    @Column(name = "rut", nullable = false, unique = true)
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    @OneToOne
    @JoinColumn(name = "codcarr")
    private CarreraEntity carrera;//llave foranea
    @Column(name = "cantidadasignaturas", nullable = true)
    private Integer cantidadasig;
    @Column(name = "nivel", nullable = true)
    private Integer nivel;
    @Column(name = "situacion", nullable = true)
    private String situacion;

}