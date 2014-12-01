public class Distribuidor {
//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

//metodos getter y setter
	public String getNombre()
			{
				return Nombre;
			}
			
			public void  setNombre(String nombre1)
			{
				nombre=nombre1;
			}

	public String getCif()
			{
				return Cif;
			}
			
			public void  setCif(String cif1)
			{
				cif=cif1;
			}


	public Direccion getDireccion()
			{
				return Direccion;
			}
			
			public void  setDireccion(Direccion dirección1)
			{
				direccion1=direccion1;
			}


	public Contacto getPersonaContacto()
			{
				return PersonaContacto;
			}
			
			public void  setPersonaContacto(Contacto personaContacto1)
			{
				personaContacto=personaContacto1;
			}
}