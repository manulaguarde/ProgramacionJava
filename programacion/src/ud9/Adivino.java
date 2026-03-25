package ud9;
/*
 * Escribe el programa “Adivino” que intenta adivinar un número que piense el usuario. El
usuario pensará un número entre 1 y 100. El programa intentará adivinar el número en el
menos número de intentos, usando como pistas la información que le dé el usuario sobre si el
número es mayor o menor que el que el programa dice. Ejemplo: el programa dice 50, el usuario
dice mayor, el programa entonces dice 75, el usuario dice mayor, el programa dice 83, etc...
El interfaz tendrá una o varias etiquetas en las que el programa irá diciéndole al usuario lo que
tiene que hacer, además de tres botones, uno para decir que el número es mayor, otro para
decir que es menor y otro para decir que ya ha acertado. Se pueden poner más botones o
etiquetas para que quede mejor si se estima necesario.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adivino extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JLabel piensaNum, tuNumEs;
	private JTextField campoNumAdivinado;
	private JButton mayor,menor,acertaste;
	
	public Adivino() {
		panel=new JPanel();
		piensaNum=new JLabel();
		tuNumEs=new JLabel();
		campoNumAdivinado=new JTextField();
		mayor=new JButton();
		menor= new JButton();
		acertaste=new JButton();
		
		this.add(panel);
		
		
		this.setSize(300, 200);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
