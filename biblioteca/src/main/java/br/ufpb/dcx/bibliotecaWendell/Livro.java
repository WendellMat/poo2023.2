package br.ufpb.dcx.bibliotecaWendell;

import java.util.Objects;

public class Livro implements Comparable{
    private String nome;
    private int codigo;

    public Livro(String nome) {
        this.nome = nome;
    }

    public Livro(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (codigo != livro.codigo) return false;
        return Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + codigo;
        return result;
    }
}
