import javax.swing.*; 

import java.io.*; 

import java.lang.Math.*; 

import java.util.*; 

public class Cola2 

{ 

 public static void main(String[]args) throws IOException

 { 

 int i,opc,nit; 

 BiCola A=new BiCola(10); 

 Info C=new Info(); 

 Object [] valores = {"1. Adicion Mas Reciente","2. Adicion Menos Reciente","3. Borrar Menos Reciente","4. Borrar Mas Recientes","5. Consulta","6.Salir"}; 

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

// String resp=(String) JOptionPane.showInputDialog(null,"Elija la Opcion", "Entrada de datos",JOptionPane.QUESTION_MESSAGE, null, valores,valores[0]); 

 opc=Character.digit(mensaje.charAt(0),10); 

 switch(opc) 

 { 

 case 1: 

 if(A.llena()) 

 System.out.println("No se Puede Atender Mas"); 

 else 

 { 

System.out.println("Escriba el número de Nit:");
 C.nit=Integer.parseInt(br.readLine()); 
System.out.println("Digite Nombre:");
 C.nomCliente=br.readLine(); 
System.out.println("Digite Telefono:");
 C.telefono=Integer.parseInt(br.readLine()); 

 A.adicion_max(C); 

 } 

 break; 

 case 2: 

 if(A.llena()) 
System.out.println("No se Puede Atender Mas");

 else 

 if(!A.tope() && !A.minimo()) 

 { 


System.out.println("Escriba el número de Nit:");
 C.nit=Integer.parseInt(br.readLine()); 
System.out.println("Digite Nombre:");
 C.nomCliente=br.readLine(); 
System.out.println("Digite Telefono:");
 C.telefono=Integer.parseInt(br.readLine()); 
  
 A.adicion_min(C); 

 } 

 break; 

 case 3: 

 if(A.vacia()) 

 System.out.println("Cola de Atencion Vacia"); 

 else 

 { 

 A.borra_min(); 

 } 

 break; 

 case 4: 

 if(A.vacia()) 

 System.out.println("Cola de Atencion Vacia"); 

 else 

 { 

 A.borra_max(); 

 }
 break; 

 case 5: 

 if(A.vacia()) 

 System.out.println("BiCola Vacia"); 

 else 

 System.out.println(A.imprime()); 

 } 

 } 

 while(opc!=6); 

 } 

} 

class Info 

{ 

 int nit; 

 String nomCliente; 

 int telefono; 

} 

class BiCola 

{ 

 int min,max,n; 

 Info A[]; 

 int i; 

 public BiCola(int n) 

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

 if(min==0 && max==n-1) 

 return true; 

 else 

 return false; 

 } 

 boolean tope() 

 { 

 if(max==n-1) 

 return true; 

 else 

 return false; 

 } 

 boolean minimo() 

 { 

 if(min==0) 

 return true; 

 else 

 return false; 

 } 

 void adicion_max(Info C)
 { 

 if(min==-1) 

 min=0; 

 max++; 

 A[max].nit=C.nit; 

 A[max].telefono=C.telefono; 

 A[max].nomCliente=C.nomCliente; 

 } 

 void adicion_min(Info C) 

 { 

 min--; 

 A[min].nit=C.nit; 

 A[min].telefono=C.telefono; 

 A[min].nomCliente=C.nomCliente;; 

 } 

 void borra_min() 

 { 

 if(min==max) 

 min=max=-1; 

 else 

 min++; 

 } 

 void borra_max() 

 { 

 if(min==max) 

 min=max=-1; 

 else 

 max--; 

 } 

 String imprime() 

 { 

 String S=" Elemenos de la Cola \n"; 

 for(i=min;i<=max;i++) 

 { 

 S=S+" "+new String().valueOf(A[i].nit).toString(); 

 S=S+" "+A[i].nomCliente; 

 S=S+" "+new String().valueOf(A[i].telefono).toString()+"\n"; 

 } 

 return S.toString(); 

 } 

 }
 