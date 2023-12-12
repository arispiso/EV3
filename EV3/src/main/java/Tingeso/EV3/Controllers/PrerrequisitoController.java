package Tingeso.EV3.Controllers;

import Tingeso.EV3.Entities.PrerrequisitoEntity;
import Tingeso.EV3.Services.PrerrequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/prerequisitos")
@CrossOrigin(origins = "http://localhost:3000")
public class PrerrequisitoController {

    @Autowired
    PrerrequisitoService prerrequisitoService;
    @GetMapping()
    public ResponseEntity<ArrayList<PrerrequisitoEntity>> mostrarPrerrequisitos(){

        ArrayList<PrerrequisitoEntity> listaPrerrequisitos = prerrequisitoService.obtenerPrerrequisitos();

        if(listaPrerrequisitos == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaPrerrequisitos);
    }

    @PostMapping()
    public ResponseEntity<PrerrequisitoEntity> crearPrerrequisito(@RequestBody PrerrequisitoEntity prerrequisito){
        PrerrequisitoEntity p = prerrequisitoService.guardarPrerrequisito(prerrequisito);
        return ResponseEntity.ok(p);
    }

    @GetMapping("/byPrerequisitos/{codigoPrerequisitos}")
    public ResponseEntity<PrerrequisitoEntity> buscarPrerequisito(@PathVariable("codigoPrerequisitos") int codigoPrerequisitos){
        PrerrequisitoEntity newPrerequisito = prerrequisitoService.findRequisiteById(codigoPrerequisitos);
        if(newPrerequisito == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(newPrerequisito);
    }
}
