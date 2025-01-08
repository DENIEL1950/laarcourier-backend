package com.laarcourier.laarcourier.Controller;

import com.laarcourier.laarcourier.Entity.Paquete;
import com.laarcourier.laarcourier.Repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PaqueteController {

    @Autowired
    private PaqueteRepository repository;

    @GetMapping("/paquetes")
    @ResponseStatus(HttpStatus.OK)
    public List<Paquete> getPaqueteRepository() {
        return repository.findAll();
    }

    @GetMapping("/paquetes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Paquete getPaqueteRepositoryById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/paquetes/save")
    @ResponseStatus(HttpStatus.OK)
    public void crearPaquete(@RequestBody Paquete paquete) {
        repository.save(paquete);
    }

    @DeleteMapping("/paquetes/del")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarPaquete(@RequestBody Paquete paquete) {
        repository.delete(paquete);
    }
}
