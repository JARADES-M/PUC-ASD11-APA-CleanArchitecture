package domain;

import domain.valueObjects.ISBN;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Livro {
    String nome;
    ISBN ISBN;
    BigDecimal preco;
    List<Autor> autores;

    public Livro(String nome, domain.valueObjects.ISBN ISBN, BigDecimal preco, List<Autor> autores) {
        this.nome = nome;
        this.ISBN = ISBN;
        this.preco = preco;
        this.autores = autores;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return ISBN.equals(livro.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
