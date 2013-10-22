import javax.swing.*;

class Nodo {
int info;
Nodo(int info) {
this.info = info;
}
Nodo sig;
}
class Listas
{
Nodo p,q,r;
Nodo cab=null;
boolean busca_ant(int x)
{
p=q=cab;
while(p!=null && p.info!=x)
{
q=p;
p=p.sig;
}
if(p!=null)
return true;
else
return false;
}
void recorre_ant()
{
p=q=cab;
while(p!=null)
{
q=p;
p=p.sig;
}
}
void adicion(int x)
{
if(!busca_ant(x))
{
r=new Nodo(x);
if(cab==null)
cab=r;
else
q.sig=r;
r.sig=null;
}
}
void borrar(int x)
{
if(busca_ant(x))
{
if(p==cab)
cab=cab.sig;
else
q.sig=p.sig;
}
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

	