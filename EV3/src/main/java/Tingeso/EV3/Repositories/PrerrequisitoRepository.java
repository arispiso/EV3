package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import Tingeso.EV3.Entities.PrerrequisitoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PrerrequisitoRepository extends JpaRepository<PrerrequisitoEntity,Long> {

    PrerrequisitoEntity findByCod_prerreq(int codigo);

    ArrayList<PrerrequisitoEntity> findByCod_asig(int codigo);

    ArrayList<PrerrequisitoEntity> findListByCod_asig(int codigoAsignatura);

}
