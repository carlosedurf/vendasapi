package br.edu.infnet.vendasapi.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.vendasapi.model.domain.Informacao;

public interface InformacaoRepository extends CrudRepository<Informacao, Integer> {
}
