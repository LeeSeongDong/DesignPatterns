package mvc.calculator;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;

public class CalculatorView implements IObserver, ActionListener
{
	private int value;
	private IController calculatorController;
	private IModel calculatorModel;

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JButton button1;
	private JButton button2;
	private JLabel text3;

	public CalculatorView(IController calculatorController, IModel calculatorModel)
	{
		this.calculatorController = calculatorController;
		this.calculatorModel = calculatorModel;
		calculatorModel.registerObserver(this);
		createView();
	}

	public void createView()
	{
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text1 = new JTextField();
		text2 = new JTextField();
		button1 = new JButton("+");
		button1.addActionListener(this);
		button2 = new JButton("-");
		button2.addActionListener(this);
		text3 = new JLabel("0");

		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(1, 5));
		contentPane.add(text1);
		contentPane.add(text2);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(text3);

		frame.setSize(500, 100);
		frame.setVisible(true);
	}

	public void update(int value)
	{
		this.value = value;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());

			calculatorController.plus(num1, num2);
			text3.setText(String.valueOf(value));
		}
		else
		{
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());

			calculatorController.minus(num1, num2);
			text3.setText(String.valueOf(value));
		}
	}
}
