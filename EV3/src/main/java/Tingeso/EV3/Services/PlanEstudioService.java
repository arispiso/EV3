package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Entities.PlanEstudioEntity;
import Tingeso.EV3.Repositories.PlanEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlanEstudioService {

    @Autowired
    private PlanEstudioRepository planEstudioRepository;

    public ArrayList<PlanEstudioEntity> obtenerPlanesEstudio(){
        return (ArrayList<PlanEstudioEntity>) planEstudioRepository.findAll();
    }

    public PlanEstudioEntity guardarPlanEstudio(PlanEstudioEntity plan) {
        return planEstudioRepository.save(plan);
    }

}
