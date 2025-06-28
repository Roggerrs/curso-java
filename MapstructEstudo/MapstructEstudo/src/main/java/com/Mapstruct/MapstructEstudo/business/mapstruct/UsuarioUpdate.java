package com.Mapstruct.MapstructEstudo.business.mapstruct;

import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRequestDTO;
import com.Mapstruct.MapstructEstudo.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UsuarioUpdate {

    void updateUsuario(UsuarioRequestDTO dto, @MappingTarget UsuarioEntity entity);

}
