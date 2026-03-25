package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotonSuma extends JFrame implements ActionListener{
	
	private JFrame v1;
	private JPanel panel;
	private JButton botonSuma;
	private JLabel mensaje;
	private int num;
	
	public BotonSuma() {
		v1=new JFrame();
		panel=new JPanel();
		botonSuma= new JButton("+");
		mensaje= new JLabel();
		
		v1.setSize(300, 300);
		v1.setLocation(100, 100);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(mensaje);
		panel.add(botonSuma);
		
		botonSuma.addActionListener(this);
		
		
		
		v1.setContentPane(panel);
		v1.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		num++;
		mensaje.setText("Contador "+num);
		
	}

}
