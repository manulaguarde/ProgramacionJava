package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjercicioBotonesAritmeticos extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JButton botonSuma,botonResta;
	private JLabel num1,num2,resultado;
	private JTextField campoResul,campo1,campo2;
	
	public EjercicioBotonesAritmeticos() {
		
		panel=new JPanel();
		botonSuma=new JButton("Suma");
		botonResta=new JButton("Resta");
		num1= new JLabel("Número 1");
		num2= new JLabel("Número 2");
		campo1= new JTextField(10);
		campo2= new JTextField(10);
		resultado= new JLabel("Resultado");
		campoResul= new JTextField(10);
		
		panel.add(num1);
		panel.add(campo1);
		panel.add(num2);
		panel.add(campo2);
		panel.add(botonSuma);
		panel.add(botonResta);
		panel.add(resultado);
		panel.add(campoResul);
		
		this.add(panel);
		
		botonSuma.addActionListener(this);
		botonResta.addActionListener(this);
		
		this.setSize(200, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=Integer.parseInt(campo1.getText());
		int num2=Integer.parseInt(campo2.getText());
		
		if(e.getSource()==botonSuma) {
			int suma=num1+num2;
			campoResul.setText(suma+"");
		}
		else {
			int resta=num1-num2;
			campoResul.setText(resta+"");
		}
		
	}

}
