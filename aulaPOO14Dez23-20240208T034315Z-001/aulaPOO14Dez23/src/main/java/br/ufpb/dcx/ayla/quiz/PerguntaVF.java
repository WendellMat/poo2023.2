package br.ufpb.dcx.ayla.quiz;

public class PerguntaVF extends Pergunta {
    private String afirmativa;

    public PerguntaVF(String enunciado, String afirmativa, String respostaCorreta) {
        super(enunciado, respostaCorreta);
        this.afirmativa = afirmativa;
    }

    public PerguntaVF() {
        this("", "", "");
    }

    @Override
    public boolean estahCorretaResposta(String resposta) {
        return resposta.equals(this.getRespostaCorreta());
    }
}
