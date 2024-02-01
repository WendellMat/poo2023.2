package br.ufpb.dcx.bibliotecaWendell;

public interface BibliotecaInterface {
    void add(Livro l);
    void delete(Livro l) throws LivroNaoExisteException;
}
