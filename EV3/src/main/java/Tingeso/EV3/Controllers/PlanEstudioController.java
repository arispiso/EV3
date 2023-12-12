package Tingeso.EV3.Controllers;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import Tingeso.EV3.Services.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/plan")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanEstudioController {

    @Autowired
    PlanEstudioService planEstudioService;
    @GetMapping()
    public ResponseEntity<ArrayList<PlanEstudioEntity>> mostrarPlanes(){

        ArrayList<PlanEstudioEntity> listaPlanes= planEstudioService.obtenerPlanesEstudio();

        if(listaPlanes == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaPlanes);
    }

    @PostMapping()
    public ResponseEntity<PlanEstudioEntity> crearPlan(@RequestBody PlanEstudioEntity plan){
        PlanEstudioEntity p = planEstudioService.guardarPlanEstudio(plan);
        return ResponseEntity.ok(p);
    }

    @GetMapping("/byPlan/{codigoPlan}")
    public ResponseEntity<PlanEstudioEntity> getPlanById(@PathVariable("codigoPlan") int codigoPlan){
        PlanEstudioEntity plan = planEstudioService.buscarPlanPorId(codigoPlan);
        if(plan == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(plan);
    }

    @GetMapping("/byAsignatura/{codigoAsignatura}")
    public ResponseEntity<PlanEstudioEntity> getPlanByCodigoAsignatura(@PathVariable("codigoAsignatura") int codigoAsignatura){
        PlanEstudioEntity plan = planEstudioService.buscarCodigoAsignatura(codigoAsignatura);
        if(plan == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(plan);
    }
}
