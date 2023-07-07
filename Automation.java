package week3.day1.assignment3;

public class Automation extends MultipleLanguage implements Language,TestTool {

	@Override
	public void ruby() {
			
		
	}
	public void java() {//implement method
		System.out.println("java");
		
	}
	public void Selenium() {//implement method
		System.out.println("Selenium");
		
	}
	
	public static void main(String[] args) 
 {
	Automation obj=new Automation();
	obj.Selenium();
	obj.java();
	obj.python();
	obj.ruby();
}
	
}
