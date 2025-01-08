package com.laarcourier.laarcourier.Controller;

import com.laarcourier.laarcourier.Entity.Usuario;
import com.laarcourier.laarcourier.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/users/login")
    public ResponseEntity<Object> loginUser(@RequestBody HashMap<String, Object> body) {
        String email = (String) body.get("email");
        String password = (String) body.get("password");

        Usuario usuario = repository.findByEmailAndPassword(email, password); // Método personalizado en el repositorio
        if (usuario != null) {
            return ResponseEntity.ok(usuario); // Devuelve el usuario encontrado
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Wrong email or password");
        }
    }


    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getUsuarioRepository() {
        return repository.findAll();
    }

    @GetMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario getUsuarioRepository(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/usuarios/save")
    @ResponseStatus(HttpStatus.OK)
    public void crearUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @DeleteMapping("/usuarios/del")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarUsuario(@RequestBody Usuario usuario) {
        repository.delete(usuario);
    }
}
