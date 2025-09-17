package introducao_java;

import javax.swing.JOptionPane;

public class ExcercicioN1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
        double precoFinal;

        if (preco > 10) {
            precoFinal = preco - (preco * 0.10); // aplica 10% de desconto
            JOptionPane.showMessageDialog(null, nome + " - O preço com 10% de desconto é R$ " + precoFinal);
        } else{
        	precoFinal = preco - (preco * 0.05);
            JOptionPane.showMessageDialog(null, nome + "- O preço com 5% de desconto é R$ " + precoFinal);
        }
    }
}
