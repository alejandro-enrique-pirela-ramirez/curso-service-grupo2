package com.example.demo.bean.entity;

import com.example.demo.bean.enums.EstadoCurso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String nombre;

    private String seccion;

    private Integer creditos;

    private Double costoPorCredito;

    private Integer vacantesDisponibles;

    private String prerrequisito;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadoCurso estado;
}