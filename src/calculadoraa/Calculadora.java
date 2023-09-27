
package calculadoraa;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        while (true) {
            String escolha = JOptionPane.showInputDialog(null,
                    "Calculadora \n" +
                    "Escolha a operação:\n" +
                    "1. Soma\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n" +
                    "5. Sair\n","Bem Vindo",1);

            if (escolha == null || escolha.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saindo da calculadora.","Saindo",0);
                break;
            }

            double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro número:","Primeiro Número",3));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo número:","Segundo Número",3));

            double resultado = 0.0;

            switch (escolha) {
                case "1":
                    resultado = numero1 + numero2;
                    break;
                case "2":
                    resultado = numero1 - numero2;
                    break;
                case "3":
                    resultado = numero1 * numero2;
                    break;
                case "4":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero.");
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.","Erro",0);
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado,"Resultado",1);
        }
   
    }
    
}
