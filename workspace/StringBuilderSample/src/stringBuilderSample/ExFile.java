package stringBuilderSample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.text.View;

public class ExFile {

	public static void main(String[] args) throws IOException{
		try {
			File f = new File("/tmp/output.txt");
			
			if (!f.exists()) {
				f.createNewFile();
				System.out.println("Criado!!");
			}else {
				System.out.println("Existe!!");
				
				System.out.println("Criado em: "+ new Date(f.lastModified()));
				System.out.println(f.getTotalSpace());
			}
				
			
			
			
			
		} finally{
			
			
		}

	}

}
