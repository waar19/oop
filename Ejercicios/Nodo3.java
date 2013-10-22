
import javax.swing.*;
import java.io.*;

class Nodo3 {
int info;
Nodo3(int info) {
this.info = info;
}
Nodo3 sig;
Nodo3 ant;
}
class Listas2
{
Nodo3 p,q,r;
Nodo3 cab=null;
Nodo3 ult=null;
boolean vacia()
{
if(cab==null)
return true;
else
return false;
}
boolean esta(int x)
{
p=q=cab;
while(p!=null && p.info<x)
{
q=p;
p=p.sig;
}
if(p!=null && p.info==x)
return true;
else
return false;
}
void primero(int x)
{
r=new Nodo3(x);
cab=ult=r;
r.ant=null;
r.sig=null;
}
void insertar(int x)
{
r=new Nodo3(x);
q.sig=r;
p.ant=r;
r.ant=q;
r.sig=p;
}
void menor(int x)
{
r=new Nodo3(x);
r.sig=cab;
r.ant=null;
cab.ant=r;
cab=r;
}
void mayor(int x)
/*UNIVERSIDAD NACIONAL ABIERTA Y A DISTANCIA – UNAD
ESCUELA DE CIENCIAS BASICAS TECNOLOGIA E INGENIERIA
GUIA COMPONENTE PRÁCTICO DEL CURSO: 301403 – PROGRAMACION ORIENTADA A OBJETOS
*/
{
r=new Nodo3(x);
ult.sig=r;
r.ant=ult;
r.sig=null;
ult=r;
}
void adicion(int x)
{
if(vacia())
primero(x);
else
if(x>ult.info)
mayor(x);
else
if(x<cab.info)
menor(x);
else
if(!esta(x))
insertar(x);
}
void borrar(int x)
{
if(esta(x))
{
if(p==cab)
{
if(cab==ult)
cab=ult=null;
else
{
cab=cab.sig;
cab.ant=null;
}
}
else
if(p==ult)
{
ult=ult.ant;
ult.sig=null;
}
else
{
r=p.sig;
q.sig=r;
r.ant=q;
}
}
}
String consulta_asc()
{
String S="C O N S U L T A \n" ;
p=cab;
while(p!=null)
{
S+=p.info+"\n";
p=p.sig;
}
return S.toString();
}

String consulta_desc()
{
String S="C O N S U L T A \n" ;
p=ult;
while(p!=null)
{
S+=p.info+"\n";
p=p.ant;
}
return S.toString();
}
}
