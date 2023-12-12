package Tingeso.EV3.Controllers;

import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Repositories.CarreraRepository;
import Tingeso.EV3.Services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/carreras")
public class CarreraController {

    @Autowired
    CarreraService carreraService;

    @GetMapping()
    public ResponseEntity<ArrayList<CarreraEntity>> mostrarCarreras(){

        ArrayList<CarreraEntity> listaCarreras = carreraService.obtenerCarreras();

        if(listaCarreras == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaCarreras);
    }

    @PostMapping()
    public ResponseEntity<CarreraEntity> crearCarrera(@RequestBody CarreraEntity carrera){
        CarreraEntity c = carreraService.guardarCarrera(carrera);
        return ResponseEntity.ok(c);
    }

    @GetMapping("/byCarrera/{codigoCarrera}")
    public ResponseEntity<CarreraEntity> getCarreraByCodigo(@PathVariable("codigoCarrera") int codigoCarrera){
        CarreraEntity newCarrera = carreraService.obtenerCarreraPorId(codigoCarrera);
        if(newCarrera == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(newCarrera);
    }

}
