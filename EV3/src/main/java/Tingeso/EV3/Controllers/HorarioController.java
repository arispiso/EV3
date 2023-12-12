package Tingeso.EV3.Controllers;
import Tingeso.EV3.Entities.HorarioEntity;
import Tingeso.EV3.Services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/horarios")
@CrossOrigin(origins = "http://localhost:3000")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @GetMapping()
    public ResponseEntity<ArrayList<HorarioEntity>> getAllHorarios(){
        ArrayList<HorarioEntity> Horarios = horarioService.getAllHorarios();
        if(Horarios == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(Horarios);
    }

    @PostMapping()
    public ResponseEntity<?> crearHorario(@RequestBody HorarioEntity horario) {
        HorarioEntity newHorario = horarioService.crearHorario(horario);
        return ResponseEntity.ok(newHorario);
    }
    @GetMapping("/ByBloque/{bloque}")
    public ResponseEntity<HorarioEntity> getBloques(@PathVariable("bloque") int bloque){
        HorarioEntity horario = horarioService.buscarHorarioPorBloque(bloque);
        if(horario == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(horario);
    }

    @GetMapping("/ByIdHorario/{idHorario}")
    public ResponseEntity<HorarioEntity> getHorario(@PathVariable("idHorario") int idHorario){
        HorarioEntity horario = horarioService.buscarPorIdHorario(idHorario);
        if(horario == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(horario);
    }
}
