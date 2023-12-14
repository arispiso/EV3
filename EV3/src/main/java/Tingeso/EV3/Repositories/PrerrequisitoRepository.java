package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.PrerrequisitoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PrerrequisitoRepository extends JpaRepository<PrerrequisitoEntity,Long> {

    List<PrerrequisitoEntity> findByAsignatura(AsignaturaEntity asignatura);

    List<PrerrequisitoEntity> findByAsignatura_codasig(Long codAsignatura);
}
