package esercizi;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamByte {
	
	final private String fileName = "src/text_files/datawrite1.txt";
	final private String textToWrite = "Questa è una stringa trasformata in un array di bytes.";

	public static void main(String[] args) {
		FileOutputStreamByte fosb = new FileOutputStreamByte();
		fosb.run1();
	}
	
	private void run1() {
		
		try {
			OutputStream os1 = new FileOutputStream(fileName);
			os1.write(textToWrite.getBytes()); // Trasformo il testo in un array di bytes.
			os1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void run2() {
		
	}

}
