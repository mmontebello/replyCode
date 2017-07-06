package formatName;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class mainClass {
	
	public static void main(String [] args){
	
		
		String line;
		String header="lemma,poscode,surface";
		String file_input="./cognomi.txt";
		String file_output="./cognomiDict.csv";


		try
		{
			
			BufferedReader reader = new BufferedReader(new FileReader(file_input));						
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file_output))));
			bw.write(header);
							
			while ((line = reader.readLine()) != null)
			{
				String [] words=line.split("\\s+");
				
				for (String word : words)
				{
					if(word.length()!=0){
						
						bw.newLine();	
						bw.write(word+",3,"+word);	
						
					}
				}
			}
			
		bw.close();
		reader.close();
		
		}
		
		catch(Exception e)
		{
			
		e.printStackTrace();
		
		}
	
	}
}

