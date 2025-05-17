package io.github.edulanzarin.produtosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.edulanzarin.produtosapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);

}
