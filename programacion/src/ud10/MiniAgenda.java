package ud10;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MiniAgenda extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JTextArea lista;
	private JLabel dia,mes,anio;
	private JTextField diaTexto,mesTexto,anioTexto;
	private JButton anterior, siguiente;
	private LocalDate hoy=LocalDate.now();
	private String contenido, nombreArchivo;
	
	public MiniAgenda() {
		
		panel=new JPanel();
		lista=new JTextArea(5,35);
		dia=new JLabel("Día:");
		mes=new JLabel("Mes:");
		anio=new JLabel("Año:");
		diaTexto=new JTextField(3);
		diaTexto.setText(hoy.getDayOfMonth()+"");
		diaTexto.setEditable(false);
		mesTexto=new JTextField(3);
		mesTexto.setText(hoy.getMonthValue()+"");
		mesTexto.setEditable(false);
		anioTexto=new JTextField(7);
		anioTexto.setText(hoy.getYear()+"");
		anioTexto.setEditable(false);
		anterior=new JButton("Ir al día anterior");
		siguiente=new JButton("Ir al día siguiente");
		
		this.add(panel);
		panel.add(lista);
		panel.add(dia);
		panel.add(diaTexto);
		panel.add(mes);
		panel.add(mesTexto);
		panel.add(anio);
		panel.add(anioTexto);
		panel.add(anterior);
		panel.add(siguiente);
		
		anterior.addActionListener(this);
		siguiente.addActionListener(this);
		
		this.setBounds(100, 100, 350, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		comprobarFichero();

		if (e.getSource()==siguiente) {
			if(mesTexto.getText().equals("1")||mesTexto.getText().equals("3")||mesTexto.getText().equals("5")||mesTexto.getText().equals("7")
					||mesTexto.getText().equals("8")||mesTexto.getText().equals("10")||mesTexto.getText().equals("12")) {
				if(Integer.parseInt(diaTexto.getText())>=1 && Integer.parseInt(diaTexto.getText())<31 ) {
					diaTexto.setText((Integer.parseInt(diaTexto.getText())+1)+"");
				}else {
					diaTexto.setText("1");
					if(!mesTexto.getText().equals("12"))
						mesTexto.setText((Integer.parseInt(mesTexto.getText())+1)+"");
					else {
						mesTexto.setText("1");
						anioTexto.setText((Integer.parseInt(anioTexto.getText())+1)+"");
					}
				}
					
			}else if(mesTexto.getText().equals("4")||mesTexto.getText().equals("6")||mesTexto.getText().equals("9")||mesTexto.getText().equals("11")) {
				if(Integer.parseInt(diaTexto.getText())>=1 && Integer.parseInt(diaTexto.getText())<30 ) {
					diaTexto.setText((Integer.parseInt(diaTexto.getText())+1)+"");
				}else {
					diaTexto.setText("1");
					mesTexto.setText((Integer.parseInt(mesTexto.getText())+1)+"");
				}
			}else {
				if(Integer.parseInt(diaTexto.getText())>=1 && Integer.parseInt(diaTexto.getText())<28 ) {
					diaTexto.setText((Integer.parseInt(diaTexto.getText())+1)+"");
				}else {
					diaTexto.setText("1");
					mesTexto.setText((Integer.parseInt(mesTexto.getText())+1)+"");
				}
			}
			
		}
		
		if(e.getSource()==anterior) {
			if(Integer.parseInt(diaTexto.getText())>1) {
				diaTexto.setText((Integer.parseInt(diaTexto.getText())-1)+"");
			}else {
				if(mesTexto.getText().equals("3")) {
					diaTexto.setText("28");
				}
				else if(mesTexto.getText().equals("2")||mesTexto.getText().equals("4")||mesTexto.getText().equals("6")||mesTexto.getText().equals("9")||mesTexto.getText().equals("11")||
						mesTexto.getText().equals("1")||mesTexto.getText().equals("8")) {
					diaTexto.setText("31");
				}
				else {
					diaTexto.setText("30");
				}
				if(!mesTexto.getText().equals("1"))
					mesTexto.setText((Integer.parseInt(mesTexto.getText())-1)+"");
				else {
					mesTexto.setText("12");
					anioTexto.setText((Integer.parseInt(anioTexto.getText())-1)+"");
				}
			}
		}
		comprobarFichero();
		agendar();
		
	}
	private void comprobarFichero() {
		nombreArchivo="";
		String dia,mes;
		File archivo;
		FileReader fileReader;
		if(Integer.parseInt(diaTexto.getText())<10) {
			dia="0"+diaTexto.getText();
		}else {
			dia=diaTexto.getText();
		}
		if(Integer.parseInt(mesTexto.getText())<10) {
			mes="0"+mesTexto.getText();
		}else
			mes=mesTexto.getText();
		
		nombreArchivo+=dia+mes+anioTexto.getText()+".txt";
		archivo= new File(nombreArchivo);
		if(archivo.exists()) {
			int car=0;
			contenido="";
			try {
				fileReader=new FileReader(nombreArchivo);
				while(car!=-1) {
					car=fileReader.read();
					if(car!=-1) {
						contenido+=(char)car;
					}
				}
				fileReader.close();
				lista.setText(contenido);
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}else {
			lista.setText("");
		}
		
		
	}
	private void agendar() {
		try {
			FileWriter fileWriter=new FileWriter(nombreArchivo);
			fileWriter.write(lista.getText());
			
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
