package com.example.demo.bean.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.bean.dto.CursoDisponibilidadDTO;
import com.example.demo.bean.entity.Curso;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(target = "idCurso", source = "id")
    @Mapping(target = "codigoCurso", source = "codigo")
    @Mapping(target = "nombreCurso", source = "nombre")
    @Mapping(target = "estadoCurso", source = "estado")
    CursoDisponibilidadDTO toDto(Curso curso);
}