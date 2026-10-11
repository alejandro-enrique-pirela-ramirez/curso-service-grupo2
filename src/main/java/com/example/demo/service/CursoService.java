package com.example.demo.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.bean.dto.CursoDisponibilidadDTO;
import com.example.demo.bean.entity.EstudianteCurso;
import com.example.demo.bean.mapper.CursoMapper;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.EstudianteCursoRepository;
import com.example.demo.useCase.ObtenerCursoUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CursoService implements ObtenerCursoUseCase {

    private final CursoRepository cursoRepository;
    private final EstudianteCursoRepository estudianteCursoRepository;
    private final CursoMapper mapper;

    @Override
    public CursoDisponibilidadDTO obtenerPorId(Long idCurso) {
        return cursoRepository.findById(idCurso)
                .map(mapper::toDto)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Curso no encontrado: " + idCurso));
    }

    @Override
    public List<CursoDisponibilidadDTO> listarPorEstudiante(Long estudianteId) {
        return estudianteCursoRepository.findByEstudianteId(estudianteId)
                .stream()
                .map(EstudianteCurso::getCurso)
                .map(mapper::toDto)
                .toList();
    }
}