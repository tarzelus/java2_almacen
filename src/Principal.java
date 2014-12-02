import java.util.*;
import java.io.*;

public class Principal {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{
			String ruta = "/home/zubiri/Proyectosjava/java2_almacen/src/distribuidores.txt";
 			File archivo2 = new File(ruta);
			FileReader leer2 = new FileReader (archivo2);
			BufferedReader bf2 = new BufferedReader(leer2);
			String salida2 = bf2.readLine();

	        
	        
	        String [] cortarString = null;
	        String [] cortarString1 = null;	
	        String [] cortarString2 = null;	
	        String [] cortarString3 = null;	

	        System.out.println("\nDistribuidores");
	        while(salida2!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	cortarString = salida2.split("#");
	        
	        	
	       		Distribuidor distribuidor = new Distribuidor();
	       		cortarString1 = cortarString[0].split(",");
	       		distribuidor.setNombre (cortarString1[0]);
	       		distribuidor.setCif (cortarString1[1]);

	       		Direccion direccion = new Direccion();
	       		cortarString2 = cortarString[1].split(",");
	       		direccion.setCiudad  (cortarString2[0]);
	       		direccion.setCalle  (cortarString2[1]);
	       		direccion.setPiso  (cortarString2[2]);
	       		direccion.setPortal  (Integer.parseInt(cortarString2[3]));
	       		direccion.setCodPostal  (Integer.parseInt(cortarString2[4]));
	       		distribuidor.setDireccion(direccion);

	       		Contacto contacto = new Contacto();
	       		cortarString3 = cortarString[2].split(",");
	       		contacto.setNombre (cortarString3[0]);
	       		contacto.setApellido (cortarString3[1]);
	       		contacto.setDni (cortarString3[2]);
	       		contacto.setEmail (cortarString3[3]);
	       		contacto.setTelefono (Integer.parseInt(cortarString3[4]));
	       		distribuidor.setPersonaContacto(contacto);
	       		//cortara lo previamente cortado y se ha guardado en la posicion 1 
	       	
	       		//hay que recorrer el string de cortarstring por puede que haya mas de un ingrediente
	       		
	       		distribuidores.add(distribuidor);
	       		

	       		
	       		
	       		salida2 = bf2.readLine();
	        }

	        //-----------------impresion de los Distribuidores-------------------

	        for(int d=0; d<distribuidores.size(); d++)
        	{
            	System.out.println("  ---------------------------------\n");
            		System.out.println(" Nombre: "+distribuidores.get(d).getNombre() );
            		System.out.println(" \nCIF: "+distribuidores.get(d).getCif());
            		//---
            		System.out.println(" \nDireccion:" );
            		System.out.println(" \n     Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
            		System.out.println(" \n     Calle: "+ distribuidores.get(d).getDireccion().getCalle());
            		System.out.println(" \n     Piso: "+ distribuidores.get(d).getDireccion().getPiso());
            		System.out.println(" \n     Portal: "+ distribuidores.get(d).getDireccion().getPortal());
            		System.out.println(" \n     Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
            		//---
            		System.out.println(" \nContacto: " );
            		System.out.println(" \n     Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
            		System.out.println(" \n     Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
            		System.out.println(" \n     DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
            		System.out.println(" \n     Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
            		System.out.println(" \n     Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
            		/*System.out.println(" \n     Calle: "+ partidos.get(d).getCant_militantes());
            		System.out.println(" \n     Piso: "+ partidos.get(d).getPrevias_elecciones());*/
        	}	
	        
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }

}
}