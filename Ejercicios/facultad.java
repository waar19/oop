/**
 * 
 */
import javax.swing.*;
/**
 * @author DELL
 *
 */
public class facultad
{
Programa2 p,q,r;
Programa2 cab=null;
Programa2 ult=null;
boolean vacia()
{
if(cab==null)
return true;
else
return false;
}
void adicion(int x,String y)
{
r=new Programa2(x,y);
if(cab==null)
cab=r;
else
ult.sig=r;
ult=r;
r.sig=null;
}
void borrar()
{
if(cab==ult)
cab=ult=null;
else
cab=cab.sig;
}
boolean existe(int id)
{
p=cab;
while(p!=null && p.Id!=id)
p=p.sig;
if(p==null)
return false;
else
return true;
}
void borrarAlumno()
{
if(!p.vacia())
p.borrar();
}
void adicionAlumno(int x,String y)
{
p.adicion(x,y);
}
String consulta()
{
String S="C O N S U L T A D E P R O G R A M A S \n" ;
p=cab;
while(p!=null)
{
S+=p.Id+" "+p.Nombre+"\n";
p=p.sig;
}
return S.toString();
}
String consultaTodo()
{
String S="C O N S U L T A D E P R O G R A M A S \n" ;
S+=p.Id+" "+p.Nombre+"\n";
S+=p.consulta();
return S.toString();
}
}
