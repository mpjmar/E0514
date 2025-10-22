public class App {
    public static void main(String[] args) throws Exception {
        
		int base = 0;
		int exp = 0;
		boolean correcto = false;

		System.out.println("Cáculo de una potencia");
		
		do {
			try {
				base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
				exp = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
				correcto = true;
			} catch (NumberFormatException e) {
				System.out.println("Solamente se admiten enteros");
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error inesperado");
			}
		} while (!correcto);

		int res = base;
		if (exp == 0)
			res = 1;
		else {
			for (int i = 1; i < exp; i++)
				res *= base;
		}	
		System.out.printf("%d^%d = %d%n", base, exp, res);
    }
}
