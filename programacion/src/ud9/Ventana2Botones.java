package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana2Botones extends JFrame implements ActionListener {
	
	//atributos
	private JPanel panel; //contenido que esta dentro de la ventana
	private JButton btn1,btn2;
	
	public Ventana2Botones() {
		panel=new JPanel();
		btn1= new JButton("Boton 1");
		btn2= new JButton("Boton 2");
		
		//añadimos los botone al panel
		panel.add(btn1);
		panel.add(btn2);
		
		//añadimos el panel a la ventana
		this.add(panel);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//vinculamos el eventro al boton
		
		//configuramos la ventana
		this.setSize(200, 100);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //atento aca quizas hay que poner JFrame.
		
		//lo hacemos visible
		this.setVisible(true);
	}
	
	
	//Este método no lo llamamos nosotros, lo llama la maquina virtual de Java (JVM)
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) //aca compara si lo que devuelve el source y btn1 apuntan al mismo lado
			System.out.println("Has pulsado el boton 1");
		else
			System.out.println("Has pulsado el boton 2");
		
	}

}
