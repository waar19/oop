/**
 * 
 */
import javax.swing.*; 

import java.io.*; 
import java.lang.Math.*; 
import java.util.*; 
/**
 * @author DELL
 *
 */
public class Cola3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		
		int i,opc,nit;
		ColaCir A=new ColaCir(3);
		Info C=new Info();
		Object [] valores = {"1. Adicion","2.Eliminar","3. Consulta","4.Salir"};
		do
		{
			 BufferedReader br;
			 br = new BufferedReader(new InputStreamReader(System.in));
			 

				for(int j=0; j < valores.length;j++){
			 	System.out.println(valores[j]);
			 
		}
		
		System.out.println("Elija la Opcion:");
		
		String mensaje = br.readLine();
		System.out.println("selecciono" + mensaje);
		
		opc=Character.digit(mensaje.charAt(0),10);
		
		switch(opc)
		{
		case 1:
		if(A.llena())
		System.out.println("no se puede atender mas");
		
		else
		{
		
		System.out.println("Escriba el numero nit:");
		C.nit=Integer.parseInt(br.readLine());
		System.out.println("Digite el nombre:");
		C.nomCliente=br.readLine();
		System.out.println("Digite el telefono");
		C.telefono=Integer.parseInt(br.readLine());
		A.adicion(C);
		}
		break;
		case 2:
		if(A.vacia())
		System.out.println("Cola de atencion vacia");
		else
		{
		A.borrar();
		}
		break;
		case 3:
		if(A.vacia())
		System.out.println("cola vacia");
		else
		System.out.println(" Atencion ");
		}
		}
		while(opc!=4);
		}
		}
		class Info
		{
		int nit;
		String nomCliente;
		int telefono;
		}
		class ColaCir
		{
		int min,max,n;
		Info A[];
		
		int i;
		String S=" ";
		public ColaCir(int n)
		{
		min=-1;
		max=-1;
		this.n=n;
		A=new Info[n];
		for(i=0;i<n;i++)
		A[i]=new Info();
		}
		boolean vacia()
		{
		if(min==-1)
		return true;
		else
		return false;
		}
		boolean llena()
		{
		if((min==0 && max==n-1) || (max==min-1))
		return true;
		else
		return false;
		}
		void adicion(Info C)
		{
		if(min==-1)
		min=0;
		if(max==n-1)
		max=0;
		else
		max++;
		A[max].nit=C.nit;
		A[max].telefono=C.telefono;
		A[max].nomCliente=C.nomCliente;;
		}
		void borrar()
		{
		if(min==max)
		min=max=-1;
		else
		if(min==n-1)
		min=0;
		else
		min++;
		}
		String imprime()
		{
		S=" Elemenos de la Cola \n";
		if(max<min)
		{
		consulta(min,n-1);
		consulta(0,max);
		}
		else
		consulta(min,max);
		return S.toString();
		}
		void consulta(int inf,int sup)
		{
			for(i=inf;i<=sup;i++)
			{
			S=S+" "+new String().valueOf(A[i].nit).toString();
			S=S+" "+A[i].nomCliente;
			S=S+" "+new String().valueOf(A[i].telefono).toString()+"\n";
			}
	}

}
