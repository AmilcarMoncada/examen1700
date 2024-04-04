package hn.unah.lenguajes.examenprueba.demo.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examenprueba.demo.entities.Vehiculo;
import hn.unah.lenguajes.examenprueba.demo.entities.TipoVehiculo;
import hn.unah.lenguajes.examenprueba.demo.repositories.ReservaRepository;
import hn.unah.lenguajes.examenprueba.demo.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes.examenprueba.demo.repositories.VehiculoRepository;
import hn.unah.lenguajes.examenprueba.demo.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

@Autowired
private TipoVehiculoRepository tipoVehiculoRepository;

@Autowired
private VehiculoRepository vehiculoRepository;

@Autowired
private ReservaRepository reservaRepository;

    @Override
    public TipoVehiculo CrearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String EliminarTipoVehiculo(int id) {
        TipoVehiculo TipoVehiculoEliminar =this.tipoVehiculoRepository.findById(id).get();
        List<Vehiculo> Vehiculos =this.vehiculoRepository.findByTipoVehiculo(TipoVehiculoEliminar);
        for(int i=0;Vehiculos.size()>i;i++){
           Vehiculo VehiculoEspecifico = Vehiculos.get(i);
           int idEspecifico = VehiculoEspecifico.getIdVehiculo();
          // this.reservaRepository.deleteByIdVehiculo(idEspecifico);
           this.vehiculoRepository.deleteById(idEspecifico);
        }
      //this.vehiculoRepository.deleteByTipoVehiculo(TipoVehiculoEliminar);
        this.tipoVehiculoRepository.deleteById(id);
        return "Tipo Vehiculo Eliminado Correctamente";
    }

 
    
}
