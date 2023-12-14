package Tingeso.EV3.Entities;

import jakarta.persistence.Column;
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
public class CarreraEntity {
    @Id
    @Column(name = "codcarr", nullable = false, unique = true)
    private Long codcarr;
    private String nombrecarrera;
}