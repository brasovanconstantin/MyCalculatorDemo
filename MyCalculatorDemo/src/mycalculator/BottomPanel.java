package mycalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BottomPanel extends JPanel {

	private JButton equal;
	private JButton reset;
	private JLabel result;
	private int addition;
	private int substraction;

	public BottomPanel() {
		super();

		// setBackground(Color.GREEN);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		layout.setHgap(30);
		setLayout(layout);

		addEqualButton();

		result = new JLabel("    0.00");
		result.setForeground(Color.RED);
		result.setPreferredSize(new Dimension(55, 25));

		reset = new JButton("RESET");
		reset.setPreferredSize(new Dimension(75, 25));
		reset.setToolTipText("press to reset");

		add(result);
		add(reset);
	}

	private void addEqualButton() {

		equal = new JButton("=");
		equal.setPreferredSize(new Dimension(75, 25));
		equal.setToolTipText("press to calculate");

		add(equal);

		equal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				addition = 0;
				
		
				

			}
		});
	}

}
