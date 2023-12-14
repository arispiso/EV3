package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity,Long> {

    Optional<AsignaturaEntity> findByCodasig(Long codAsignatura);

    List<AsignaturaEntity> findByCarreraCodcarrAndNivel(Long codCarrera, Integer nivel);

}