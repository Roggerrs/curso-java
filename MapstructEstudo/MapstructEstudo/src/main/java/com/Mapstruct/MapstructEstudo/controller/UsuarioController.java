package com.Mapstruct.MapstructEstudo.controller;


import com.Mapstruct.MapstructEstudo.business.UsuarioService;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRecord;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioRequestDTO;
import com.Mapstruct.MapstructEstudo.business.dto.UsuarioResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;


    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> salvaUsuario(@RequestBody UsuarioRequestDTO dto){
        return ResponseEntity.ok(service.salvaUsuario(dto));
    }

    @GetMapping("/{email}")
    public ResponseEntity<UsuarioRecord> buscaUsuarioPorEmail(@PathVariable("email") String email){
        return ResponseEntity.ok(service.buscaUsuarioPorEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> buscaTodosUsuarios(){
        return ResponseEntity.ok(service.buscaTodosUsuarios());
    }

    @PutMapping
    public ResponseEntity<UsuarioResponseDTO> updateUsuario(@RequestBody UsuarioRequestDTO dto,
                                                            @RequestParam("id") Long id){
        return ResponseEntity.ok(service.updateUsuario(dto, id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletaUsuario(@RequestParam("email") String email){
        service.deletaUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

}