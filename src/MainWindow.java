import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    JTextField screenField;
    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");
    JButton sqrtButton = new JButton("sqrt");
    JButton dotButton = new JButton(".");

    MainWindow() {
        this.setTitle("Clanculator");
        this.setLayout(new GridLayout(2, 1));
        this.setMinimumSize(new Dimension(500, 500));
        JPanel screePanel = new JPanel();
        screePanel.setLayout(new GridLayout(1, 1));
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(4, 4));

        screenField = new JTextField();
        screePanel.add(screenField);

        keyboardPanel.add(sevenButton);
        keyboardPanel.add(eightButton);
        keyboardPanel.add(nineButton);
        keyboardPanel.add(plusButton);
        keyboardPanel.add(fourButton);
        keyboardPanel.add(fiveButton);
        keyboardPanel.add(sixButton);
        keyboardPanel.add(minusButton);
        keyboardPanel.add(oneButton);
        keyboardPanel.add(twoButton);
        keyboardPanel.add(threeButton);
        keyboardPanel.add(multiplyButton);
        keyboardPanel.add(zeroButton);
        keyboardPanel.add(dotButton);
        keyboardPanel.add(sqrtButton);
        keyboardPanel.add(divideButton);

        this.add(screePanel);
        this.add(keyboardPanel);
        this.setVisible(true);
    }
}
