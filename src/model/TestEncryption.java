package model;

import java.io.UnsupportedEncodingException;

public class TestEncryption {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String key = "1234567891234567";
		
		
		
		AES256 base = new AES256(key);
		
		String encypted = "";
		
		System.out.println("Encrypted Data: " + (encypted = base.encrypt("This is Ganesh Calling...")));
		
		System.out.println("Decrypted Data: " + base.decrypt(encypted));
		
		
		
	}

}
