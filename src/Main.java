import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double pegaOrcamento = 0;
        Mecanico cliente = new Mecanico();

        System.out.print("NOME CLIENTE: ");
        cliente.setNomeCliente(leia.next());

        System.out.print("MODELO DO CARRO: ");
        cliente.setModeloCarro(leia.next());

        System.out.print("NOME DO MECANICO: ");
        cliente.setNomeMecanico(leia.next());

        System.out.println("Numero de Pecas Avariadas: ");
        int totPecas = leia.nextInt();

        Mecanico[] listaMecanico = new Mecanico[totPecas];

        for (int cont = 0; cont < totPecas; cont++) {
            Mecanico listaTotal = new Mecanico();

            System.out.println("NOME DA PEÇA: ");
            listaTotal.setNomePeca(leia.next());

            System.out.println("CUSTO: ");
            listaTotal.setPrecoPeca(leia.nextDouble());

            pegaOrcamento += listaTotal.getPrecoPeca();

            listaMecanico[cont] = listaTotal;

        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("=====NOTA DE PAGAMENTO====\n\nNOME CLIENTE: "+cliente.getNomeCliente()+" MODELO DO CARRO: "+cliente.getModeloCarro());
        System.out.println("NOME MECANICO RESPONSAVEL: "+cliente.getNomeMecanico()+"\n--------------------");
        for (Mecanico leiaOrcamento : listaMecanico) {
            System.out.print("PEÇA: " + leiaOrcamento.getNomePeca() + " PREÇO: R$" + leiaOrcamento.getPrecoPeca() + "\n");
        }
        System.out.print("--------------------\nTOTAL A PAGAR R$"+pegaOrcamento);
    }
}