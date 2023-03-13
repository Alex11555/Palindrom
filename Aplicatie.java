 import java.util.Scanner;
 class Aplicatie{
	 
	 public static void main(String[] args)
	 {
		 Palindrom p=new Palindrom();
		 int x;
		 System.out.println(" ");
		 System.out.println("Programul urmator va determina daca un numar introdus de la tastatura este sau nu palindrom.");
		 Scanner s=new Scanner(System.in);
		 System.out.print("Introduceti valoarea lui x: ");
		 x=s.nextInt();
		 p.Setter(x);
		 if(p.Rez()==1)
			 System.out.println("Numarul este palindrom.");
		 else
			 System.out.println("Numarul nu este palindrom.");
	 }
 }
		 
		 
		