package br.com.etec.monique.cursoapi.resource;

import br.com.etec.monique.cursoapi.model.Cidade;
import br.com.etec.monique.cursoapi.repository.CidadeRepository;
import br.com.etec.monique.cursoapi.repository.CursoRepository;
import br.com.etec.monique.cursoapi.repository.filter.CidadeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CidadeResource {

  @Autowired
  private CidadeRepository cidadeRepository;

  @GetMapping()
  public Page<Cidade> pesquisar(CidadeFilter cidadeFilter, Pageable pageable){
    return cidadeRepository.Filtrar(cidadeFilter,pageable);
  }
  @GetMapping("/todos")
  public List<Cidade> listartodascidades(){
    return cidadeRepository.findAll();
  }
}