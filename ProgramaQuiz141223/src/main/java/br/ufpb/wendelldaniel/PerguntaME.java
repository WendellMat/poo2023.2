package br.ufpb.wendelldaniel;

import java.util.Arrays;

public class PerguntaME extends Pergunta{
    private String [] alternativas;

    public PerguntaME() {
        this("", new String[]{}, "");
    }
    public PerguntaME(String enunciado, String[] alternativas, String respostaCorreta) {
        super(enunciado, respostaCorreta);
        this.alternativas = alternativas;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public String toString() {
        //TODO
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerguntaME that = (PerguntaME) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(alternativas, that.alternativas);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(alternativas);
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public boolean estahCorretaResposta(String resposta) {
        //TODO
        return null;
    }
}
