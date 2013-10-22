class Nodo4{
int info;
Nodo4(int info) {
this.info = info;
}
Nodo4 sig;
}
class Lista
{
Nodo4 p,r;
Nodo4 cab=null;
boolean vacia()
{
if(cab==null)
return true;
else
return false;
}
void adicion(int x)
{
r=new Nodo4(x);
r.sig=cab;
cab=r;
}
void borrar()
{
cab=cab.sig;
}
String consulta()
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
}
