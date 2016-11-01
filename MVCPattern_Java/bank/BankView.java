package mvc.bank;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BankView implements IObserver, ActionListener
{
	private Account account;
	private IBankController bankController;
	private IBankModel bankModel;
	
	private JFrame frame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	
	private JTextField withdrawTf;
	private JButton withdrawBtn;
	private JTextField depositTf;
	private JButton depositBtn;
	private JTextArea transactionArea;
	private JButton transactionBtn;
	
	public BankView(IBankController bankController, IBankModel bankModel)
	{
		this.bankController = bankController;
		this.bankModel = bankModel;
		bankModel.registerObserver(this);
		createView();
	}

	public void createView()
	{
		frame = new JFrame("Bank");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		topPanel = new JPanel(new GridLayout(2, 2));
		topPanel.setSize(500, 200);
		withdrawTf = new JTextField();
		withdrawTf.setSize(250, 100);
		withdrawBtn = new JButton("Withdraw");
		withdrawBtn.addActionListener(this);
		depositTf = new JTextField();
		depositTf.setSize(250, 100);
		depositBtn = new JButton("Deposit");
		depositBtn.addActionListener(this);
		topPanel.add(withdrawTf);
		topPanel.add(depositTf);
		topPanel.add(withdrawBtn);
		topPanel.add(depositBtn);
		
		bottomPanel = new JPanel(new GridLayout(2, 1));
		transactionArea = new JTextArea();
		transactionBtn = new JButton("Transaction");
		transactionBtn.addActionListener(this);
		bottomPanel.add(transactionArea);
		bottomPanel.add(transactionBtn);
		
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(topPanel);
		con.add(bottomPanel);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public void update() 
	{
		account = bankModel.getAccount();
	}
		
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == withdrawBtn)
		{
			int money = Integer.parseInt(withdrawTf.getText());
			bankController.withdraw(money);
			withdrawTf.setText("");
		}
		else if(e.getSource() == depositBtn)
		{
			int money = Integer.parseInt(depositTf.getText());
			bankController.deposit(money);
			depositTf.setText("");
		}
		else
		{
			ArrayList<Transaction> ta = bankController.getTransaction();
			
			transactionArea.setText("yyyy-mm-dd\t금액\t잔액\n");
			int size = ta.size();
			for(int i = 0; i < size; ++i)
			{
				transactionArea.append(String.valueOf(ta.get(i).getDate().getYear()+1900) + "-");
				transactionArea.append(String.valueOf(ta.get(i).getDate().getMonth()+1) + "-");
				transactionArea.append(String.valueOf(ta.get(i).getDate().getDate()) + "\t");
				transactionArea.append(String.valueOf(ta.get(i).getTransactionMoney()) + "\t");
				transactionArea.append(String.valueOf(ta.get(i).getBalance()) + "\n");
			}
		}
	}
}
