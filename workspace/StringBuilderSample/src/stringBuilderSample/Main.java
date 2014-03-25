package stringBuilderSample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		FileReader reader = null;
		
		
		try {
			
				
			char [] buffer=new char[20];
			reader = new FileReader("/usr/share/dict/american-english");
			
			
			int count=0;
			
			
			StringBuilder text= new StringBuilder();
			while (reader.ready()) {
				reader.read(buffer);
				text.append(buffer);
				System.out.println("Adicionado palavra nro.: "+ (++count));
				
			}
			System.out.println(text);
			reader.close();
		} finally{
			reader.close(); //se der erro, pelo menos ele fecha o arquivo
		}

	}

}
