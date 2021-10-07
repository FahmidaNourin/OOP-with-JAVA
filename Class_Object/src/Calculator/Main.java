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
		
		
		Trigono jany=new Trigono();
		jany.setTan(45);
		jany.tan();
		double res=jany.getTan();
		System.out.println(res);
		
		jany.setSin(45);
		jany.sin();
		double res1=jany.getSin();
		System.out.println(res1);
		
		jany.setCos(45);
		jany.Cos();
		double res2=jany.getCos();
		System.out.println(res2);
		
		
		NumSys raf=new NumSys();
		raf.setBin(17);
		raf.bin();
		int Bin=raf.getBin();
		System.out.println(Bin);
		
		raf.setHex(17);
		raf.hexa();
		String Hexa=raf.getHex();
		System.out.println(Hexa);
		
		raf.setOct(17);
		raf.oct();
		int Oct=raf.getOct();
		System.out.println(Oct);
		
		Measurment fa=new Measurment();
		fa.setRed(5);
		fa.setArms(2,4);
		fa.setArms(2);
		fa.Circale();
		fa.Triangle();
		fa.Square();
		System.out.println(fa.getCircale());
		System.out.println(fa.getTriangle());
		System.out.println(fa.getSquare());
		
		Series san=new Series();
		san.setSum(0,100,2);
		
		san.setSub(0,100,2);
		san.setMul(0,100,2);
		san.setdiv(0,100,2);
		san.sumSeries();
		
		san.subSeries();
		System.out.println("series ");
		san.MulSeries();
		san.divSeries();
		
		System.out.println("series "+san.getSum());
		System.out.println(san.getSub());
		System.out.println(san.getMul());
		System.out.println(san.getdiv());
		
		
	}
}
