package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface NotaRepository extends JpaRepository<NotaEntity,Long> {

}
