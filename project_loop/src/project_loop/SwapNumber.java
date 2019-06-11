package project_loop;

public class SwapNumber {
	// swap number using two variable without using third variable.
	public void swap(int x,int y){
		x=x+y;
		y=x-y;
		x=x-y;
	System.out.println("value of x after swap:"+x);
	System.out.println("value of y after swap:"+y);
	}
public static void main(String args[]){
	SwapNumber obj=new SwapNumber();
	obj.swap(5, 6);
}
}
