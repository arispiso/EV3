package Tingeso.EV3.Entities;


import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "planesDeEstudio")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class PlanEstudio  {
    private Long cod_carr;
    private String cod_plan;
    private int nivel;
    @Id
    private Long cod_asig;
    private String nom_asig;
    private String horarios;
}
