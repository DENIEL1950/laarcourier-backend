package com.laarcourier.laarcourier.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
@Entity
@Table
@NoArgsConstructor
@Getter
@Setter

public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer cedula;
    private String nombreUsuario;
    private String direccion;
    private Integer codigoPostal;
    private Integer telefono;
    private String email;
    private String password;
    private String pais;
    private String ciudad;
    private String provincia;

}
