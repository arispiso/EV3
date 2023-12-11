package Tingeso.EV3.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "planesDeEstudio")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class PlanEstudioEntity {
    private int cod_carr;
    @Id
    private int cod_plan;
    private int nivel;
    private int cod_asig;
    private String nom_asig;
}
