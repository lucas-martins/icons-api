package com.lucas.icons_api.controller;

import com.lucas.icons_api.dto.PageResponseDTO;
import com.lucas.icons_api.dto.TimeDTO;
import com.lucas.icons_api.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/times")
@RequiredArgsConstructor
public class TimeController {

    private final TimeService timeService;

    @GetMapping
    public PageResponseDTO<TimeDTO> listar(
            @RequestParam(name = "page", defaultValue = "1") int pagina) {
        return timeService.listarPaginado(pagina);
    }
}
