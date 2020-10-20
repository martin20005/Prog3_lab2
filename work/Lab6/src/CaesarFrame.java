import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class CaesarFrame extends JFrame 
{
	Object[] abc = new Object[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	private JTextField inputText = new JTextField(20);
	private JTextField outputText = new JTextField(20);
	private JButton codeButton = new JButton("Code!");
	private JComboBox<?> offsetCombo = new JComboBox<>(abc);
	
	class OkButtonActionListener implements ActionListener
	{		
		public void actionPerformed(ActionEvent ae)
		{
			if (ae.getActionCommand().contentEquals("encode"))
			{
				outputText.setText(
						(new Caesar()).getCaesarCode(
						inputText.getText(), 
						(char) offsetCombo.getSelectedItem()
						));
			}
		}
	}
	
	class InputFieldKeyListener extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e) 
		{
			outputText.setText(
					(new Caesar()).getCaesarCode(
					inputText.getText(), 
					(char) offsetCombo.getSelectedItem()
					));
		}
	}
	
	public CaesarFrame() 
	{
		super("SwingLab");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setName("SwingLab");
		this.setSize(400, 110);
		this.setResizable(true);
		
		// layout
		BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		getContentPane().setLayout(layout);

		// panelek és feltöltésük
		JPanel upper = new JPanel();
		JPanel lower = new JPanel();
		
		upper.add(offsetCombo);
		upper.add(inputText);
		upper.add(codeButton);
		lower.add(new JLabel("Output:"));
		lower.add(outputText);

		// panelek jozzáadása a frame-hez
		this.add(upper);
		this.add(lower);
		
		outputText.setEditable(false);
		codeButton.setActionCommand("encode");
		codeButton.addActionListener(new OkButtonActionListener());
		inputText.setActionCommand("textChange");
		inputText.addKeyListener(new InputFieldKeyListener());
	}
}