package exception;

public class exceptionTest { 
	
	public static void main (String[] args) { 
	int i, nbEntiers=0, factorielle=1;
	int ancien;
	try {
		
	nbEntiers= Integer.parseInt(args[0]);
	if (nbEntiers < 0) {
        throw new negatifexception();
    }
	for (i=2;i<= nbEntiers;i++)
	{
	ancien=factorielle;
	factorielle *= i;
	}
	System.out.println(" Voila la factorielle des "+ nbEntiers +
	" premiers entiers : "+ factorielle );
	}
	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erreur tableau vide");
	}
	catch (NumberFormatException e) {
		System.out.println("erreur non-entier");
	}
	catch (negatifexception e) {
        System.out.println(e.getMessage());
    }
	}
}
	
