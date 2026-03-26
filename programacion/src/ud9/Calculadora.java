package ud9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JTextField operacion, resultado;
	private JButton[] botones;
	//private JButton cero, coma, igual,dividir,multiplicar,restar,sumar;
	
	public Calculadora() {
		panel=new JPanel();
		operacion=new JTextField(16);
		resultado=new JTextField(16);
		//numeros=new JButton[16];
		//numeros= {new JButton("7"),newJButton("8")};

		/*cero=new JButton();
		coma=new JButton();
		igual=new JButton();
		dividir=new JButton();
		multiplicar=new JButton();
		restar=new JButton();
		sumar=new JButton();*/
		
		panel.add(operacion);
		panel.add(resultado);
		String[] etiquetas = {"7","8","9","+","4","5","6","-","1","2","3","x","0",",","=","/"};

		botones = new JButton[etiquetas.length];

		for (int i = 0; i < etiquetas.length; i++) {
		    botones[i] = new JButton(etiquetas[i]);
		    panel.add(botones[i]);
		    botones[i].addActionListener(this);
		}
		/*for(int i=0;i<numeros.length;i++) {
			numeros[i]=new JButton((i+1)+"");
			panel.add(numeros[i]);
			if((i+1)%3==0) {
				panel.add
			}
		}*/
		
		this.add(panel);
		
		this.setBounds(100, 100, 200, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String operador="";
		//if(e.getSource()==botones[0]||e.getSource()==botones[1]||e.getSource()==botones[2]||e.getSource()==botones[4])
		for(int i=0;i<botones.length;i++) {
			if(e.getSource()==botones[i] && e.getSource()!=botones[botones.length-2]) {
				operacion.setText(operacion.getText()+botones[i].getActionCommand());
			}
		}
		if(e.getSource()==botones[3]||e.getSource()==botones[7]||e.getSource()==botones[11]||e.getSource()==botones[15]) {
			
		}
		//System.out.println(suma);
		
	}
	
	

}
