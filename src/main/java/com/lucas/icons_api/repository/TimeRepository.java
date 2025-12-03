package com.lucas.icons_api.repository;

import com.lucas.icons_api.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeRepository extends JpaRepository<Time, Long> {

    List<Time> findByPaisIdOrderByNomeAsc(Long paisId);
}
