
public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new  Cuadrado ("Cuadrado", 10);
		Rectangulo r1 = new Rectangulo ("Rectangulo", 20, 10);
		Rombo rm1 = new Rombo ("Rombo", 10, 5, 3);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(rm1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Triangulo t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculoTriangulo
	public static void imprimirCalculo(Cuadrado c) {
		System.out.println(c);
		System.out.println("+========================================");
		System.out.println("|El área de ["+c.getName()+"] es: " + c.calcularArea() + 
				"\n" + "|El perímetro de ["+c.getName()+"] es: " + c.calcularPerimetro());
		System.out.println("+========================================");
	}
		public static void imprimirCalculo(Rectangulo r) {
			System.out.println(r);
			System.out.println("+========================================");
			System.out.println("|El área de ["+r.getName()+"] es: " + r.calcularArea() + 
					"\n" + "|El perímetro de ["+r.getName()+"] es: " + r.calcularPerimetro());
			System.out.println("+========================================");
	}
		public static void imprimirCalculo(Rombo rm1) {
			System.out.println(rm1);
			System.out.println("+========================================");
			System.out.println("|El área de ["+rm1.getName()+"] es: " + rm1.calcularArea() + 
					"\n" + "|El perímetro de ["+rm1.getName()+"] es: " + rm1.calcularPerimetro());
			System.out.println("+========================================");
	}
}//class testFiguras