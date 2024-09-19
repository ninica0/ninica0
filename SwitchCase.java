import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
//		declaração de variáveis
		String opc, n1, n2, n3;
		int iOpc;
		double dN1, dN2, dN3, resultado;
//		Criação de menu
		opc = JOptionPane.showInputDialog("1 - Maior número\n" + "2 - Par ou ímpar\n" + "3 - Positivo ou negativo\n" + "4 - Divisível por 5\n" +
        "5 - Soma de 3 números (+/-/0)\n" + "Digite a opção: ");
		iOpc = Integer.parseInt(opc);
		
//		processamento
		switch(iOpc) {
		case 1:
			n1 = JOptionPane.showInputDialog("Digite um número: ");
			dN1 = Double.parseDouble(n1);
			n2 = JOptionPane.showInputDialog("Digite outro número: ");
			dN2 = Double.parseDouble(n2);
			
//			processamento
			if (dN1 > dN2) {
				JOptionPane.showMessageDialog(null, dN1 + " é maior que " + dN2);
			}else if (dN1<dN2) {
				JOptionPane.showMessageDialog(null, dN2 + " é maior que " + dN1);
			}else 
				JOptionPane.showMessageDialog(null, dN2 + " e " + dN1 + " são iguais");
				break;
				
		case 2:
			
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1=Double.parseDouble(n1);
			
			if (dN1%2 == 0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é par");
			}else {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é ímpar");
			}
			break;
			
		case 3:
			n1=JOptionPane.showInputDialog("Digite um número");
			dN1= Double.parseDouble(n1);
			
			if(dN1<0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é negativo");
			}else {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é positivo");
			}
			break;
			
		case 4:
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1= Double.parseDouble(n1);
			
			if (dN1%2 == 0) {
			JOptionPane.showMessageDialog(null, dN1 + " esse número é divisível por 5");
		}else {
			JOptionPane.showMessageDialog(null, dN1 + " esse número não é divisível por 5");
		} 
		break; 
		
		case 5:
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1= Double.parseDouble(n1);
			n2=JOptionPane.showInputDialog("Digite outro número: ");
			dN2= Double.parseDouble(n2);
			n3=JOptionPane.showInputDialog("Digite mais um número: ");
			dN3= Double.parseDouble(n3);
			
			resultado=dN1+dN2+dN3;
			
			JOptionPane.showMessageDialog(null, resultado + " esse é o resultado da soma dos três números digitados");
			break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
					
			}
		}
}
	
