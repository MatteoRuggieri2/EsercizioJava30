package esercizi;

public class FileOutputStream {
	
	final private String fileName = "src/text_files/file_output_stream_byte.txt";
	final private String textToWrite = "Questa è una stringa trasformata in un array di bytes.";

	public static void main(String[] args) {
		new FileOutputStream().run();
	}
	
	private void run() {
		System.out.println("test");
	}

}
