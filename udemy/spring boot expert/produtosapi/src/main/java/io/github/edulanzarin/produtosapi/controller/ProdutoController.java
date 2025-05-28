package io.github.edulanzarin.produtosapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.edulanzarin.produtosapi.model.Produto;
import io.github.edulanzarin.produtosapi.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Criar um produto
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    // Obter um produto por ID
    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // Deletar um produto por ID
    @DeleteMapping("{id}")
    public void deletarProduto(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    // Atualizar um produto por ID
    @PutMapping("{id}")
    public void atualizarProduto(@PathVariable("id") String id,
            @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscarProdutos(@RequestParam("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }

}