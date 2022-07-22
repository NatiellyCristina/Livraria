package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Autor extends Pessoa {

    private Set<Livro> livros = new LinkedHashSet<>();

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }
    public  Set<Livro> getLivrosEscritos(){
        return  livros;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(livros, autor.livros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livros);
    }
}
