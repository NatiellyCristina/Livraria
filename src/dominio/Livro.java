package dominio;

import java.time.LocalDate;
import java.util.Set;

public class Livro {
    private String titulo;
    private int paginas;
    private LocalDate dataLancamento;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", paginas='" + paginas + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
