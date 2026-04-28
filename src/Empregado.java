public abstract class Empregado { //dai necessitamos por o abstract na classe (primeiro no construtor)
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {//alt + insert e selecionamos os dois atributos para construir o construtor
        this.matricula = matricula;
        this.nome = nome;
    }


    public abstract double calcularSalario(); //{      //serve para puxar o calcular salario dos filhos //usamos o abstract para tirar a gambiarra do return 0;
        //return 0;//gambiarra para poder funcionar
    //}


    @Override
    public String toString() {//alt + insert e apertamos o toString (isso serve para o run quando iniciado, aparecera informações)
        return "Empregado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
