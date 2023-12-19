package br.ufpb.wendelldaniel;

public abstract class Pergunta {
    private String enunciado;
    private String respostaCorreta;

    public Pergunta() {

    }

    public Pergunta(String enunciado, String respostaCorreta) {

    }

    public abstract boolean estahCorretaResposta(String resposta);

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}