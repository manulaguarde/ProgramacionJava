package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class claseVentana extends JFrame implements ActionListener{//Paso 1: Implemento la interfaz
	
	//los atributos son aquellos elementos gráficos que cambian o generan eventos
	private JFrame v1;
	private JPanel panel;
	private JTextField campoTexto;
	private JButton boton;
	private JLabel etNombre; //este no es necesario porque no cambia
	private JLabel etSaludo;
	
	public claseVentana() {
		v1= new JFrame();
		v1.setSize(300, 300);
		v1.setLocation(100, 100);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		etNombre=new JLabel("Nombre");
		
		
		panel= new JPanel();
		panel.add(etNombre);
		
		campoTexto= new JTextField(20);
		panel.add(campoTexto);
		boton= new JButton("Saluda");
		panel.add(boton);
		
		
		//Paso 2: vinculo esa respuesta (el listener) al boton.
		boton.addActionListener(this);
		
		etSaludo= new JLabel();
		panel.add(etSaludo);
		
		v1.setContentPane(panel);
		v1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre=campoTexto.getText();//recojo lo que está dentro del campo de texto y lo meto en una cadena (nombre)
		etSaludo.setText("Hola "+nombre);
		
		System.out.println("Hola "+nombre);
		
	}
	
	
	// Paso 3: Dentro de este método se define la respuesta ante el evento de "click"
	
	
	

}
