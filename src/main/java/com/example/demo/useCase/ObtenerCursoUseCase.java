package com.example.demo.useCase;

import java.util.List;

import com.example.demo.bean.dto.CursoDisponibilidadDTO;

public interface ObtenerCursoUseCase {

    CursoDisponibilidadDTO obtenerPorId(Long idCurso);
    List<CursoDisponibilidadDTO> listarPorEstudiante(Long estudianteId);
}