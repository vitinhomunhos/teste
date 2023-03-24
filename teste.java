import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float nota1, nota2, media, notarec;           
        System.out.print("Digite o nome do aluno: ");
        nome=sc.next();
        System.out.print("Digite a primeira nota do aluno: ");
        nota1=sc.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2=sc.nextFloat();
        media=(nota1+nota2)/2;
        if (media>=6) {
            System.out.printf("O " + nome+ " passou de ano com média %.2f", media);
        }
        if (media<6){
            System.out.println("Você reprovou com média: " + media);
           System.out.print("Digite a nota da recuperação: ");
            notarec=sc.nextFloat();
            if (notarec>=6){
        System.out.printf("O "+ nome+ " recuperou e tirou: " + notarec);
            }else{
                System.out.printf("O " + nome + " reprovou");
            }
        }
    }



}