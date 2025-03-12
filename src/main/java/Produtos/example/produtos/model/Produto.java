package Produtos.example.produtos.model;

public class Produto {
        private String id;
        private String nome;
        private String descricao;
        private Double preço;


    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao'" + descricao + '\'' +
                ", preço=" + preço +
                '}';
    }
//spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

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
}

