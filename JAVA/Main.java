// Classe base
public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private int numeroPaginas;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String genero, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos de acesso (getters e setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString para representação em string do objeto
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}

// Classe derivada (herança)
public class LivroDigital extends Livro {
    // Atributos específicos para livros digitais
    private String formato;
    private double tamanhoArquivo;

    // Construtor
    public LivroDigital(String titulo, String autor, int anoPublicacao, String genero, int numeroPaginas, String formato, double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, genero, numeroPaginas);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Métodos de acesso (getters e setters) para atributos específicos
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Método toString para representação em string do objeto (incluindo atributos da classe base)
    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", anoPublicacao=" + getAnoPublicacao() +
                ", genero='" + getGenero() + '\'' +
                ", numeroPaginas=" + getNumeroPaginas() +
                ", formato='" + formato + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                '}';
    }
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoCompraLivros {
    // Atributos
    private List<Livro> livrosComprados;
    private Date dataCompra;
    private double valorTotal;

    
