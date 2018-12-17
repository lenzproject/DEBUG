import javax.swing.*;
import java.awt.*;
public class E09 extends JFrame{

	JButton button;
	ImageIcon icon;
	
	public E09()
	{
		super("ImageIcon Example");
		Container screen=getContentPane();
		setLayout(null);
		icon=new ImageIcon("g.png");
		button=new JButton(icon);
		button.setBounds(35,20,318,159);
		screen.add(button);
		setSize(400,250);
		setVisible(true);
		//setLocationRelative(null);		
	}
	public static void main(String[] args) {
		E09 exe=new E09();
		exe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
