
public class ExercicioSete {
	public static void main(String[] args) {
		double l1 = 4, l2 = 5, l3 = 7;
		
		if(l1 == l2 && l1 == l3) {
			System.out.println("Equilátero: 3 lados iguais.");
		}
		else if(l1 == l2 || l2 == l3 || l1 == l3) {
			System.out.println("Isósceles: 2 lados iguais.");
		}
		else {
			System.out.println("Escaleno: 3 lados diferentes.");
		}
	}
}
