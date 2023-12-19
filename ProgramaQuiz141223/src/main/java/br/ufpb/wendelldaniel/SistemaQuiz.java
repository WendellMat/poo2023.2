package br.ufpb.wendelldaniel;

import java.util.List;

public interface SistemaQuiz {
    void cadastrarPergunta(Pergunta p);
    Pergunta sorteiaPergunta();
    List<Pergunta> getTodasAsPerguntas();
}
