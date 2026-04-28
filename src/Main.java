public class Main {


    public static void main(String[] args) {


        Empregado[] empregado = new Empregado[4];//criamos um vetor para passar as informações dos empregados

        empregado[0] = new EmpregadoComissado(1, "Pedro", 350000, 20);
        empregado[1] = new EmpregadoHorista(2, "Jõao", 160, 550);
        empregado[2] = new EmpregadoComissado(3, "Patricia", 700000, 23);
        empregado[3] = new EmpregadoHorista(4, "Maria", 200, 800);

        //for tradicional
        for (int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);
            System.out.println(empregado[i].calcularSalario());
            System.out.println();
        }

        //ou

        //for generico
        System.out.println("############################################");
        for (Empregado e : empregado) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }

    }


    }

