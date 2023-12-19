package br.ufpb.wendelldaniel;

public class PerguntaDissertativa extends Pergunta {
    public PerguntaDissertativa() {
        super("", "");
    }

    public PerguntaDissertativa(String enunciado, String respostaCorreta) {
        super(enunciado, respostaCorreta);
    }

    @Override
    public boolean estahCorretaResposta(String resposta) {
        //TODO
    }

    public String toString() {

    }
}
