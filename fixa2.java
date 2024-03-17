import java.util.Scanner;

public class fixa2 {    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numAlunos = 5;

        String[] matriculas = new String[numAlunos];
        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] notasFinais = new double[numAlunos];
        

        for (int i = 0; i < numAlunos; i++) {
           System.out.println("Aluno " + (i + 1)); 
           System.out.print("Digite a matrícula do aluno: ");
           matriculas[i] = leitor.nextLine();
           System.out.print("Digite o nome do Aluno: ");
           nomes[i] = leitor.nextLine();
           System.out.println("Digite a nota 1: ");
           notas1[i] = leitor.nextDouble();
           System.out.println("Digite a nota 2: ");
           notas2[i] = leitor.nextDouble();
           leitor.nextLine(); //Limpa o buffer

            //Calcula a nota final
           notasFinais[i] = (notas1[i] + notas2[i]) / 2;

           // Verifica se o aluno esta aprovado
           if (notasFinais[i] >= 60) {
            System.out.println ("Aprovado: (X) Sim () Não ");
           } else {
            System.out.println("Aprovado: () Sim (X) Não ");
           }
        }
    }
}

       