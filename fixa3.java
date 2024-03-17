import java.util.Scanner;

public class fixa3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        double[] notas = new double[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Digite a matrícula do aluno: ");
            matriculas[i] = leitor.nextLine();

            System.out.print("Digite o nome do aluno: ");
            nomes[i] = leitor.nextLine();

            
            do {
                System.out.print("Digite a nota do aluno (0 a 10): ");
                notas[i] = leitor.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("A nota deve estar entre 0 e 10. Digite novamente.");
                }
            } while (notas[i] < 0 || notas[i] > 10);

            
            leitor.nextLine();
        }

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Matrícula: " + matriculas[i]);
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Nota : " + notas[i]);
            
            System.out.println();
        }
    }
}
