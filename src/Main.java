import dominio.Autor;
import dominio.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("Design Patterns com Java");
        livro1.setDataLancamento(LocalDate.of(2018,5,12));
        livro1.setPaginas(356);

        System.out.println(livro1);


        Autor autor1 = new Autor();
        autor1.setCpf("803.557.570-87");
        autor1.setNome("Eduardo Guerra");
        autor1.setDataNascimento(LocalDate.of(1975,6,20));
        autor1.adicionarLivro(livro1);

        System.out.println("Livros Inscritos pelo Autor " + autor1.getNome());
        System.out.println(autor1.getLivrosEscritos());


    }
}
