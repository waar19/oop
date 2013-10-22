import javax.swing.*;

public class Nodo2 {
int info;
Nodo2(int info) {
this.info = info;
}
Nodo2 sig;
}
class Listas
{
Nodo2 p,q,r;
Nodo2 cab=null;
Nodo2 ult=null;
boolean vacia()
{
if(cab==null)
return true;
else
return false;
}
void adicion(int x)
{
r=new Nodo2(x);
if(cab==null)
cab=r;
else
ult.sig=r;
ult=r;
r.sig=cab;
}
void borrar()
{
if(cab==ult)
cab=ult=null;
else
{
cab=cab.sig;
ult.sig=cab;
}
}
String consulta()
{
String S="C O N S U L T A \n" ;
p=cab;
do
{
S+=p.info+"\n";
p=p.sig;
}
while(p!=cab);
return S.toString();
}
}
