package raca;

public class Raca {

    private int id;
    private String nome;
    private String especie;
    private String paisDeOrigem;
    private boolean riscoDeExtincao;

    public Raca(int id, String nome, String especie, String paisDeOrigem) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.paisDeOrigem = paisDeOrigem;
    }

    public boolean analisarExtincao(boolean c1, boolean c2, boolean c3, boolean c4) {
    int pontos = 0;
        pontos = (c1 ? 1 : 0) +
                 (c2 ? 1 : 0) +
                 (c3 ? 2 : 0) +
                 (c4 ? 2 : 0) ;
        this.riscoDeExtincao = pontos >= 5  ? true : false;
        return this.riscoDeExtincao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdRaca() {
        return id;
    }
    public String getEspecie(){
        return especie;
    }

    public String getPaisDeOrigem(){
        return paisDeOrigem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }
    public boolean isRiscoDeExtincao(){
        return riscoDeExtincao;
    }
}
