package ej5;

import java.io.*;
public class ProgramaMultiproceso {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		try {	

			Process proceso1 = runtime.exec("ls -la");
			Process proceso2 = runtime.exec("tr 'r' 'R'");
			
			InputStream is1 = proceso1.getInputStream();
			BufferedReader br1= new BufferedReader(new InputStreamReader (is1));
			
			OutputStream os2 = proceso2.getOutputStream();
			BufferedWriter bw2= new BufferedWriter(new OutputStreamWriter(os2));
			
			String linea = br1.readLine();	
			
			while (linea != null){
				bw2.write(linea + "\n"); 
				linea = br1.readLine();
				}
			br1.close();
			is1.close();
			bw2.close();
			os2.close();
			
			InputStream is2 = proceso2.getInputStream();
			BufferedReader br2= new BufferedReader(new InputStreamReader (is2));
			
			String lineaPantalla = br2.readLine();
			while (lineaPantalla != null){
				System.out.println(lineaPantalla);
				lineaPantalla = br2.readLine();				
			}
			br2.close();
			is2.close();			
		}catch(IOException ex){
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}		
	}
}
