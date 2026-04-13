package ud10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjTraductorInglesEspaniol extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel espaniol, ingles;
	private JTextField campoEspaniol, campoIngles;
	private JButton traducirAIngles, traducirAEspaniol;
	private FileReader entrada;
	private ArrayList<String> palabrasEnEspaniol,palabrasEnIngles;
	
	public EjTraductorInglesEspaniol() {
		
		panel=new JPanel();
		espaniol=new JLabel("Español");
		ingles= new JLabel("Inglés");
		campoEspaniol=new JTextField(10);
		campoIngles=new JTextField(10);
		traducirAIngles=new JButton(">>");
		traducirAEspaniol= new JButton("<<");
		
		this.add(panel);
		panel.add(espaniol);
		panel.add(campoEspaniol);
		panel.add(traducirAIngles);
		panel.add(traducirAEspaniol);
		panel.add(ingles);
		panel.add(campoIngles);
		
		traducirAIngles.addActionListener(this);
		traducirAEspaniol.addActionListener(this);
		
		this.setBounds(100, 100, 600, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==traducirAIngles) {
			//String palabraTraducida=traduceAIngles("traducciones.txt");
			for(int i=0;i<palabrasEnEspaniol.size();i++) {
				if(palabrasEnEspaniol.get(i).equalsIgnoreCase(campoEspaniol.getText())){
					campoIngles.setText(palabrasEnIngles.get(i));
				}
				
			}
		}
		if(e.getSource()==traducirAEspaniol) {
			for(int i=0;i<palabrasEnIngles.size();i++) {
				if(palabrasEnIngles.get(i).equalsIgnoreCase(campoIngles.getText())){
					campoEspaniol.setText(palabrasEnEspaniol.get(i));
				}
			}
		}
		
	}
	/*public String traduceAIngles(String fichero) {
		int car=0;
		String cad="";
		try {
			entrada=new FileReader(fichero);
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1) {
					cad+=(char)car;
				}
			}
			String[] lineas=cad.split("\n");
			for(String linea:lineas) {
				String[] palabras=linea.split(", ");
				if (palabras[0].equalsIgnoreCase(campoEspaniol.getText()));
					return palabras[1];
			}
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return "No se encontró la palabra";
	}*/
	public void separaPalabras() {
		int car=0;
		String cad="";
		palabrasEnEspaniol=new ArrayList<String>();
		palabrasEnIngles=new ArrayList<String>();
		try {
			entrada=new FileReader("traducciones.txt");
			while(car!=-1) {
				car=entrada.read();
				if(car!=-1) {
					cad+=(char)car;
				}
			}
			String[] lineas=cad.split("\n");
			for(String linea:lineas) {
				String[] palabras=linea.split(", ");
				palabrasEnEspaniol.add(palabras[0]);
				palabrasEnIngles.add(palabras[1]);		
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
