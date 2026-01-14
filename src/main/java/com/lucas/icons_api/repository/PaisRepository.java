package com.lucas.icons_api.repository;

import com.lucas.icons_api.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    @Query("""
        select p
        from Pais p
        order by function('unaccent', p.nome)
    """)
    List<Pais> findAllOrderByNomeSemAcento();
}
