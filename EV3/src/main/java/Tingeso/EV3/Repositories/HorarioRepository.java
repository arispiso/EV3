package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.HorarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<HorarioEntity, Long> {
    HorarioEntity findByBloque(int bloque);

    HorarioEntity findByIdHorario(int idHorario);

    HorarioEntity findDiaByDiaSemana(String diaSemana);
}
