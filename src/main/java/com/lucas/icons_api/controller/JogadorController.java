package com.lucas.icons_api.controller;

import com.lucas.icons_api.dto.JogadorDTO;
import com.lucas.icons_api.service.JogadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService jogadorService;

    @GetMapping("/time/{timeId}")
    public List<JogadorDTO> listarPorTime(@PathVariable Long timeId) {
        return jogadorService.listarPorTime(timeId);
    }

    @GetMapping("/pais/{paisId}")
    public List<JogadorDTO> listarPorPais(@PathVariable Long paisId) {
        return jogadorService.listarPorPais(paisId);
    }
}
