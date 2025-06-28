package com.Mapstruct.MapstructEstudo.business.mapstruct;

import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRecord;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRequestDTO;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioResponseDTO;
import com.Mapstruct.MapstructEstudo.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id",  ignore = true)
    UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO paraResponseDTO(UsuarioEntity entity);

    UsuarioRecord paraUsuarioRecord(UsuarioEntity entity);

    List<UsuarioResponseDTO> paraListaUsuarioResponseDTO(List<UsuarioEntity> lista);


}