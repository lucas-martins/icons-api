package com.lucas.icons_api.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PageResponseDTO<T> {

    private int pagina;
    private int tamanho;
    private long totalRegistros;
    private int totalPaginas;
    private List<T> data;
}
