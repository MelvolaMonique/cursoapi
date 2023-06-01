package br.com.etec.monique.cursoapi.repository.filter.cidade;

import br.com.etec.monique.cursoapi.model.Cidade;
import br.com.etec.monique.cursoapi.repository.filter.CidadeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

  public Page<Cidade> Filtrar(CidadeFilter cidadeFilter, Pageable pageable);
}
