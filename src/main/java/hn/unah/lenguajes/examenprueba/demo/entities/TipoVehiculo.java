package hn.unah.lenguajes.examenprueba.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tipovehiculo")
public class TipoVehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipovehiculo")
    private int idTipoVehiculo;

    private String descripcion;

    @Column(name="precioxhora")
    private Double precioXhora;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Vehiculo> vehiculo;
}
