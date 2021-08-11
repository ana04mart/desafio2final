package classes;
public class Motorista extends Pessoa{
    private int matricula;
    private String habilitacao;
    private Carro veiculoAtual;

    public Motorista(){}

    public Motorista (Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao){
        this.habilitacao = habilitacao;
    }
    public Carro getVeiculoAtual(){
        return veiculoAtual;
    }
    public void setVeiculoAtual(Carro veiculoAtual){
        this.veiculoAtual = veiculoAtual;
    }
    public void pisaFundo(){
        veiculoAtual.acelerar();
    }
    public void pisaFundo (int limite){
        veiculoAtual.acelerar(limite);
    }
    @Override
    public String cumprimentar() {
        return "Olá, passageiro!";
    }

}
