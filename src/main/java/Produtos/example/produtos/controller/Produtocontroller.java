package Produtos.example.produtos.controller;

import Produtos.example.produtos.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController    //vai receber requisiçoes
@RequestMapping("produtos") // vai dizer qual a url basica desse controller
public class Produtocontroller {

    @PostMapping   //criar recurso no servidor
    public void salvar(@RequestBody Produto produto ) {
        System.out.println("Produto recebido:  " + produto);
    }



}
