import javax.swing.*;

public class DesafioAlura {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String conta = "corrente";
        double saldo = 5000;

        JOptionPane.showMessageDialog(null, nome + "\n" +
                "Conta: " + conta + "\n" +
                "Saldo: " + saldo);

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?" + "\n" +
                "1 - Consultar saldo \n" +
                "2 - Receber valor \n" +
                "3 - Transferir valor \n" +
                "4 - Sair"));

                    switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: " + saldo);
                    break;
                case 2:
                    double recebido = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja receber?"));
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: " + (saldo += recebido));
                    break;
                case 3:
                    double transferido = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja transferir?"));
                    if (transferido < saldo){
                        JOptionPane.showMessageDialog(null, "Seu saldo é de: " + (saldo -= transferido));
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo indisponível");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 4);
    }
}
