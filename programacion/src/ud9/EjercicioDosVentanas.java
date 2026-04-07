package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjercicioDosVentanas extends JFrame implements ActionListener {
	
	private JPanel panel1,panel2;
	private JButton boton1,boton2;
	
	
	public EjercicioDosVentanas() {
		
		panel1=new JPanel();
		
		
		boton1=new JButton("Ir a ventana 2");
		
		
		panel1.add(boton1);
		
		this.add(panel1);
		
		boton1.addActionListener(this);
		
		this.setBounds(100, 100, 200, 80);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public EjercicioDosVentanas(JPanel panel) {
		panel1=panel;
		boton2=new JButton("Ir a ventana principal");
		panel1.add(boton2);
		boton2.addActionListener(this);
		
		this.setBounds(300, 300, 200, 80);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	/*public void setPanel(JPanel panel) {
		this.panel1=panel;
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel2=new JPanel();
		

		if(e.getSource()==boton1) {
			EjercicioDosVentanas v2=new EjercicioDosVentanas(panel2);
			panel2.add(boton2);
			boton2.addActionListener(v2);
		}
		if(e.getSource()==boton2) {
			EjercicioDosVentanas v1=new EjercicioDosVentanas();
		}
		
	}

}
