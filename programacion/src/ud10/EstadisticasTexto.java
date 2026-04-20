package ud10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EstadisticasTexto extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JTextArea textArea;
	private JButton boton;
	private JLabel letras, palabras, espacios, vocales, consonantes;
	private JTextField cantLetras, cantPalabras, cantEspacios, cantVocales, cantConsonantes;
	
	public EstadisticasTexto() {
		inicializarPanel();
		
		boton.addActionListener(this);
		
		this.setBounds(100, 100, 200, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void inicializarPanel() {
		
		panel=new JPanel();
		textArea= new JTextArea(10,20);
		boton=new JButton("Ver estadísticas");
		letras= new JLabel("Total Letras:");
		palabras= new JLabel("Total palabras:");
		espacios=new JLabel("Total espacios:");
		vocales=new JLabel("Total vocales:");
		consonantes=new JLabel("Total consonantes:");
		cantLetras= new JTextField(4);
		cantPalabras= new JTextField(4);
		cantEspacios= new JTextField(4);
		cantVocales= new JTextField(4);
		cantConsonantes= new JTextField(4);
		
		this.add(panel);
		panel.add(textArea);
		panel.add(boton);
		panel.add(letras);
		panel.add(cantLetras);
		panel.add(palabras);
		panel.add(cantPalabras);
		panel.add(espacios);
		panel.add(cantEspacios);
		panel.add(vocales);
		panel.add(cantVocales);
		panel.add(consonantes);
		panel.add(cantConsonantes);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton) {
			String contenido=textArea.getText();
			String[] lineas=contenido.split("\n");
			cantLetras.setText(cuentaLetras(lineas)+"");
			cantPalabras.setText(cuentaPalabras(lineas)+"");
			cantEspacios.setText(cuentaEspacios(lineas)+"");
			cantVocales.setText(cuentaVocales(lineas)+"");
			cantConsonantes.setText(cuentaConsonantes(lineas)+"");
		}
		
	}
	private int cuentaLetras(String[] lineas) {
		int contador=0;
		for(String linea:lineas) {
			for(int i=0; i<linea.length();i++) {
				char car=linea.charAt(i);
				if(Character.isLetter(car)) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	private int cuentaPalabras(String[] lineas) {
		int contador=0;
		for(String linea:lineas) {
			String [] palabras=linea.split(" ");
			contador+=palabras.length;
		}
		return contador;
	}
	
	private int cuentaEspacios(String[] lineas) {
		int contador=0;
		for(String linea:lineas) {
			for(int i=0; i<linea.length();i++) {
				if(linea.charAt(i)==' ') {
					contador++;
				}
			}
		}
		return contador;
	}

	private int cuentaVocales(String[] lineas) {
		int contador=0;
		String vocales="aeiouáéíóú";
		
		for(String linea:lineas) {
			String lineaLower=linea.toLowerCase();
			for(int i=0;i<linea.length();i++) {
				char car=lineaLower.charAt(i);
				if(vocales.indexOf(car)!=-1) {
					contador++;
				}
				
			}
		}
		
		return contador;
	}
	
	private int cuentaConsonantes(String[] lineas) {
		int contador=0;
		String vocales="aeiouáéíóú";
		
		for(String linea:lineas) {
			for(int i=0;i<linea.length();i++) {
				String lineaLower=linea.toLowerCase();
				char car=lineaLower.charAt(i);
				if(Character.isLetter(car)&&vocales.indexOf(car)==-1) {
					contador++;
				}
				
			}
		}
		
		return contador;
	}

}
