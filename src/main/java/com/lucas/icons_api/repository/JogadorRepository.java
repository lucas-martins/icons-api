package com.lucas.icons_api.repository;

import com.lucas.icons_api.entity.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    @Query("""
           select distinct jt.jogador
           from JogadorTime jt
           where jt.time.id = :timeId
           order by jt.jogador.nome
           """)
    List<Jogador> listarPorTime(@Param("timeId") Long timeId);

    @Query("""
       select j
       from Jogador j
       where j.pais.id = :paisId
       order by j.nome
       """)
    List<Jogador> listarPorPais(@Param("paisId") Long paisId);

}
