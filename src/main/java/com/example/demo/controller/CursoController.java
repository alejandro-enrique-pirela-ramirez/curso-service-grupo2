package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.dto.CursoDisponibilidadDTO;
import com.example.demo.useCase.ObtenerCursoUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final ObtenerCursoUseCase obtenerCursoUseCase;

    @GetMapping("/{idCurso}")
    public CursoDisponibilidadDTO obtener(@PathVariable Long idCurso) {
        return obtenerCursoUseCase.obtenerPorId(idCurso);
    }

    @GetMapping("/estudiante/{estudianteId}")
    public List<CursoDisponibilidadDTO> porEstudiante(@PathVariable Long estudianteId) {
        return obtenerCursoUseCase.listarPorEstudiante(estudianteId);
    }
}