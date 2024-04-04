package hn.unah.lenguajes.examenprueba.demo.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examenprueba.demo.entities.TipoCliente;
import hn.unah.lenguajes.examenprueba.demo.repositories.TipoClienteRepository;
import hn.unah.lenguajes.examenprueba.demo.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

@Autowired
private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente CrearTipoCliente(TipoCliente tipoCliente) {
    return this.tipoClienteRepository.save(tipoCliente);
    }

    @Override
    public String EliminarTipoCliente(int id) {
      this.tipoClienteRepository.deleteById(id);
      return "Tipo Cliente Eliminado Correctamente";
    }
    
}
