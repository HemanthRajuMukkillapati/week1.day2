package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator mycalc =new Calculator();
		
		System.out.println("the addition of three number is : "+ mycalc.additionThreeNos(10, 20, 30));
		System.out.println("the substraction of two number is : "+ mycalc.substractionTwoNumbers(40, 15));
		System.out.println("the product of two number is : "+ mycalc.multiplyTwoNos(2.25, 3.65));
		System.out.println("the division of two float number is : "+ mycalc.divisionTwoNos(16.00f, 4.0f));
		

	}

}
