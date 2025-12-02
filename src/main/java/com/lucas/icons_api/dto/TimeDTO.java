package com.lucas.icons_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeDTO {
    private Long id;
    private String nome;
    private String escudo;
    private Long idPais;
}
