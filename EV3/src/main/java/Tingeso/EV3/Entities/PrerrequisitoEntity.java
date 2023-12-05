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
@IdClass(PrerrequisitoEntity.class)
public class PrerrequisitoEntity implements Serializable {
    @Id
    private Long cod_asig;
    @Id
    private Long cod_prerreq;
}