/**
 * 
 */
package ArbolBinario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * @author DELL
 *
 */
public class Arbol {
		static double SALDO=0;
		public static void main(String[]args) throws IOException
		{
		int info,opc;
		ArbolBin A=new ArbolBin();
		Object [] valores = {"1. Adicion","2. Borrar","3. Consulta En PreOrden","4. Consulta en InOrden","5. Consulta en PosOrden","6. Conteo de Nodos","7.Salir"};
		do
		{
			
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(System.in));
			 
			for(int j=0; j < valores.length;j++){
			 	System.out.println(valores[j]);
			 
		}

		System.out.print("Elija la opcion:");
		String resp=br.readLine();
		opc=Character.digit(resp.charAt(0),10);
		switch(opc)
		{
		case 1:
		System.out.println("Escriba info a Adicionar:");
		info=Integer.parseInt(br.readLine());
		if(!A.adicion(info))
		System.out.println("Existe Info");
		break;
		case 2:
		System.out.println("Escriba info a Borrar:");
		info=Integer.parseInt(br.readLine());
		if(!A.borrar(info))
		System.out.println("No existe Info");
		break;
		case 3:
		A.imprimirPreorden();
		break;
		case 4:
		A.imprimirInorden();
		break;
		case 5:
		A.imprimirPosorden();
		break;
		case 6:
		A.contarNodos();
		break;
		}
		}
		while(opc!=7);
		System.exit(0);
		}
		}