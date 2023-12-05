package Tingeso.EV3.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private Long cod_carr; //código de la carrera
}