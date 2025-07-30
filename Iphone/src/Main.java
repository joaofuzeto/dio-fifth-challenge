import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        scanner.useDelimiter("\\n");
        int option;
        Iphone meuIphone = new Iphone();

        System.out.println("Inicializando o seu Iphone");

        while (true) {
            System.out.println("O que você deseja fazer:");
            System.out.println("1 - Músicas");
            System.out.println("2 - Aparelho telefônico");
            System.out.println("3 - Internet");

            option = scanner.nextInt();

            // Testando funcionalidades de Reprodutor Musical
            if (option == 1) {
                System.out.println("Abrindo Reprodutor Musicical");
                System.out.println("1 - Selecione a música");
                System.out.println("2 - Tocar");
                System.out.println("3 - Pausar");
                int option2 = scanner.nextInt();

                if(option2 == 1){
                    scanner.nextLine();
                    System.out.println("Qual música você deseja ouvir?");
                    String musicName = scanner.nextLine();
                    meuIphone.selecionarMusica(musicName);
                } else if (option2 == 2){
                    meuIphone.tocar();
                } else if (option2 == 3){
                    meuIphone.pausar();
                } else {
                    System.out.println("Opção inválida");
                    continue;
                }
                // Testando funcionalidades de Aparelho Telefônico
            } else if (option == 2){
                System.out.println("Abrindo Aparelho Telefônico");
                System.out.println("1 - Ligar");
                System.out.println("2 - Atender");
                System.out.println("3 - Iniciar Correio de Voz");
                int option2 = scanner.nextInt();

                if(option2 == 1){
                    scanner.nextLine();
                    System.out.println("Digite o número para que possa ligar");
                    String phoneNumber = scanner.nextLine();
                    meuIphone.ligar(phoneNumber);
                } else if (option2 == 2){
                    meuIphone.atender();
                } else if (option2 == 3){
                    meuIphone.iniciarCorreioVoz();
                } else {
                    System.out.println("Opção inválida");
                }
                // Testando funcionalidades de Navegador na Internet
            } else if (option == 3) {
                System.out.println("Abrindo o Navegador da internet");
                System.out.println("1 - Exibir página");
                System.out.println("2 - Adicionar nova aba");
                System.out.println("3 - Atualizar página");
                int option2 = scanner.nextInt();

                if (option2 == 1) {
                    scanner.nextLine();
                    System.out.println("Digite a url da página");
                    String url = scanner.nextLine();
                    meuIphone.exibirPagina(url);
                } else if (option2 == 2) {
                    meuIphone.adicionarNovaAba();
                } else if (option2 == 3) {
                    meuIphone.atualizarPagina();
                } else {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}