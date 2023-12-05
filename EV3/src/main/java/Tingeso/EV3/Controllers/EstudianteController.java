package Tingeso.EV3.Controllers;

import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;
    @GetMapping()
    public ResponseEntity<ArrayList<EstudianteEntity>> mostrarEstudiantes(){

        ArrayList<EstudianteEntity> listaEstudiantes= estudianteService.obtenerEstudiantes();

        if(listaEstudiantes == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaEstudiantes);
    }

    @PostMapping()
    public ResponseEntity<EstudianteEntity> crearEstudiante(@RequestBody EstudianteEntity estudiante){
        EstudianteEntity e = estudianteService.guardarEstudiante(estudiante);
        return ResponseEntity.ok(e);
    }
}
