package lab4_method;

public class Main {

	public static void main(String[] args) {
		
		// task 1
		pentagonal_numbers gp=new pentagonal_numbers();
		int pan=gp.getPentagonalNumber(4);
		System.out.println(pan);
		
		//task 2
		Dg_SUM dj=new Dg_SUM();
		int fan=dj.sumDigits(55);
		System.out.println(fan);
		
		//task 3(part1)
		 Palindrome ft=new  Palindrome();
		 int man=ft.reverse(567);
		 System.out.println(man);
		 
		 //task 3(part 2)
		 boolean pel=ft.isPalindrome(323);
		 System.out.println(pel);
		 
		 
		 //task 4
		 Sort3number sort=new Sort3number();
		 sort.displaySortedNumbers(5, 7,1);
		 
		 
		 //task 5
		Financial on=new Financial();
		double fin=on.futureInvestmentValue(10000,0.05/12,5);
		System.out.println(String.format("%.2f",fin)); 
		
		//task 6
		 Matrix mat=new Matrix();
		 mat.printMatrix(3);
		
		 //task 7
		 MyTriangle tri=new MyTriangle();
		 boolean bool=tri.isValid(1,2,5);
		 System.out.println(bool);
		 double area=tri.area(2,1,3);
		 System.out.println(String.format("%.2f",area));
		 
		 
		 Polygon asus=new Polygon();
		 double areapol=asus.area(5,5);
		 System.out.println(String.format("%.2f",areapol));
		 
		 
		 
		 
		 
		

	}

}
