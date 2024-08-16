import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("escolha uma operação: \n1 - adicionar, \n2 - atualizar, \n3 - remover, \n4 - exibir, \n0 - sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("digite o item a ser adicionado:");
                    String itemAdicionar = scanner.nextLine();
                    System.out.println("adicionado...");
                    Thread.sleep(700);
                    adicionarLista(lista, itemAdicionar);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("digite a posição do item a ser atualizado:");
                    int posicaoAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("digite o novo valor:");
                    String novoItem = scanner.nextLine();
                    System.out.println("atualizando...");
                    Thread.sleep(700);
                    atualizarLista(lista, posicaoAtualizar, novoItem);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("digite a posição do item a ser removido:");
                    int posicaoRemover = scanner.nextInt();
                    System.out.println("removendo...");
                    Thread.sleep(700);
                    removerLista(lista, posicaoRemover);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("carregando...");
                    System.out.println(" ");
                    Thread.sleep(700);
                    exibirLista(lista);
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("saindo...");
                    return;
                default:
                    System.out.println("opção inválida.");
                    break;
            }

            Thread.sleep(500);
        }
    }

    static void adicionarLista(ArrayList<String> lista, String item) {
        lista.add(item);
        System.out.println("Item adicionado.");
    }

    static void atualizarLista(ArrayList<String> lista, int posicao, String novoItem) {
        if (posicao >= 0 && posicao < lista.size()) {
            lista.set(posicao, novoItem);
            System.out.println("Item atualizado.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    static void removerLista(ArrayList<String> lista, int posicao) {
        if (posicao >= 0 && posicao < lista.size()) {
            lista.remove(posicao);
            System.out.println("Item removido.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    static void exibirLista(ArrayList<String> lista) {
        System.out.println("Itens na lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
    }
}
