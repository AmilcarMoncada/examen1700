package hn.unah.lenguajes.examenprueba.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigocliente")
    private int codigoCliente;

    private String nombre;

    private String apellido;

    @Column(name="fechaingreso")
    private LocalDate fechaIngreso= LocalDate.now();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente tipoCliente;

}
