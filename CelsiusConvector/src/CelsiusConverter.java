import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField Celsius;
    private JLabel CelsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverter (String title){
        super (title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the Celsius
                // convet to a double
                //update the fahrenheitLabel
                int tempFahr= (int)((Double.parseDouble(Celsius.getText())) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + "Fahrenheit ");
            }
        });
    }

     public static void main(String[] args) {
        JFrame frame = new CelsiusConverter("My Celsius Convertor");
        frame.setVisible(true);
    }
}
