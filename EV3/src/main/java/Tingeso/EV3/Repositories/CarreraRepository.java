package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.CarreraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CarreraRepository extends JpaRepository<CarreraEntity,Long> {

    CarreraEntity findByCodigo(int codigo);

}
