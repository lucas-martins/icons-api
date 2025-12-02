package com.lucas.icons_api.controller;

import com.lucas.icons_api.entity.Pais;
import com.lucas.icons_api.service.PaisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
@RequiredArgsConstructor
public class PaisController {

    private final PaisService paisService;

    @GetMapping
    public List<Pais> listar() {
        return paisService.listar();
    }
}
