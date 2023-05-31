package br.com.etec.monique.cursoapi.repository.filter.curso;

import br.com.etec.monique.cursoapi.model.Curso;
import br.com.etec.monique.cursoapi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CursoRepositoryQuery {

  public Page<Curso> Filtrar(CursoFilter cursoFilter, Pageable pageable);
}
