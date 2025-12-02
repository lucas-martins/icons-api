package com.lucas.icons_api.service;

import com.lucas.icons_api.config.AppProperties;
import com.lucas.icons_api.dto.PageResponseDTO;
import com.lucas.icons_api.dto.TimeDTO;
import com.lucas.icons_api.entity.Time;
import com.lucas.icons_api.repository.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeService {

    private final TimeRepository timeRepository;
    private final AppProperties appProperties;

    public PageResponseDTO<TimeDTO> listarPaginado(int paginaRequisitada) {
        int tamanhoPagina = appProperties.getTamanhoPagina();

        int paginaInterna = paginaRequisitada - 1;
        if (paginaInterna < 0) paginaInterna = 0;

        PageRequest pageRequest = PageRequest.of(
                paginaInterna,
                tamanhoPagina,
                Sort.by("nome").ascending()
        );

        Page<Time> pagina = timeRepository.findAll(pageRequest);

        return PageResponseDTO.<TimeDTO>builder()
                .pagina(paginaRequisitada)
                .tamanho(tamanhoPagina)
                .totalRegistros(pagina.getTotalElements())
                .totalPaginas(pagina.getTotalPages())
                .data(
                        pagina.getContent()
                                .stream()
                                .map(this::toDTO)
                                .toList()
                )
                .build();
    }


    private TimeDTO toDTO(Time time) {
        return TimeDTO.builder()
                .id(time.getId())
                .nome(time.getNome())
                .escudo(time.getEscudo())
                .idPais(time.getPais() != null ? time.getPais().getId() : null)
                .build();
    }
}
