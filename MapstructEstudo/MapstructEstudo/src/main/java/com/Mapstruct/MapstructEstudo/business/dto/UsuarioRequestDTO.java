package com.Mapstruct.MapstructEstudo.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class UsuarioRequestDTO {


    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String email;
    @JsonProperty(required = true)
    private String senha;

}
