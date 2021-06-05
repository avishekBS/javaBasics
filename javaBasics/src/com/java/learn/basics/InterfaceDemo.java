package com.java.learn.basics;

/*
 * Why interface?
 * Extends can only have one class but Interface can implement many interface class.
 */
/*
 * By default interface is public abstract declared method so not need to write
 */
/*
 * A class can have extends and implement both
 */
interface CommonActivity{
	String MY_POOP = "my Poop "; // can be called as interfaceName.variable since static by default;
	void doEating(); // public abstract void doEating(); by default takes public abstract
	String doPooping();
}
abstract class Activity{
	abstract void doDrinking();
}

class Dogs implements CommonActivity{

	@Override
	public void doEating() {
		System.out.println("I eat meat");
	}

	@Override
	public String doPooping() {
		// TODO Auto-generated method stub
		return MY_POOP + "Stinks";
	}

}
class Cow implements CommonActivity{
	public static final String MY_POOP = "was it ";
	@Override
	public void doEating() {
		System.out.println("I eat grass");
	}

	@Override
	public String doPooping() {
		return CommonActivity.MY_POOP + "is Holy";
	}

}
class Humans extends Activity implements CommonActivity{

	@Override
	public void doEating() {
		System.out.println("I eat both grass and meat");
	}

	@Override
	public String doPooping() {
		return "I poop grass and meat";
	}

	@Override
	void doDrinking() {
		System.out.println("I drink water with hands and glass");
	}
	String doThink() {
		return "I have brain to think and invent";
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		String temp;
		System.out.println("I am from Cow.....");
		CommonActivity commonActivity = new Cow();
		commonActivity.doEating();
		temp = commonActivity.doPooping();
		System.out.println(temp);
		
		System.out.println("\n\nI am from Dog.....");
		commonActivity = new Dogs();
		commonActivity.doEating();
		temp = commonActivity.doPooping();
		System.out.println(temp);
		
		System.out.println("\n\nI am from Human with extra activity.....");
		commonActivity = new Humans();
		commonActivity.doEating();
		temp = commonActivity.doPooping();
		System.out.println(temp);
		
		//other activity
		Activity activity = new Humans();
		activity.doDrinking();
		//activity.doThink(); Error because refernce type is Activity and doThink is not there.
		Humans human = new Humans();
		human.doThink();
	}

}

