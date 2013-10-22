/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Alumno2 {
	int Cod;
	String Nombre;
	Alumno2(int Cod,String Nombre) {
	this.Cod = Cod;
	this.Nombre = Nombre;
	}
	Alumno2 sig;
	}

    class Programa2
	{
	int Id;
	String Nombre;
	Programa2 sig;
	Alumno2 p,q,r;
	Alumno2 cab=null;
	Alumno2 ult=null;
	Programa2(int Id,String Nombre) {
	this.Id = Id;
	this.Nombre = Nombre;
	}
	boolean vacia()
	{
	if(cab==null)
	return true;
	else
	return false;
	}
	void adicion(int x,String y)
	{
	r=new Alumno2(x,y);
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
	String consulta()
	{
	String S="C O N S U L T A D E A L U M N O S \n" ;
	p=cab;
	while(p!=null)
	{
	S+=p.Cod+" "+p.Nombre+"\n";
	p=p.sig;
	}
	return S.toString();
	}
	}