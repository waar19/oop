import javax.swing.*; 

import java.io.*; 

import java.lang.Math.*; 

import java.util.*; 

public class Cola1 
{ 

 static double SALDO=0; 

 public static void main(String[]args) throws IOException 

 { 

 int i,opc,nit; 

 Cola A=new Cola(10); 

 Cola B=new Cola(20); 

 Cliente C=new Cliente(); 

 Object [] valores = {"1. Adicion","2. Borrar","3. Consulta Por Atender","4. Consulta Atendidos","5.Salir"}; 
 
 do 

 { 
 BufferedReader br;
 br = new BufferedReader(new InputStreamReader(System.in));


	for(int j=0; j < valores.length;j++){
 	System.out.println(valores[j]);
 	
 }
    System.out.println("Introduzca la opcion y presione enter:");
	String mensaje = br.readLine();
	System.out.println("Escogio: " + mensaje);

	 opc=Character.digit(mensaje.charAt(0),10); 


 switch(opc) 

 { 

 case 1: 

System.out.println(("Escriba el número de Nit:"));
 C.nit=Integer.parseInt(br.readLine()); 

 if(A.existe(C.nit) || B.existe(C.nit)) 

 System.out.println("Existe Nit"); 

 else 

 if(A.llena()) 

 System.out.println(":: No se Puede Atender Mas ::"); 

 else 

 { 
 System.out.println("Digite Nombre:");
 
 C.nomCliente=br.readLine(); 
 
 System.out.println("Digite Telefono:");
 
 C.telefono=Integer.parseInt(br.readLine());

 A.adicion(C); 

 } 

 break; 

 case 2: 

 if(A.vacia()) 

 System.out.println("--> Cola de Atencion Vacia <--"); 

 else 

 { 

 A.borra(C); 

 if(!B.llena()) 

 B.adicion(C); 

 } 

 break; 

 case 3: 

 if(A.vacia()) 

System.out.println("++ Cola de Atencion Vacia ++"); 

 else 

 System.out.println(A.imprime(" Atencion ")); 

 break; 

 case 4:
 if(B.vacia()) 

 System.out.println("** Cola de Atendidos Vacia **"); 

 else 

 System.out.println(B.imprime(" Atencion ")); 

 } 

 } 

 while(opc!=5); 


 } 

} 

class Cliente 

{ 

 int nit; 

 String nomCliente; 

 int telefono; 

} 

class Cola 

{ 

 int min,max,n; 

 Cliente A[]; 

 int i; 

 public Cola(int n) 

 { 

 min=-1; 

 max=-1; 

 this.n=n; 

 A=new Cliente[n]; 

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

 if(max==n-1) 

 return true; 

 else 

 return false; 

 } 

 void adicion(Cliente C) 

 { 

 if(min==-1) 

 min++; 

 max++; 

 A[max]=new Cliente(); 

 A[max].nit=C.nit; 

 A[max].telefono=C.telefono; 

 A[max].nomCliente=C.nomCliente; 

 } 

 void borra(Cliente C) 

 { 

 C.nit=A[min].nit; 

 C.telefono=A[min].telefono; 

 C.nomCliente=A[min].nomCliente; 

 if(min==max) 

 min=max=-1; 

 else 

 min++;
 
 } 

 boolean existe(int nit) 

 { 

 boolean esta=false; 

 if(!vacia()) 

 for(i=min;i<=max && ! esta;i++) 

 if(A[i].nit==nit) 

 esta=true; 

 return esta; 

 } 

 String imprime(String Aviso) 

 { 

 String S=" Elemenos de la Cola de: "+Aviso.toString()+"\n"; 

 for(i=min;i<=max;i++) 

 { 

 S=S+" "+new String().valueOf(A[i].nit).toString(); 

 S=S+" "+A[i].nomCliente; 

 S=S+" "+new String().valueOf(A[i].telefono).toString()+"\n"; 

 } 

 return S.toString(); 

 }
 }