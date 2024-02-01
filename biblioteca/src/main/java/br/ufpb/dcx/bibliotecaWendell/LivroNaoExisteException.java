package br.ufpb.dcx.bibliotecaWendell;

public class LivroNaoExisteException extends Exception {
    public LivroNaoExisteException () {
        super();
    }
    public LivroNaoExisteException (String msg) {
        super(msg);
    }
}
