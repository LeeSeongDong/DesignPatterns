package mvc.calculator;

public class CalculatorController implements IController
{
	private IModel calculatorModel;
	private CalculatorView calculatorView;
	
	public CalculatorController(IModel calculatorModel)
	{
		this.calculatorModel = calculatorModel;
		calculatorView = new CalculatorView(this, calculatorModel);
	}
	
	public void plus(int num1, int num2) 
	{
		calculatorModel.setValue(num1 + num2);
	}

	public void minus(int num1, int num2) 
	{
		calculatorModel.setValue(num1 - num2);
	}
}
