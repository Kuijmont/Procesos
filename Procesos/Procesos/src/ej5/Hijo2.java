package ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hijo2 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line.toUpperCase());
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
