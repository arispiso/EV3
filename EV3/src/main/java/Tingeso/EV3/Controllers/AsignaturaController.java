package Tingeso.EV3.Controllers;

import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/asignaturas")
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping
    public List<AsignaturaEntity> getAllAsignaturas() {

        return asignaturaService.getAllAsignaturas();
    }

    @GetMapping("/{id}")
    public Optional<AsignaturaEntity> getAsignaturaById(@PathVariable Long id) {
        return asignaturaService.getAsignaturaById(id);
    }
}
