package mycalculator;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.print.Pageable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyCalculator extends JFrame {

	public void startApp() {

		initGUI();
		setVisible(true);

	}

	private void initGUI() {

		setTitle("CALCULATOR");
		setMinimumSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BorderLayout mainLayout = new BorderLayout();
		JPanel mainPanel = new JPanel(mainLayout);

		JPanel leftPanel = new LeftPanel();
		mainPanel.add(leftPanel, BorderLayout.WEST);

		JPanel rightPanel = new RightPanel();
		mainPanel.add(rightPanel, BorderLayout.EAST);

		JPanel bottomPanel = new BottomPanel();
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		getContentPane().add(mainPanel);
	}

}
