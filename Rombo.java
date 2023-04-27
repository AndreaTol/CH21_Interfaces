
public class Rombo {
	private String name;
	private double menor;
	private double mayor;

	private double lado;

	public Rombo(String name, double menor, double mayor, double lado) {
		this.name = name;
		this.menor = menor;
		this.mayor = mayor;
		this.lado = lado;
	}

	public double calcularArea() {
		return (getMenor() * getMayor())/2;
		}

	public double calcularPerimetro() {
		return (lado * 4);
	}// calcularPerimetro

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMenor() {
		return menor;
	}

	public void setMenor(double menor) {
		this.menor = menor;
	}

	public double getMayor() {
		return mayor;
	}

	public void setMayor(double mayor) {
		this.mayor = mayor;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", menor=" + menor + ", mayor=" + mayor + ", lado=" + lado + "]";
	}

	
}// class Rombo
