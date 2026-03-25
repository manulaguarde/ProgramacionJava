package ud9;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana1 {
	 

	public static void main(String[] args) {
		
		//contruimos una ventana
		JFrame v0 = new JFrame(); //contructor por defecto
		JFrame v1 = new JFrame("Primera Ventana"); //le pasamos por parámetro un título
		
		//Fijamos el tamaño y la localización de la ventana
		
		v1.setSize(300, 300); // fijar ancho y alto de la pantalla en píxeles
		v1.setLocation(100, 100); // fijar el extremo superior izquierdo , si la pantalla es (0,0) lo fijamos en (100,100) por ej
		
		//Fijamos el comportamiento de la app al cerrar la ventana (X)
		
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//constantes de clase
		

		
		// Lo siguiente es dibujar la lámina (o panel) 
		
		JPanel panel=new JPanel();
		
		
		// creo etiqueta y la añadimos a la lámina
		
		JLabel etNombre= new JLabel("Nombre");
		
		//vinculamos la etiqueta a la lámina
		panel.add(etNombre);
		
		
		//Creamos campo de texto y lo añadimos al panel
		JTextField campoTexto= new JTextField(20); //se suele pasar el número de caracteres que admite el campo de texto
		
		//y lo añadimos
		panel.add(campoTexto);
		
		//creamos un botón
		JButton boton=new JButton("Saluda"); //ponemos por parámetro lo que queremos que diga dentro del boton
		
		//y lo añadimos al panel
		panel.add(boton);
		
		// agregamos el panel (lámina) a la ventana (Se hace siempre al final)
		v1.setContentPane(panel);
		
		//Hacemos visible la ventana, es lo ULTIMO DE LO ULTIMO
		
		v1.setVisible(true); //true si queremos que se muestre
		
		
	}
	


}
