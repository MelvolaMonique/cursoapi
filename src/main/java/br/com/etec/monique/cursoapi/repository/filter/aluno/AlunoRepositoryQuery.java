package br.com.etec.monique.cursoapi.repository.filter.aluno;

import br.com.etec.monique.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.monique.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoRepositoryQuery {

  public Page<AlunoDto> filtrar (AlunoFilter alunoFilter, Pageable pageable);


}


