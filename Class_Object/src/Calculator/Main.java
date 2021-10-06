package Calculator;

public class Main {

	public static void main(String[] args) {

		Normal nou = new Normal(); // nou is the object of Normal class
		nou.setAdd(1,2);
		nou.Add();
		float pro=nou.getAdd();
		System.out.println(pro);
		nou.setSub(1,2);
		nou.Sub();
		float pro1=nou.getSub();
		System.out.println(pro1);
		nou.setMul(1,2);
		nou.Mul();
		float pro2=nou.getMul();
		System.out.println(pro2);
		nou.setDiv(1,2);
		nou.Div();
		float pro3=nou.getDiv();
		System.out.println(pro3);
		
	}

}
