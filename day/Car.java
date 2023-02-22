package week1.day;

public class Car {
public void driveCar()
{
	System.out.println("Driving Car Conditions");
}
public void applyBrake()
{
	System.out.println("Apply Brake when there is a need while driving the Car");
}
public void soundHorn()
{
	System.out.println("Honk when there is a need while driving the Car");
}
public void isPuncture()
{
	System.out.println("Check the the Car wheel before driving");
}
public static void main(String[] args) {
	Car obj=new Car();
	obj.driveCar();
	obj.applyBrake();
	obj.soundHorn();
	obj.isPuncture();
}
}
