package Tingeso.EV3.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "notas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(Nota.class)
public class Nota implements Serializable {

    @Id
    private int anio;
    @Id
    private int semestre;
    @Id
    private String cod_alumno;
    private int nivel;
    @Id
    private Long cod_asig;
    private double nota;
}