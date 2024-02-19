package Calculadora;

import javax.swing.JOptionPane;

public class Calculos {
	

	
	

	public int sustraendo;
	public int minuendo;
	
	
	
	public void menu() {
		int opc = 0;
		do {
			opc = 0;
			
			String c;
			
			while(opc <1 || opc >7) {
			c = "//////////CALCULADORA////////// \n";
			c += "1. Sumar \n";
			c += "2. Restar \n";
			c += "3. Multiplicacion \n";
			c += "4. Division \n";
			c += "5. Factorial \n";
			c += "6. Potencia \n";
			c += "7. Salir \n";
			
				opc = Integer.parseInt(JOptionPane.showInputDialog(c));
			}
			 
					
			
			if(opc == 1) {
				suma();
			}
			else if(opc == 2) {
				resta();
			}
			else if(opc == 3) {
				multiplicacion();
			}
			else if(opc == 4) {
				division();
			}
			else if(opc == 5) {
				factorial();
			}
			else if(opc == 6) {
				potencia();
			}
			else {
				System.exit(0);
			}	
			
			
		}while(opc !=6);
		
		
		
		
	}
	
	public void suma() {
		int sumando1, sumando2, resultado ;
		
		sumando1 = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el primer numero: "));
		sumando2 = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el segundo numero: "));
		resultado = sumando1 + sumando2;
		
		JOptionPane.showMessageDialog(null,"El resultado de su suma es: "+resultado);
		
		
	}
	public void resta() {
		int minuendo1, sustraendo2, resultado ;
		
		minuendo1 = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el primer numero de la resta: "));
		sustraendo2 = Integer.parseInt(JOptionPane.showInputDialog("\nPor mfavor ingrese el numero que le desea restar: "));
		resultado = minuendo1-sustraendo2;
		
		JOptionPane.showMessageDialog(null,"El resultado de su resta es: "+resultado);
		
		
	}
	
	public void multiplicacion() {
		int multiplicando1, multiplicado2, producto ;
		
		multiplicando1 = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el numero que desea multiplicar: "));
		multiplicado2 = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el multiplo que desea calcular: "));
		producto = multiplicando1 *multiplicado2;
		
		JOptionPane.showMessageDialog(null,"El resultado de su multiplicacion es: "+producto);
		
		
	}
	
	
	public void division() {
		int dividendo, divisor, resultado ;
		
		dividendo = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el numero que desea dividir por un multiplo: "));
		divisor = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el multiplo por el que desea dividir: "));
		resultado = dividendo / divisor;
		
		JOptionPane.showMessageDialog(null,"El resultado de su division es: "+resultado);
		
		
	}
	
	public void factorial() {
		int n, factorial = 1 ;
		n = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el numero que desea calcuilar el factorial: "));
		
		for(int i = 1;i<=n;i++) {
			factorial *= i;
		}
		
		JOptionPane.showMessageDialog(null,"El factorial de el numero "+n+" es :"+factorial);
		
	}
	
	
	public void potencia() {
		int numero, potencia,resultado ;
		numero = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el numero que desea elevar a una potencia: "));
		potencia = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor ingrese el numero que desea elevar a una potencia: "));
		resultado = (int) Math.pow(numero, potencia);
		
		
		JOptionPane.showMessageDialog(null,"El resultado de la potencia es :"+resultado);
		
	}

}
