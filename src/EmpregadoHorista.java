public class EmpregadoHorista extends Empregado{

    int totalDeHorasTrabalhadas;
    double valorDaHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHora) { //alt + insert tb
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double calcularSalario(){
        return totalDeHorasTrabalhadas * valorDaHora;
    }


    @Override
    public String toString() {//alt + insert e seleciona todos
        return "EmpregadoHorista{" +
                "totalDeHorasTrabalhadas=" + totalDeHorasTrabalhadas +
                ", valorDaHora=" + valorDaHora +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
