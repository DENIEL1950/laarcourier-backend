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

public class Paquete implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    private String remitente;
    private String descripcion;
    private String estado;
    private Float precio;
    private Double peso;
    private Float costoDeEnvio;
    private String direccionDeEnvio;

}
