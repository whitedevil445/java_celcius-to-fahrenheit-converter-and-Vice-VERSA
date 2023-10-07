import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class celciustofarhenitecovert {
    

    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JLabel lblField;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;

    public static void main(String[] args){
       
      //set up frame 
      frmMain = new JFrame("Temperature Converter By Rakshit");
      frmMain.setSize(350, 200);
      frmMain.setLayout(new FlowLayout());

      //create gui elements
      lblField = new JLabel("FILL ONLY ONE FIELD Either Celsius or Fahrenheit  ");
      lblCelsius = new JLabel("Celsius::");
      textCelsius = new JTextField(20);
      lblFahrenheit = new JLabel("Fahrenheit::");
      textFahrenheit = new JTextField(10);
      btnCalculateCtoF = new JButton("Convert C to F ");
      //add action listener
     btnCalculateCtoF.addActionListener(
     
        new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //convert c to f
                String cText = textCelsius.getText();
                double c = Double.parseDouble(cText);
                double f = (c * 9/5)+32;
                textFahrenheit.setText(String.valueOf(f));
                
            }
        }
     );


      btnCalculateFtoC = new JButton("Convert F to C ");
      //add action listener
      btnCalculateFtoC.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //convert f to c
                String fText =textFahrenheit.getText();
                double f = Double.parseDouble(fText);
                double c = (f - 32)* 5/9;
                textCelsius.setText(String.valueOf(c));
            }
        }
        
      );
       
      //add  gui elements to frame
      frmMain.add(lblField);
      frmMain.add(lblCelsius);
      frmMain.add(textCelsius);
      frmMain.add(lblFahrenheit);
      frmMain.add(textFahrenheit);
      frmMain.add(btnCalculateCtoF);
      frmMain.add(btnCalculateFtoC);
      
     //make the frame visible 

      frmMain.setVisible(true);

      
   
    }

   
}