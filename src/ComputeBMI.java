import javax.swing.*;

public class ComputeBMI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		double weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight in pounds."));
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in inches."));
		
		weight *= 0.45359237;
		height *= 0.0254;
		
		JOptionPane.showMessageDialog(frame,"Your Body Mass Index is " + weight / (height * height));
	}
}