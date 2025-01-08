package com.laarcourier.laarcourier.Repository;

import com.laarcourier.laarcourier.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);

    Usuario findByEmailAndPassword(String email, String password);
}
