public class Manzana {
//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;

//métodos getter y setter

	public String getTipoManzana()
		{
			return TipoManzana;
		}
		
	public void  setTipoManzana(String tipoManzana1)
		{
			tipoManzana=tipoManzana1;
		}

	public String getProcedencia()
		{
			return Procedencia;
		}
		
	public void  setProcedencia(String procedencia1)
		{
			procedencia=procedencia1;
		}

	public String getColor()
		{
			return Color;
		}
		
	public void  setColor(String color1)
		{
			color=color1;
		}

	public int getEurosKilo()
		{
			return EurosKilo;
		}
		
	public void  setEurosKilo(int eurosKilo1)
		{
			eurosKilo=eurosKilo1;
		}

	public Distribuidor getDistribuidor()
		{
			return Distribuidor;
		}
		
	public void  setDistribuidor(Distribuidor distribuidor1)
		{
			distribuidor=distribuidor1;
		}
}

