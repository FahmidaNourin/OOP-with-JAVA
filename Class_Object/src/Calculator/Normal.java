package Calculator;

public class Normal{
	static private float first;
	static private float second;
	static private float return1;
	static private float return2;
	static private float return3;
	static private float return4;
	
	static void setAdd(float a, float b) {
		first=a;
		second=b;
	}

	static void Add() { // this is a method
		float result;
		result=first + second;
		return1=result;
	}
	static float getAdd() {
		return return1;
	}
	  
	static void setSub(float c, float d) {
		first=c;
		second=d;
	}

	static void Sub() { // this is a method
		float result;
		result=first-second;
		return2=result;
	}
	static float getSub() {
		return return2;
	}
	static void setMul(float e, float f) {
		first=e;
		second=f;
	}

	static void Mul() { // this is a method
		float result;
		result=first*second;
		return3=result;
	}
	static float getMul() {
		return return3;
	}
	
	
	static void setDiv(float t, float p) {
		first=t;
		second=p;
	}

	static void Div() { // this is a method
		float result;
		result=first/second;
		return4=result;
	}
	static float getDiv() {
		return return4;
	}

}
