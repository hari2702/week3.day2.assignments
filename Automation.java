package week3.day1.assignment5;

public class Automation extends MultipleLanguage implements Language,TestTool{
	static String Hari="Java";
	public void Java() {
		
	
		System.out.println("This Java method");
			
	}
	public void Selenium() {
		Hari="Selenium";
		System.out.println("This is Selenium method");
		System.out.println("Static variables "+Hari);
		this.ruby();
	}
		public void ruby() {
			System.out.println("This is Ruby method");
			System.out.println("The value of final variable"+finalvar);
			
		
	}
	
		public static void main(String[] args) {
			Automation Auto=new Automation();
			Auto.Java();
			Auto.Selenium();
			
		}
		public void selenium() {
			// TODO Auto-generated method stub
			
		}
		public void java() {
			// TODO Auto-generated method stub
			
		}

}
