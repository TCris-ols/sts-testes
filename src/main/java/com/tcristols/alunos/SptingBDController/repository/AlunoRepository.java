package com.tcristols.alunos.SptingBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcristols.alunos.SptingBDController.model.Aluno;

@Repository("alunoRepository")
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
 
}
