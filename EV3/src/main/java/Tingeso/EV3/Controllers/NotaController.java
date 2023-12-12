package Tingeso.EV3.Controllers;


import Tingeso.EV3.Entities.NotaEntity;
import Tingeso.EV3.Services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/notas")
@CrossOrigin(origins = "http://localhost:3000")
public class NotaController {

    @Autowired
    NotaService notaService;
    @GetMapping()
    public ResponseEntity<ArrayList<NotaEntity>> mostrarNotas(){

        ArrayList<NotaEntity> listaNotas= notaService.obtenerNotas();

        if(listaNotas == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaNotas);
    }

    @PostMapping()
    public ResponseEntity<NotaEntity> crearNota(@RequestBody NotaEntity nota){
        NotaEntity e = notaService.guardarNota(nota);
        return ResponseEntity.ok(e);
    }
}
