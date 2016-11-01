package mvc.calculator;

public class Main
{
	public static void main(String[] args)
	{
		IModel calculatorModel = new CalculatorModel();
		IController calculatorController = new CalculatorController(calculatorModel);
	}
}
