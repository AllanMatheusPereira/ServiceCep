package br.unipar.programacaointernet.servicecep.demo.dao;

import br.unipar.programacaointernet.servicecep.demo.model.Endereco;

import java.util.List;

public interface EnderecoDAO {

    void save(Endereco endereco);
    void update(Endereco endereco);
    void delete(Endereco endereco);

    Endereco findById(Long id);
    List<Endereco> findAll();

    Endereco findByCep(String cep);
}
