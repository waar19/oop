
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;

public class ListaEncadenada
{
public static void main(String[]args) throws IOException
{
int i,opc,info;
Listas2 L=new Listas2();
Object [] valores = {"1. Adicion","2. Borrar","3. Consulta Ascendente","4. Consulta Descendente","5.Salir"};
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
System.out.println("Digite Info a Adicionar");
info=Integer.parseInt(br.readLine());
L.adicion(info);
break;
case 2:
System.out.println("Digite Info a Borrar");
info=Integer.parseInt(br.readLine());
L.borrar(info);
break;
case 3:
System.out.println("" + L.consulta_asc());
break;
case 4:
System.out.println("" + L.consulta_desc());
break;
}
}
while(opc!=5);
System.exit(1);
}
}