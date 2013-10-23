/**
 * 
 */
package ArbolBinario;

import javax.swing.*;
import java.util.*;
class ArbolBin
{
NodoArbol raiz=null;
NodoArbol p,q,r;
Stack Pila=new Stack();
int fila=0;
boolean existe(int x)
{
q=p=raiz;
while(p!=null && x!=p.info)
{
q=p;
if(x<p.info)
{
p=p.izq;
}
else
{
p=p.der;
}
}
if(p==null)
return false;
else
return true;
}
boolean adicion(int x)
{
if(existe(x))
return false;
 System.out.println("adicion de: "+x+"raiz: "+raiz+" q:"+q+" p: "+p);
r=new NodoArbol(x);
r.izq=r.der=null;
if(raiz==null)
{
raiz=r;
}
else
{
if(x<q.info)
{
q.izq=r;
}
else
{
q.der=r;
}
}
return true;
}
boolean masderecha(NodoArbol s)
{
Pila=new Stack();
while(s!=null)
{
Pila.push((Object) s);

s=s.der;
}
if(Pila.empty())
return false;
s=(NodoArbol) Pila.pop();
if(p==raiz)
raiz=s;
else
{
if(q.izq==p)
q.izq=s;
else
q.der=s;
}
if(Pila.empty())
return true;
r=(NodoArbol) Pila.pop();
r.der=s.izq;
s.izq=p.izq;
s.der=p.der;
return true;
}
boolean masizquierda(NodoArbol s)
{
Pila=null;
while(s!=null)
{
Pila.push((Object) s);
s=s.izq;
}
if(Pila.empty())
return false;
s=(NodoArbol) Pila.pop();
if(p==raiz)
raiz=s;
else
{
if(q.izq==p)
q.izq=s;
else
q.der=s;
}
if(Pila.empty())
return true;
r=(NodoArbol) Pila.pop();
r.izq=s.der;
s.izq=p.izq;
s.der=p.der;
return true;
}
void caso1Borrado()// P. Es Nodo Terminal
{
if(p==raiz)
raiz=null;
else
{
if(q.izq==p)
q.izq=null;
if(q.der==p)
q.der=null;

}
}
void caso2Borrado()//Hijo Unico. P.der es Null ó P.izq es Null
{
if(p==raiz)
{
if(p.izq==null)
raiz=p.der;
else
raiz=p.izq;
}
else
{
if(p.izq==null)
{
if(q.izq==p)
q.izq=p.der;
else
q.der=p.der;
}
else //p.der==null
{
if(q.izq==p)
q.izq=p.izq;
else
q.der=p.izq;
}
}
}
void caso3Borrado()// Dos Hijos. P.der y P.izq no es null
{
if(!masderecha(p.izq))
if(!masizquierda(p.der))
System.out.println("No se pudo Borrar");
}
boolean borrar(int x)
{
if(!existe(x))
return false;
if(p.izq!=null && p.der!=null)
caso3Borrado();
else
if(p.izq==null && p.der==null)
caso1Borrado();
else
caso2Borrado();
return true;
}
void preorden(NodoArbol p)
{
if(p!=null)
{
System.out.println(p.info);
preorden(p.izq);
preorden(p.der);
}
}
void inorden(NodoArbol p)
{
if(p!=null)

{
inorden(p.izq);
System.out.println(p.info);
inorden(p.der);
}
}
void posorden(NodoArbol p)
{
if(p!=null)
{
posorden(p.izq);
posorden(p.der);
System.out.println(p.info);
}
}
void conteoNodo(NodoArbol p,int A[])
{
if(p!=null)
{
A[0]++;
conteoNodo(p.izq,A);
conteoNodo(p.der,A);
}
}
void contarNodos()
{
int A[]=new int[2];
p=raiz;
conteoNodo(p,A);
System.out.print("El numero de nodos:"+A[0]);
}
void imprimirInorden()
{
System.out.println("Impresion de Arbol en InOrden");
p=raiz;
inorden(p);
}
void imprimirPreorden()
{
System.out.println("Impresion de Arbol en PreOrden");
p=raiz;
preorden(p);
}
void imprimirPosorden()
{
System.out.println("Impresion de Arbol en PosOrden");
p=raiz;
posorden(p);
}
}
class NodoArbol
{
int info;
NodoArbol(int x)
{
info=x;
}

NodoArbol izq,der;
}

