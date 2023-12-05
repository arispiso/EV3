package Tingeso.EV3.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "carreras")
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    @Id
    private Long codigo;
    private String nombre;

}