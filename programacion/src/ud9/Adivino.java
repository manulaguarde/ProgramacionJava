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
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adivino extends JFrame implements ActionListener {
	Random genAle=new Random();
	private JPanel panel;
	private JLabel piensaNum, tuNumEs;
	private JTextField campoNumAdivinado;
	private JButton empieza,mayor,menor,acertaste;
	private int max,min,num;
	
	public Adivino() {
		panel=new JPanel();
		piensaNum=new JLabel("Piensa un número del 1 al 100");
		//tuNumEs=new JLabel("Tu número es");
		campoNumAdivinado=new JTextField(30);
		mayor=new JButton("Es Mayor");
		menor= new JButton("Es Menor");
		acertaste=new JButton("Has acertado");
		empieza=new JButton("Has click aqui cuando estés listo");
		max=100;
		min=0;
		num=genAle.nextInt(101);
		
		this.add(panel);
		panel.add(piensaNum);
		panel.add(empieza);
		panel.add(campoNumAdivinado);
		panel.add(mayor);
		panel.add(menor);
		panel.add(acertaste);
		
		
		empieza.addActionListener(this);
		mayor.addActionListener(this);
		menor.addActionListener(this);
		acertaste.addActionListener(this);
		
		
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==empieza)
			campoNumAdivinado.setText("Tu número es: "+num+"?");
		if(e.getSource()==mayor) {
			min=num;
			num=genAle.nextInt(max-min)+min;
			campoNumAdivinado.setText("Tu número es: "+num+"?");
		}
		if(e.getSource()==menor) {
			max=num;
			num=genAle.nextInt(max-min)+min;
			campoNumAdivinado.setText("Tu número es: "+num+"?");
		}
		if(e.getSource()==acertaste) {
			campoNumAdivinado.setText("Acerte!");
		}
		
	}

}
