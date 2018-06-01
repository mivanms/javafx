package com.jfxtext.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfxtext.model.dto.TipoVehiculoDto;

public interface TipoVehiculoService {
    /**
     * Obtiene lista de objetos tipos de vehiculos
     *
     * @return lista proveedores externos para lugar entrega
     */
    List<TipoVehiculoDto> getTiposVehiculos();
}
