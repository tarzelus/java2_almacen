public class Lechuga {

//propiedades
private String tipoLechuga;
private String procedencia;
private String color;
private Double eurosUnidad;
private Distribuidor distribuidor;

//métodos getter y setter

public String getTipoLechuga()
		{
			return TipoLechuga;
		}
		
		public void  setTipoLechuga(String tipoLechuga1)
		{
			tipoLechuga=tipoLechuga1;
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

		public int getEurosUniad()
		{
			return EurosUnidad;
		}
		
		public void  setEurosUnidad(int eurosUnidad1)
		{
			eurosUnidad=eurosUnidad1;
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