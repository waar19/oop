import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ListaCola
{
public static void main(String[]args) throws IOException 
{
int i,opc,info;
Listas L=new Listas();
Object [] valores = {"1. Adicion","2. Borrar","3. Consulta","4.Salir"};
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
if(!L.vacia())
L.borrar();
break;
case 3:
System.out.println("" + L.consulta());
break;
}
}
while(opc!=4);
System.exit(1);
}
}