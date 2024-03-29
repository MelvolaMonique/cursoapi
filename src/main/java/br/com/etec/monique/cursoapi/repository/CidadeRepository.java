package br.com.etec.monique.cursoapi.repository;

import br.com.etec.monique.cursoapi.model.Cidade;
import br.com.etec.monique.cursoapi.repository.filter.cidade.CidadeRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer >, CidadeRepositoryQuery {

}
