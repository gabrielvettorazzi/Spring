package Produtos.example.produtos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

//MODELO DE NEGOCIOS
@Entity
public class Produto {

        @Column(name = "id")
        private String id;
        @Column
        private String nome;
        @Column
        private String descricao;
        @Column
        private Double preço;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descricao;
    }


    public void setDescrição(String descrição) {
        descricao = descrição;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
    @Override
    public String toString() {
        return "produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao'" + descricao + '\'' +
                ", preço=" + preço +
                '}';
    }

}

