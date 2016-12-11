/*
 * Name: Micah Courey
 *
 * Class Name: TimeDisplay
 *
 * Purpose of program: This program displays a randomly colored window containing
 * a button and when the user clicks the button, the current time is displayed.
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeDisplay extends JFrame
{
    // Create private variables and set values to the frame components
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 150;

    private JButton timeButton;
    private JLabel timeLabel;
    private Date time = new Date();
    private SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args)
    {
        JFrame frame = new TimeDisplay();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public TimeDisplay()
    {
        // Create the frame and all of it's components
        timeLabel = new JLabel();

        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class TimeListener implements ActionListener
    {
        // Action listener to display the current time when the button is clicked
        public void actionPerformed(ActionEvent event)
        {
            timeLabel.setText(date.format(time));
        }
    }

    private Color colorPicker()
    {
        // Create a random color picker to display a random color for the window
        int r = (int) Math.floor(Math.random() * 256);
        int b = (int) Math.floor(Math.random() * 256);
        int g = (int) Math.floor(Math.random() * 256);
        return (new Color(r,g,b));
    }

    private void createButton()
    {
        // Create a button and add the action listener to the button
        timeButton =  new JButton("Get current time");

        ActionListener timeButtonListener = new TimeListener();
        timeButton.addActionListener(timeButtonListener);
    }

    private void createPanel()
    {
        // Create the random color panel containing the label and button
        JPanel panel = new JPanel();
        panel.setBackground(colorPicker());
        panel.add(timeButton);
        panel.add(timeLabel);
        add(panel);
    }
}


