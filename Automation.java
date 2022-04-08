package week3day2assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("SELENIUM - TestTool Method()");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java - Language interface()");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby - Language interface()");
	
	}
	
	public void automationClass()
	{
		System.out.println("Automation - Execution class");
	}
	
	public static void main(String[] args) {
		
		Automation object = new Automation();
		object.automationClass();
		object.ruby();
		object.java();
		object.Selenium();
		object.phython();
	}

}
