import java.util.Scanner;

public class fixa1 {    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a matrícula do aluno: ");
        String matrícula = leitor.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a nota 1: ");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota2: ");
        Double nota2 = leitor.nextDouble();
        Double notaFinal = (nota1 + nota2) / 2;
        if (notaFinal < 60) {
            System.out.println("Aprovado: () Sim (X) Não ");
        } else {
            System.out.println("Aprovado: (X) Sim () Não ");
        }

    }

}
