package esercizi;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamByte {
	
	final private String fileName1 = "src/text_files/datawrite1.txt";
	final private String fileName2 = "src/text_files/datawrite2.txt";
	final private String textToWrite = "Questa è una stringa trasformata in un array di bytes.";
	final private byte[] textToWriteBytes = textToWrite.getBytes(); // Trasformo il testo in un array di bytes.

	public static void main(String[] args) {
		FileOutputStreamByte fosb = new FileOutputStreamByte();
		fosb.run1();
		fosb.run2();
	}
	
	// Con questo metodo stampo la stringa nel file un byte alla volta.
	private void run1() {
		
		try {
			OutputStream os1 = new FileOutputStream(fileName1);
			for (byte b : textToWriteBytes) {
				os1.write(b);
			}
			os1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Con questo metodo stampo la stringa nel file tutta insieme con un array di byte.
	private void run2() {
		try {
			OutputStream os2 = new FileOutputStream(fileName2);
			os2.write(textToWriteBytes);
			os2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
