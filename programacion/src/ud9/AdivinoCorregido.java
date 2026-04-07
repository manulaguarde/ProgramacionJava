package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdivinoCorregido extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel et;
	private JTextField textFieldNumero;
	private JButton btnMayor, btnMenor, btnIgual;
	private int numAdivinar,min,max;
	private Random random;
	
	public AdivinoCorregido() {
		random=new Random();
		numAdivinar=50;
		min=1;
		max=100;
		construirPanel();
		
		this.setBounds(100, 100, 150, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
	
	//refactorizamos con un método privado para construir el panel
	private void construirPanel() {
		panel=new JPanel();
		et=new JLabel("Número: ");
		textFieldNumero=new JTextField(20);
		textFieldNumero.setEditable(false);
		btnMayor=new JButton(">");
		btnMenor=new JButton("<");
		btnIgual=new JButton("=");
		
		panel.add(et);
		panel.add(textFieldNumero);
		panel.add(btnMayor);
		panel.add(btnMenor);
		panel.add(btnIgual);
		
		this.add(panel);
		
		btnMayor.addActionListener(this);
		btnMenor.addActionListener(this);
		btnIgual.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource()==btnMayor) {
			min=numAdivinar+1;
			numAdivinar=random.nextInt(min,max+1);
			textFieldNumero.setText(numAdivinar+"");
			
		}
		if(e.getSource()==btnMenor) {
			max=numAdivinar-1;
			numAdivinar=random.nextInt(min-max);
			textFieldNumero.setText(numAdivinar+"");
			
		}
		if(e.getSource()==btnIgual) {
			textFieldNumero.setText("He adivinado el número! "+numAdivinar);
		}
		
	}
	
	

}
