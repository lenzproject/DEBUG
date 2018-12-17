import javax.swing.*;
import java.awt.*;
public class E08 extends JFrame{

	JButton button;
	public E08()
	{
		super("Button Example");
		Container screen=getContentPane();
		setLayout(null);
		button=new JButton("Search");
		button.setBounds(50,20,100,20);
		screen.add(button);
		setSize(200,90);
		setVisible(true);		
	}

	public static void main(String[]args)
	{
		E08 exe=new E08();
		exe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
