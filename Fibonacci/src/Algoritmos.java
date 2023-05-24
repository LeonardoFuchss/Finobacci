import java.util.Scanner;

public class Algoritmos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner para definir o limite
        int n1 = 0; //numero 1 inicial
        int n2 = 1; //numero 2 inicial

        int limite = input.nextInt(); //limite definido em scanner

        while (n2 < limite) { //enquanto n2 for menor que o limite
            int fn = n1 + n2; //vai somar com n1 e armazenar o resultado na variável fn
            if (fn > limite) //se o fn atingiu o limite, acaba o programa
                break;

            System.out.println(fn);
            n1 = n2; //para acontecer o loop, o proximo n1 será o n2.
            n2 = fn; //e o n2 será o resultado.
        }
    }
}

