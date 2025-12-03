package com.lucas.icons_api.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JogadorDTO {
    private Long id;
    private String nome;
    private String foto;
    private Long pais;
}
