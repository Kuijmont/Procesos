package practica2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PrivilegedAction;
import java.util.Scanner;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class Conectar {

	public static void main(String[] args) {
		//Creamos el cliente.
		FTPClient cliente = new FTPClient();
		//Conecta al servidor FTP.
		try {
			System.out.print("Conectando a servidor...");
			cliente.connect("localhost",21);
			cliente.login("mortadelo","");
			System.out.print("Conectado\n");
		} catch (IOException e) {
			System.out.println("No ha sido posible conectar. Saliendo...");
			System.exit(0);
		}
		//Creo un directorio para hacer pruebas con archivos.
		try {
			System.out.print("Creando nuevo directorio...");
			cliente.makeDirectory("PruebaProcesos");
			System.out.print("Operación exitosa.\n");
			System.out.print("Cambiando de directorio de trabajo al nuevo directorio...");
			cliente.changeWorkingDirectory("/PruebaProcesos");
			System.out.print("Operación exitosa.\n\n");
		} catch (IOException e) {
			System.out.println("No ha sido posible realizar la operación. Saliendo...");
			System.exit(0);
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menu();
			String resp=sc.nextLine();
			boolean salir = false;
			switch(resp) {
				case "1":
					try {
						//Definimos el tipo de archivo que vamos a subir a la carpeta.
						cliente.setFileType(FTP.BINARY_FILE_TYPE);
						//Pedimos un nombre para el archivo.
						System.out.print("Introduce el nombre del archivo: ");
						String nombre = sc.nextLine();
						//Creamos un archivo al que hacer referencia con el InputStream.
						File f = new File("C:\\Users\\Alumno\\Desktop\\prueba.txt");
						//f.createNewFile();
						//Enviamos el archivo a la carpeta.
			            BufferedInputStream ois = new BufferedInputStream(new FileInputStream(f));
			            cliente.storeFile(nombre, ois);
			            System.out.println(cliente.getReplyString());
			            System.out.println("Archivo subido de forma satisfactoria.");
			            //Cierra el envío de archivos al FTP.
			            ois.close(); 
					}catch (Exception e) {//Si ocurre algún error, se mostrará.
						System.out.println("No se ha podido subir el fichero.\n"+e.getMessage());
					}
					break;			
				case "2":
					try {
						//Definimos el tipo de archivo que vamos a subir a la carpeta.
						cliente.enterLocalPassiveMode();
						cliente.setFileType(FTP.BINARY_FILE_TYPE);
						//Pedimos el nombre del archivo.
						System.out.print("Introduce el nombre del archivo que quieres descargar: ");
						String nombre = sc.nextLine();
						//Descargamos el archivo donde se supone que tenemos que descargarlo.
						File f = new File("C:\\Users\\Alumno\\Downloads\\"+nombre);
			            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
			            if(cliente.retrieveFile(nombre, bos)) {
				            System.out.println("Operación exitosa");
			            }else {
			            	System.out.println("No se ha podido descargar.");
			            }
			            bos.close(); 
					}catch (Exception e) {//Si ocurre algún error, se mostrará.
						System.out.println("No se ha descargar el fichero.\n"+e.getMessage());
					}
					break;
				case "0":
					System.out.println("Saliendo...");
					salir=true;
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				case "3":
					try {
						//Mostramos los archivos en el directorio.
						System.out.println("Archivos en directorio "+ cliente.printWorkingDirectory()+":");
						FTPFile[] archivos = cliente.listFiles();
						for(int i=0; i<archivos.length;i++){
							System.out.println("-"+archivos[i].getName());
						}
						System.out.println("\n");
					}catch(Exception e){
						System.out.println("No se ha podido mostrar los datos.\n"+e.getMessage());
					}
					break;
			}
			if(salir) {
				break;
			}else {
				System.out.println("\n\n");
			}
		}
	}
	
	public static void menu() {
		System.out.println("1-Subir un archivo.");
		System.out.println("2-Descargar un archivo.");
		System.out.println("3-Mostrar los archivos del sevidor.");
		System.out.println("0-SALIR.");
	}
}