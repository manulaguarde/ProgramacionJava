package Ud6;

import java.util.Random;

public class Password {

	private String contrasenia;
	private int longitud;
	
	public Password() {
		longitud=8;
		contrasenia=generaPassword();
	}

	public Password (int longitud) {
		this.longitud=longitud;
		contrasenia=generaPassword();
	}
	public String generaPassword() {
		Random genAle=new Random();
		String psw="", caracteres="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
		for(int i=0;i<longitud;i++) {
			psw+=caracteres.charAt(genAle.nextInt(caracteres.length()));
		}
		return psw;
	}
	public boolean esFuerte() {
		int minus=0,mayus=0,nums=0;
		for(int i=0;i<contrasenia.length();i++) {
			if(Character.isLowerCase(contrasenia.charAt(i))) {
				minus++;
			}else if(Character.isUpperCase(contrasenia.charAt(i))) {
				mayus++;
			}else if (Character.isDigit(contrasenia.charAt(i))){
				nums++;
			}
		}
		if(mayus>2 && minus>1 && nums>5) {
			return true;
		}
		return false;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	
}
