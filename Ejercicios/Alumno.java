/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Alumno {
	
	int info;
	int Cod;
	String Nombre;
	Alumno(int Cod,String Nombre) {
	this.Cod = Cod;
	this.Nombre = Nombre;
	}
	Alumno sig;
	}
	class Programa
	{
	int Id;
	String Nombre;
	Programa sig;
	Alumno p,q,r;
	Alumno cab=null;
	Alumno ult=null;
	Programa(int Id,String Nombre) {
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
	r=new Alumno(x,y);
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