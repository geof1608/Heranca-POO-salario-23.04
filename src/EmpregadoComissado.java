public class EmpregadoComissado extends Empregado {// para ter a herança tem que por extends e o nome do pai; no inicio vai dar erro mas depois de contruir o construtor da certo

    double totalDeVendas;
    double comissao;

    public EmpregadoComissado(long matricula, String nome, double totalDeVendas, double comissao) {//alt + insert, automaticamente vai adicionar os atributos do pai
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){//é o que vai fazer calcular e conectamos ele na classe Empregado
        return totalDeVendas * comissao/100;
    }

    @Override //alt + insert -> toString e adiciona todos
    public String toString() {
        return "EmpregadoComissado{" +
                "comissao=" + comissao +
                ", totalDeVendas=" + totalDeVendas +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
