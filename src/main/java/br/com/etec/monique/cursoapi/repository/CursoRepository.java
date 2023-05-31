package br.com.etec.monique.cursoapi.repository;

import br.com.etec.monique.cursoapi.model.Curso;
import br.com.etec.monique.cursoapi.repository.filter.curso.CursoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>, CursoRepositoryQuery {
}
