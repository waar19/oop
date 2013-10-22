import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author DELL
 *
 */
public class MultiListas {

		public static void main(String[]args)throws IOException
		{
		int i,opc,cod,id;
		String Nombre;
		facultad L=new facultad();
		Object [] valores = {"1. Adicion Programa","2. Borrar Programa","3. Consulta Programa","4.Adicion Alumno","5.Borrar Alumno","6. Consulta","7.Salir"};
		do
		{
			
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(System.in));
			 
			for(int j=0; j < valores.length;j++){
			 	System.out.println(valores[j]);
			 
		}
		System.out.println("Elija la opcion");
		String resp=br.readLine();
		opc=Character.digit(resp.charAt(0),10);
		switch(opc)
		{
		case 1:
		System.out.println("Digite el codigo del programa a adicionar");
		cod=Integer.parseInt(br.readLine());
		System.out.println("Digite Nombre del programa a adicionar:");
		Nombre=br.readLine();
		L.adicion(cod,Nombre);
		break;
		case 2:
		if(!L.vacia())
		L.borrar();
		break;
		case 3:
		System.out.println("" + L.consulta());
		break;
		case 4:
		case 5:
		case 6:
		System.out.println("Digite el codigo del programa");	
		cod=Integer.parseInt(br.readLine());
		if(L.existe(cod))
		switch(opc)
		{
		case 4:
		System.out.println("Digite el codigo del alumno a adicionar");
		cod=Integer.parseInt(br.readLine());
		System.out.println("Digite el nombre del alumno a adicionar");
		Nombre=br.readLine();
		L.adicionAlumno(cod,Nombre);
		break;
		case 5:
		L.borrarAlumno();
		break;
		case 6:
		System.out.println("" + L.consultaTodo());
		}
		}
		}
		while(opc!=7);
		System.exit(1);
		}
		
	}


