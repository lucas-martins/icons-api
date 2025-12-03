package com.lucas.icons_api.service;

import com.lucas.icons_api.dto.JogadorDTO;
import com.lucas.icons_api.entity.Jogador;
import com.lucas.icons_api.repository.JogadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    public List<JogadorDTO> listarPorTime(Long timeId) {
        return jogadorRepository.listarPorTime(timeId)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public List<JogadorDTO> listarPorPais(Long paisId) {
        return jogadorRepository.listarPorPais(paisId)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    private JogadorDTO toDTO(Jogador j) {
        return JogadorDTO.builder()
                .id(j.getId())
                .nome(j.getNome())
                .foto(j.getFoto())
                .pais(j.getPais() != null ? j.getPais().getId() : null)
                .build();
    }
}
