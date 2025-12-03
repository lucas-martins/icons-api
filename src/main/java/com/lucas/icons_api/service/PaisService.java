package com.lucas.icons_api.service;

import com.lucas.icons_api.entity.Pais;
import com.lucas.icons_api.repository.PaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaisService {

    private final PaisRepository paisRepository;

    public List<Pais> listar() {
        return paisRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
    }
}
