
import javax.swing.*;

import java.io.*;
import java.lang.Math.*;
import java.util.*;
public class Pila1
{
static double SALDO=0;
public static void main(String[]args) throws IOException
{
int i,opc,nit;
Pila A=new Pila(10);
Info1 C=new Info1();
Object [] valores = {"1. Apilar","2. Desempila","3. Consulta","4.Salir"};
do
{
	
	BufferedReader br;
	br = new BufferedReader(new InputStreamReader(System.in));
	 
	for(int j=0; j < valores.length;j++){
	 	System.out.println(valores[j]);
	 
}
System.out.println("Elija la opcion: ");
String resp=br.readLine();
opc=Character.digit(resp.charAt(0),10);
switch(opc)
{
case 1:
if(A.llena())
System.out.println("No se puede atender mas");
else
{
System.out.println("Escriba el numero de Nit:");
C.nit=Integer.parseInt(br.readLine());
System.out.println("Digite el nombre del cliente");
C.nomCliente=br.readLine();
System.out.println("Digite Telefono");
C.telefono=Integer.parseInt(br.readLine());
A.apila(C);
}
break;
case 2:
if(A.vacia())
System.out.println("Pila de atencion vacia");
else
{
A.desempila();
}
break;
case 3:
if(A.vacia())
System.out.println("Pila vacia");
else
System.out.println("" + A.imprime());
}
}
while(opc!=4);
}
}

