package Tingeso.EV3.Controllers;
import Tingeso.EV3.Entities.HorarioEntity;
import Tingeso.EV3.Services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/horarios")
@CrossOrigin(origins = "http://localhost:3000")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarHorario(@RequestBody HorarioEntity horario) {
        //  verificar que la asignatura no sea nula
        if (horario.getAsignatura() == null || horario.getAsignatura().getCodasig() == null) {
            // Manejo de error, por ejemplo, lanzar una excepción o devolver un ResponseEntity con un mensaje de error.
            return ResponseEntity.badRequest().body("La asignatura no puede ser nula.");
        }

        // Guardar el horario
        HorarioEntity horarioGuardado = horarioService.guardarHorario(horario);
        return ResponseEntity.ok(horarioGuardado);
    }
    @GetMapping("/modulos")
    public ArrayList<String> getModulos() {
        return horarioService.obtenerModulos();
    }

    @GetMapping
    public List<HorarioEntity> obtenerHorarios() {
        return horarioService.obtenerHorarios();
    }
}
