/*
 * Name: Micah Courey
 *
 * Class Name: BankAccountGUI
 *
 * Purpose of program: This is a Bank Account balance program with a GUI
 * interface that allows a user to input their bank account balance and
 * then the program displays that balance to them on in the GUI panel.
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountGUI extends JFrame
{
    // Create private variables and set values to the frame components
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;

    private static final double USER_BALANCE = 0;

    private JLabel inputLabel;
    private JTextField balanceField;
    private JButton submitButton;
    private JLabel resultLabel;
    private double balance;

    public static void main(String[] args)
    {
        JFrame frame = new BankAccountGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public BankAccountGUI()
    {
        // Create the frame and all of it's components
        balance = USER_BALANCE;
        resultLabel = new JLabel("Balance: " + balance);

        createTextField();
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField()
    {
        // Create the text field for the user to input their balance
        inputLabel = new JLabel("Enter your bank account balance: ");

        final int FIELD_WIDTH = 10;
        balanceField = new JTextField(FIELD_WIDTH);
        balanceField.setText("");
    }

    class BalanceListener implements ActionListener
    {
        // Create a Action Listener to detect when the user clicks the submit button
        public void actionPerformed(ActionEvent event)
        {
            double viewBalance = Double.parseDouble(balanceField.getText());
            resultLabel.setText("Your current balance is: " + viewBalance);
        }
    }

    private void createButton()
    {
        // Create the submit button for the user to click after entering their balance
        submitButton = new JButton("Submit");

        ActionListener submitListener = new BalanceListener();
        submitButton.addActionListener(submitListener);
    }

    private void createPanel()
    {
        // Create the panel containing the labels, field and button
        JPanel panel = new JPanel();
        panel.add(inputLabel);
        panel.add(balanceField);
        panel.add(submitButton);
        panel.add(resultLabel);
        add(panel);
    }
}



