package mycalculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LeftPanel extends JPanel {
	
	private JCheckBox number1;
	private JCheckBox number2;
	private JCheckBox number3;
	private JCheckBox number4;
	String title = "Numbers";
	MyCalculator myCalculator;
		
	public LeftPanel() {
		super();
		
		// setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(180, 140));		
		setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(layout);
		
		addCheckBoxes();
	}


	public LeftPanel(MyCalculator myCalculator) {
		this.myCalculator = myCalculator;
	}


	private void addCheckBoxes() {
		
		add(new JLabel(""));
		
		number1 = new JCheckBox("1000");		
		number2 = new JCheckBox("354");		
		number3 = new JCheckBox("123");		
		number4 = new JCheckBox("500");
				
		
		add(number1);
		add(number2);
		add(number3);
		add(number4);
		
		
	}

	

}
