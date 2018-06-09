package imc.swing;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author josimar
 */
public class IMCSwing {

    public static void main(String[] args) {

        DecimalFormat f2 = new DecimalFormat("##.##");

        double peso, altura, calculo;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        calculo = peso / (altura * altura);

        if ((calculo < 17) || (calculo > 35)) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + f2.format(calculo) + "\n\n" + "  Cuidado. Condição de risco. \n");

        } else if ((calculo > 18.5) && (calculo < 25.1)) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + f2.format(calculo) + "\n\n" + "Parabéns !!! Condição saudável!!\n");

        } else if ((calculo > 17) && (calculo < 18.5) || (calculo > 25) || (calculo < 35)) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + f2.format(calculo) + "\n\n" + "Condição em estado de alerta.\n");
        }

    }

}
