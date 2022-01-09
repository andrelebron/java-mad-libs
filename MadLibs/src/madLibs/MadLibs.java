package madLibs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MadLibs extends JFrame {
	private JTextField txtColor;
	private JTextField txtPastTenseVerb;
	private JTextField txtAdjective;
	private JTextField txtNoun;
	private JTextArea txtMadLib;
	public void completeStory() {
		String color = txtColor.getText();
		String pastTenseVerb = txtPastTenseVerb.getText();
		String adjective = txtAdjective.getText();
		String noun = txtNoun.getText();
		String story = "The " + color + " dragon " + pastTenseVerb + " at the " + adjective + " knight, who rode in on a sturdy, giant " + noun + ".";
		txtMadLib.setText(story);
	}
	public MadLibs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Andre's Mad Libs!");
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Andre's Mad Libs!");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(151, 11, 134, 14);
		getContentPane().add(lblTitle);
		
		txtMadLib = new JTextArea();
		txtMadLib.setWrapStyleWord(true);
		txtMadLib.setLineWrap(true);
		txtMadLib.setText("Fill out the prompts above, then click 'Done!' to complete the story!");
		txtMadLib.setBounds(22, 123, 391, 127);
		getContentPane().add(txtMadLib);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblColor.setBounds(33, 43, 40, 14);
		getContentPane().add(lblColor);
		
		JLabel lblPastTenseVerb = new JLabel("Past Tense Verb:");
		lblPastTenseVerb.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblPastTenseVerb.setBounds(31, 68, 82, 14);
		getContentPane().add(lblPastTenseVerb);
		
		JLabel lblAdjective = new JLabel("Adjective:");
		lblAdjective.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblAdjective.setBounds(224, 43, 49, 14);
		getContentPane().add(lblAdjective);
		
		JLabel lblNoun = new JLabel("Noun:");
		lblNoun.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNoun.setBounds(224, 68, 29, 14);
		getContentPane().add(lblNoun);
		
		txtColor = new JTextField();
		txtColor.setBounds(67, 40, 134, 20);
		getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		txtPastTenseVerb = new JTextField();
		txtPastTenseVerb.setBounds(119, 65, 82, 20);
		getContentPane().add(txtPastTenseVerb);
		txtPastTenseVerb.setColumns(10);
		
		txtAdjective = new JTextField();
		txtAdjective.setBounds(278, 40, 122, 20);
		getContentPane().add(txtAdjective);
		txtAdjective.setColumns(10);
		
		txtNoun = new JTextField();
		txtNoun.setBounds(256, 65, 144, 20);
		getContentPane().add(txtNoun);
		txtNoun.setColumns(10);
		
		JButton btnDone = new JButton("Done!");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				completeStory();
			}
		});
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDone.setBounds(170, 89, 89, 23);
		getContentPane().add(btnDone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MadLibs madLibs = new MadLibs();
		madLibs.setSize(new Dimension(500, 300));
		madLibs.setVisible(true);
	}
}
