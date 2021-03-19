import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CryptUI extends JFrame implements ActionListener {

	JTextField text1; 
	JTextField text2; 
	JTextField text3; 
	
	JTextField textCKey;
	JTextField textBKey; 
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	JLabel labelCKey;
	JLabel labelBKey;
	JLabel radioBtnsLabel; 
	
	ButtonGroup group;
	
	JButton methodButton; 
	
	JButton encryptBtn; 
	JButton decryptBtn; 
	JButton clearBtn; 
	JButton exitBtn; 
	
	
	public CryptUI() 
	{
		
		
		methodButton = new JButton("Caesar cipher (Click to Change)");
		methodButton.setBounds(105, 10, 250, 20);
		methodButton.setFocusable(false); 
		methodButton.setBackground(new Color(0xC4FCEF));
		methodButton.addActionListener(this);
		
		text1 = new JTextField(); 
		text1.setBounds(30, 100, 400, 40);
		text1.setFont(new Font("DialogInput",Font.BOLD,20));
		text1.setBackground(new Color(0xC4FCEF));
		text1.setForeground(Color.BLACK);
		text1.setCaretColor(Color.BLACK);
		text1.setOpaque(true);
		
		label1 = new JLabel("Enter a word to encrypt");
		label1.setBounds(35, 50, 400, 40); 
		label1.setFont(new Font("Aharoni",Font.BOLD,15));
		
		
		text2 = new JTextField(); 
		text2.setBounds(30, 200, 400, 40);
		text2.setFont(new Font("DialogInput",Font.BOLD,20));
		text2.setBackground(new Color(0xC4FCEF));
		text2.setForeground(Color.BLACK);
		text2.setCaretColor(Color.BLACK);
		text2.setOpaque(true);
		
		label2 = new JLabel("Encrypted word");
		label2.setBounds(35, 150, 400, 40); 
		label2.setFont(new Font("Aharoni",Font.BOLD,15));
		
		text3 = new JTextField(); 
		text3.setBounds(30, 300, 400, 40);
		text3.setFont(new Font("DialogInput",Font.BOLD,20));
		text3.setBackground(new Color(0xC4FCEF));
		text3.setForeground(Color.BLACK);
		text3.setCaretColor(Color.BLACK);
		text3.setOpaque(true);
		
		label3 = new JLabel("Decrypted word");
		label3.setBounds(35, 250, 400, 40); 
		label3.setFont(new Font("Aharoni",Font.BOLD,15));
		
		textCKey = new JTextField(); 
		textCKey.setBounds(30, 400, 400, 40);
		textCKey.setFont(new Font("DialogInput",Font.BOLD,20));
		textCKey.setBackground(new Color(0xC4FCEF));
		textCKey.setForeground(Color.BLACK);
		textCKey.setCaretColor(Color.BLACK);
		textCKey.setOpaque(true);
		textCKey.setVisible(true);
		
		labelCKey = new JLabel("Cyber key - enter a whole number for Caesar cipher");
		labelCKey.setBounds(35, 350, 400, 40); 
		labelCKey.setFont(new Font("Aharoni",Font.BOLD,15));
		
		
		textBKey = new JTextField(); 
		textBKey.setBounds(30, 400, 400, 40);
		textBKey.setFont(new Font("DialogInput",Font.BOLD,20));
		textBKey.setBackground(new Color(0xC4FCEF));
		textBKey.setForeground(Color.BLACK);
		textBKey.setCaretColor(Color.BLACK);
		textBKey.setOpaque(true);
		textBKey.setVisible(true);
		
		labelBKey = new JLabel("Cyber key - enter a word for Bellaso cipher");
		labelBKey.setBounds(35, 350, 400, 40); 
		labelBKey.setFont(new Font("Aharoni",Font.BOLD,15));
		labelBKey.setVisible(false);
		
		
		encryptBtn = new JButton("Encrypt"); 
		encryptBtn.setBounds(30, 465, 80, 20);
		encryptBtn.setFocusable(false); 
		encryptBtn.setBackground(new Color(0xC4FCEF));
		encryptBtn.addActionListener(this);
		
		decryptBtn = new JButton("Decrypt"); 
		decryptBtn.setBounds(160, 465, 80, 20);
		decryptBtn.setFocusable(false); 
		decryptBtn.setBackground(new Color(0xC4FCEF));
		decryptBtn.addActionListener(this);
		
		clearBtn = new JButton("Reset"); 
		clearBtn.setBounds(270, 465, 80, 20);
		clearBtn.setFocusable(false); 
		clearBtn.setBackground(new Color(0xC4FCEF));
		clearBtn.addActionListener(this);
		
		exitBtn = new JButton("X"); 
		exitBtn.setBounds(390, 450, 50, 50);
		exitBtn.setFocusable(false); 
		exitBtn.setBackground(new Color(0xFF1C1C));
		exitBtn.setFont(new Font("Ink Free",Font.BOLD,40));
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addActionListener(this);
		
		// frame settings 
		this.setTitle("Cybersecurity Encryption and Decryption");
		this.setSize(480,550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		//this.setIconImage(appIcon.getImage());
		this.getContentPane().setBackground(new Color(0xFF9671));
		this.setResizable(false); 
		this.setVisible(true);
		
		
		//adding the components to the frame
		this.add(text1); 
		this.add(methodButton);
		this.add(label1);
		this.add(label2);
		this.add(text2);
		this.add(label3);
		this.add(text3);
		this.add(textCKey);
		this.add(labelCKey);
		this.add(textBKey);
		this.add(labelBKey);
		this.add(encryptBtn);
		this.add(decryptBtn);
		this.add(clearBtn);
		this.add(exitBtn);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource() == methodButton)
		{
			
			if(methodButton.getText() == "Caesar cipher (Click to Change)") 
			{
				
				methodButton.setText("Bellaso cipher (Click to Change)");
				
				textCKey.setVisible(false);
				labelCKey.setVisible(false);
				textBKey.setVisible(true);
				labelBKey.setVisible(true);
				
			}
			else
			{
				methodButton.setText("Caesar cipher (Click to Change)");
				
				textCKey.setVisible(true);
				labelCKey.setVisible(true);
				textBKey.setVisible(false);
				labelBKey.setVisible(false);
			}
			
			
		}
		
		
		if(e.getSource() == exitBtn)
		{
			System.exit(0);
			
		}
		
		
		if(e.getSource() == clearBtn)
		{
			
			text1.setText("");
			text2.setText("");
			text3.setText("");
			textBKey.setText("");
			textCKey.setText("");
			
		}
		
		if(e.getSource() == encryptBtn)
		{
			
			if(methodButton.getText() == "Caesar cipher (Click to Change)") 
			{
				String given = text1.getText().toUpperCase(); 
				int key = 0;
				text1.setText(given);
				
				try 
				{	
					key =  Integer.parseInt(textCKey.getText());
					
					
					
				}
				catch(NumberFormatException exception){
				
					key = 0; 
					JOptionPane.showMessageDialog(
							null,
							"Ceasar cipher key must be a whole number",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
					
					textCKey.setText("");
					text2.setText("");
					
					
				}
				
				
				
				if(CryptoManager.stringInBounds(given))
				{
					
					if(key == 0)
						text2.setText("");
					else
						text2.setText(CryptoManager.encryptCaesar(given, key));
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(
							null,
							"There is a letter that is out of bounds\n"
							+ " The bounds are between SPACE and _ ",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
			else
			{
				
				String given = text1.getText().toUpperCase(); 
				String key = textBKey.getText().toUpperCase(); 
				text1.setText(given);
				textBKey.setText(key);
				
				
				if(CryptoManager.stringInBounds(given))
				{
					
					text2.setText(CryptoManager.encryptBellaso(given, key));
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(
							null,
							"There is a letter that is out of bounds\n"
							+ " The bounds are between SPACE and _ ",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
				}
				
			
				
			}
			
		}
		
		if(e.getSource() == decryptBtn)
		{
			
			
			if(methodButton.getText() == "Caesar cipher (Click to Change)") 
			{
				
				String given = text2.getText().toUpperCase(); 
				int key = 0;
				text2.setText(given);
				
				try 
				{	
					key =  Integer.parseInt(textCKey.getText());
				}
				catch(NumberFormatException exception)
				{
				
					key = 0; 
					JOptionPane.showMessageDialog(
							null,
							"Ceasar cipher key must be a whole number",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
					
					textCKey.setText("");
					text2.setText("");
					
					
				}
				
				
				
				if(CryptoManager.stringInBounds(given))
				{
					
					if(key == 0)
						text3.setText("");
					else
						text3.setText(CryptoManager.decryptCaesar(given, key));
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(
							null,
							"There is a letter that is out of bounds\n"
							+ " The bounds are between SPACE and _ ",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
			else
			{
				
				String given = text2.getText().toUpperCase(); 
				String key = textBKey.getText().toUpperCase(); 
				text2.setText(given);
				textBKey.setText(key);
				
				
				if(CryptoManager.stringInBounds(given))
				{
					
					text3.setText(CryptoManager.decryptBellaso(given, key));
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(
							null,
							"There is a letter that is out of bounds\n"
							+ " The bounds are between SPACE and _ ",
							"Wrong Entry!",
							JOptionPane.ERROR_MESSAGE);
				}
				
			
				
			}
			
		}
		
	}

}
