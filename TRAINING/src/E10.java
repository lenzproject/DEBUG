import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E10 extends JFrame {

	JCheckBox first,secound,third,fourth,fifth;
	JLabel empty;
	public E10()
	{
		super("Checkbox example");
		Container screen=getContentPane();
		screen.setLayout(null);
		JLabel info=new JLabel("Quais suas linguagens favoritas?");
		info.setBounds(40,30,200,20);
		
		first=new JCheckBox("Java");
		first.setMnemonic(KeyEvent.VK_J);  //Alt+J
		first.setBounds(40,60,60,20);
		secound=new JCheckBox("C++");
		secound.setMnemonic(KeyEvent.VK_C); //Alt+C
		secound.setBounds(100,60,60,20);
		third=new JCheckBox("Delphi");
		third.setBounds(160,60,60,20);
		third.setMnemonic(KeyEvent.VK_D); //Alt+D
        fourth=new JCheckBox("Visual Basic");
        fourth.setMnemonic(KeyEvent.VK_V); //Alt+V
        fourth.setBounds(230,60,100,20);
        fifth=new JCheckBox("Python");
        fifth.setMnemonic(KeyEvent.VK_P); //Alt+P
        fifth.setBounds(335,60,90,20);
        
        JButton button=new JButton("Show");
        button.setBounds(200,100,100,20);
        empty=new JLabel("");
        empty.setBounds(100,150,600,20);
        button.addActionListener(
        		new ActionListener(){
        			public void actionPerformed(ActionEvent z){
        				String escolhas="";
        				if(first.isSelected()==true){
        					escolhas=escolhas+first.getText()+", ";
        				}
        				if(secound.isSelected()==true){
        					escolhas=escolhas+secound.getText()+", ";
        				}
        				if(third.isSelected()==true){
        					escolhas=escolhas+third.getText()+", ";
        				}
        				if(fourth.isSelected()==true){
        					escolhas=escolhas+fourth.getText()+", ";
        				}
        				if(fifth.isSelected()==true){
        					escolhas=escolhas+fifth.getText()+", ";
        				}
        				empty.setText("Voce escolheu: "+escolhas.substring(0, escolhas.length()-2));
        				
        			}
        		});
        screen.add(info);
        screen.add(first);
        screen.add(secound);
        screen.add(third);
        screen.add(fourth);
        screen.add(fifth);
        screen.add(button);
        screen.add(empty);
        setSize(500,300);
        setVisible(true);
     }
	
	public static void main(String[] args) {
		E10 exe=new E10();
		exe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
