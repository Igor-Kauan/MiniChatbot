import java.util.Scanner;

public class MiniChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) { // Loop para manter a conversa
            System.out.print("Você: ");
            String mensagem = scanner.nextLine();

            if (mensagem.equalsIgnoreCase("sair")) { // Verifica se o usuário quer encerrar
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            }

            if (mensagem.toLowerCase().contains("oi") || mensagem.toLowerCase().contains("ola")) {
                System.out.println("MiniChatbot: Olá! Como posso ajudar?");
            } else if (mensagem.toLowerCase().contains("qual é o seu nome") || mensagem.toLowerCase().contains("seu nome")) {
                System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
            } else if (mensagem.toLowerCase().contains("como você está") || mensagem.toLowerCase().contains("tudo bem")) {
                System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
            } else {
                System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta. Pode reformular?");
            }

        }
    }
}

