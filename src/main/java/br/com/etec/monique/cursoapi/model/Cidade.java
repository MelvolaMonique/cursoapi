package br.com.etec.monique.cursoapi.model;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cidade")

public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomecidade;

    private Spring uf;
    @OneToMany(mappedBy = "cidade")
    private List<Aluno> alunoscidade = new ArrayList<>();

  public Spring getUf() {
    return uf;
  }

  public void setUf(Spring uf) {
    this.uf = uf;
  }

  public List<Aluno> getAlunoscidade() {
    return alunoscidade;
  }

  public void setAlunoscidade(List<Aluno> alunoscidade) {
    this.alunoscidade = alunoscidade;
  }

  public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return id.equals(cidade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
