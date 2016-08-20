package mycalculator;


import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RightPanel extends JPanel {

	private JRadioButton additionRadio;
	private JRadioButton substractionRadio;
	private JRadioButton multiplicationRatio;
	private JRadioButton divisionRatio;
	String title = "Operations";

	public RightPanel() {
		super();

		// setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(180, 140));
		setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(layout);

		addRadioButtons();
	}

	private void addRadioButtons() {

		additionRadio = new JRadioButton("Addition");
		substractionRadio = new JRadioButton("Substraction");
		multiplicationRatio = new JRadioButton("Multiplication");
		divisionRatio = new JRadioButton("Division");

		ButtonGroup originGroup = new ButtonGroup();
		originGroup.add(additionRadio);
		originGroup.add(substractionRadio);
		originGroup.add(multiplicationRatio);
		originGroup.add(divisionRatio);

		add(additionRadio);
		add(substractionRadio);
		add(multiplicationRatio);
		add(divisionRatio);

	}

}
