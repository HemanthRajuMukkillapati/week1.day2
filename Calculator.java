package week1.day2.assignment;

public class Calculator {


		/*
		 	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
	(c) mul(double num1, double num2), it should return product of num1 * num2
	(d) divide(float num1, float num2), it should return division of num1 / num2
		 */
	
	public int additionThreeNos(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		return sum;
	}
	
	public int substractionTwoNumbers(int num1,int num2) {
		int sub=num1-num2;
		return sub;
	}
	public double multiplyTwoNos(double num1,double num2) {
		double product=num1*num2;
		return product;
	}
	public float divisionTwoNos(float num1,float num2) {
		float divide=num1/num2;
		return divide;
	}


}
 