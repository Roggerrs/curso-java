package com.Mapstruct.MapstructEstudo.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponseDTO {

    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String email;


}



