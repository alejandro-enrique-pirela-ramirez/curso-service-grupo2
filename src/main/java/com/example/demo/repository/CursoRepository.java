package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}