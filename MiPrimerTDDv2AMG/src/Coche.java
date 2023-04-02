
public class Coche {

	public int velocidad;

	public void acelerar_AngelMacia(int aceleracion) {
		velocidad += aceleracion;
	}

	public void decelerar_AngelMacia(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad <0) velocidad = 0;
	}

}
