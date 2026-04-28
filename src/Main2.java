import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();//cria uma lista de array do Empregado, sem a necessidade de declarar quantos vetores serão

        lista.add(new EmpregadoComissado(1,"A", 10, 10));
        lista.add(new EmpregadoHorista(2,"B", 10, 10));
        lista.add(0, new EmpregadoHorista(3,"C", 10, 10));

        //for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nome);
        }

        //ou

        //for generico
        System.out.println();
        for (Empregado empregado: lista) {
            System.out.println(empregado);
            System.out.println(empregado.calcularSalario());
        }


    }
}
