package br.ufpb.wendelldaniel;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class SistemaQuizAyla implements SistemaQuiz{
    private List<Pergunta> perguntas;

    Random random = new Random();

    public SistemaQuizAyla() {
        this.perguntas = new LinkedList<>();
    }

    public SistemaQuizAyla(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public void cadastrarPergunta(Pergunta p) {
        this.perguntas.add(p);
    }

    public Pergunta sorteiaPergunta() {
        int indicePerguntaEscolhida = random.nextInt(this.perguntas.size());
        return this.perguntas.get(indicePerguntaEscolhida);
    }

    public List<Pergunta> getTodasAsPerguntas(){
        return this.perguntas;
    }
}
