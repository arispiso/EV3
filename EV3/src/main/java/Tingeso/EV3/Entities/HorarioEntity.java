package Tingeso.EV3.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class HorarioEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_horario;
        @ManyToOne
        @JoinColumn(name = "codasig")
        private AsignaturaEntity asignatura;//llave foranea
        String dia;
        String modulo;
        LocalTime hora_inicio;
        LocalTime hora_final;

}

