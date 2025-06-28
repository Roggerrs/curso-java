package com.Mapstruct.MapstructEstudo.business;


import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRecord;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRequestDTO;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioResponseDTO;
import com.Mapstruct.MapstructEstudo.business.mapstruct.UsuarioMapper;
import com.Mapstruct.MapstructEstudo.business.mapstruct.UsuarioUpdate;
import com.Mapstruct.MapstructEstudo.infrastructure.entities.UsuarioEntity;
import com.Mapstruct.MapstructEstudo.infrastructure.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;
    private final UsuarioUpdate usuarioUpdate;

    public UsuarioResponseDTO salvaUsuario(UsuarioRequestDTO request){

        return mapper.paraResponseDTO(
                repository.save(
                        mapper.paraUsuarioEntity(request)));

    }

    public List<UsuarioResponseDTO> buscaTodosUsuarios(){
        return mapper.paraListaUsuarioResponseDTO(
                repository.findAll()
        );
    }

    public UsuarioRecord buscaUsuarioPorEmail(String email){
        return mapper.paraUsuarioRecord(
                repository.findByEmail(email));
    }

    public UsuarioResponseDTO updateUsuario(UsuarioRequestDTO dto, Long id){
        UsuarioEntity entity = repository.findById(id).orElseThrow();
        usuarioUpdate.updateUsuario(dto, entity);

        return mapper.paraResponseDTO(repository.save(entity));

    }

    public void deletaUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }
}