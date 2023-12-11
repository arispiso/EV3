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
@Table(name = "preRequisitos")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PrerrequisitoEntity {
    private int cod_asig;
    @Id
    private int cod_prerreq;
}