package Produtos.example.produtos.controller;
/// API
import Produtos.example.produtos.model.Produto;
import Produtos.example.produtos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController    //vai receber requisiçoes
@RequestMapping("produtos") // vai dizer qual a url basica desse controller
public class Produtocontroller {

    private ProdutoRepository produtoRepository;

    public Produtocontroller(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @PostMapping   //criar recurso no servidor
    public Produto salvar(@RequestBody Produto produto ) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;

    }


}
