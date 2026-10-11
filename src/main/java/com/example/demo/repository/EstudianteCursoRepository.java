package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.entity.EstudianteCurso;

public interface EstudianteCursoRepository extends JpaRepository<EstudianteCurso, Long> {

    @EntityGraph(attributePaths = "curso")
    List<EstudianteCurso> findByEstudianteId(Long estudianteId);
}