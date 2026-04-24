public class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {//alt + insert e selecionamos os dois atributos para construir o construtor
        this.matricula = matricula;
        this.nome = nome;
    }


    public double calcularSalario(){//serve para puxar o calcular salario dos filhos
        return 0;//gambiarra para poder funcionar
    }

}
