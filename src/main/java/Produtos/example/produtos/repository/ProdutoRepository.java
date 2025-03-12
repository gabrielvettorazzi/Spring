package Produtos.example.produtos.repository;

import Produtos.example.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// CLASSES QUE VÃO FAZER OPERAÇOES NO BANCO DE DADOS

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
