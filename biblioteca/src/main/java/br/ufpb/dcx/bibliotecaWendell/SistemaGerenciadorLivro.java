package br.ufpb.dcx.bibliotecaWendell;

import java.util.ArrayList;

public class SistemaGerenciadorLivro implements BibliotecaInterface{

    private ArrayList<Livro> livros;

    @Override
    public void add(Livro l) {
        boolean continua = livros.contains(l) ? false : true;
        if (continua) {
            livros.add(l);
        }
    }

    @Override
    public void delete(Livro l) throws LivroNaoExisteException{
        boolean remove = livros.contains(l) ? true : false;
        if (remove) {
            livros.remove(l);
        }
        throw new LivroNaoExisteException("Livro não existe, por isso, não foi possível apagá-lo.");
    }
}
