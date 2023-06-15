package br.com.etec.monique.cursoapi.repository;

import br.com.etec.monique.cursoapi.model.Aluno;
import br.com.etec.monique.cursoapi.repository.filter.aluno.AlunoRepositoryImpl;
import br.com.etec.monique.cursoapi.repository.filter.aluno.AlunoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> , AlunoRepositoryQuery{
}
