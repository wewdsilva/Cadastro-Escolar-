import java.util.Scanner;
public class Cadastro {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome = null;
        String sexo = null;
        String rua = null;
        String bairro = null;
        String ano = null;
        String idade = null;
        String num = null;
        String cep = null;

        int numero = 0;

        while (numero != 5){

            System.out.println("\n ******* CADASTRO ESCOLAR *********\n");
            System.out.println(" Informe a opção Desejada\n");
            System.out.println("********************************");
            System.out.println("(1º) Para Cadastro de aluno    |");
            System.out.println("(2º) Para Cadastro de Endereço |");
            System.out.println("(3º) Para Imprimir  aluno      |");
            System.out.println("(4º) Para Imprimir  Endereço   |");
            System.out.println("(5º) Para Sair                 |");
            System.out.println("********************************\n");

            System.out.print("Opção: ");

            numero = ler.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("\n######### CADASTRO DE ALUNO #############\n");

                    System.out.println("************ ALUNO ************\n  ");
                    ler.nextLine();
                    System.out.print("NOME: ");
                    nome = ler.nextLine();
                    System.out.print("SEXO: ");
                    sexo = ler.nextLine();
                    System.out.print("IDADE: ");
                    idade = ler.nextLine();
                    System.out.print("NASC: ");
                    ano = ler.nextLine();
                    System.out.print("\n#########################################\n ");
                    break;

                case 2:
                    System.out.println("************ CADASTRO ENDEREÇO **********\n");
                    ler.nextLine();
                    System.out.print("RUA:");
                    rua = ler.nextLine();
                    System.out.print("Nº:");
                    num = ler.nextLine();
                    System.out.print("BAIRRO:");
                    bairro = ler.nextLine();
                    System.out.print("CEP:");
                    cep = ler.nextLine();
                    System.out.println("\n#########################################\n ");
                    break;

                case 3:
                    System.out.println("############# IMPRIMA ALUNO #############\n");
                    System.out.println("Nome: " + nome + "   Idade: " + idade         );
                    System.out.println("Sexo: " + sexo + "   Nasc: " + ano            );
                    System.out.println("\n#########################################\n ");
                    break;

                   case 4:
                   System.out.println("############# IMPRIMA ENDEREÇO #############\n");
                   System.out.println("RUA: " + rua + "   Nº: " + num                 );
                   System.out.println("BAIRRO: " + bairro + "   CEP: " + cep          );
                   System.out.println("\n#########################################\n ");
                   break;


                default:

                    System.out.print("Acesso finalizado! \n");

            }

        }

    }

}



