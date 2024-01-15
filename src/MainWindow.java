import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;

public class MainWindow extends JFrame implements ActionListener {
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
    JButton equalsButton = new JButton("=");
    JButton dotButton = new JButton(".");
    JButton memoryAddButton = new JButton("M+");
    JButton memoryCallButton = new JButton("M");
    JButton cencelLastButton = new JButton("C");
    JButton cencelButton = new JButton("CE");
    String currentExpression = "";
    String choosenEquasion = "";
    String tempString = "";
    String memoryString = "";
    JLabel memoryScreen;
    JLabel tempScreen;

    MainWindow() {
        this.setTitle("Clanculator");
        this.setLayout(new GridLayout(3, 1));
        this.setMinimumSize(new Dimension(500, 500));
        ImageIcon icon = new ImageIcon("src\\logo.jpg");
        this.setIconImage(icon.getImage());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 4));
        memoryScreen = new JLabel("");
        tempScreen = new JLabel("");
        topPanel.add(new JLabel("Memory: "));
        topPanel.add(memoryScreen);
        topPanel.add(new JLabel("Last number:"));
        topPanel.add(tempScreen);
        JPanel screePanel = new JPanel();
        screePanel.setLayout(new GridLayout(1, 1));
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new GridLayout(5, 4));

        screenField = new JTextField();
        screenField.setFont(new Font("Times New Roman", Font.PLAIN, 70));
        screenField.setEditable(false);
        screePanel.add(screenField);

        keyboardPanel.add(memoryAddButton);
        keyboardPanel.add(memoryCallButton);
        keyboardPanel.add(cencelLastButton);
        keyboardPanel.add(cencelButton);
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
        keyboardPanel.add(equalsButton);
        keyboardPanel.add(divideButton);

        memoryAddButton.addActionListener(this);
        memoryCallButton.addActionListener(this);
        cencelButton.addActionListener(this);
        cencelLastButton.addActionListener(this);
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        dotButton.addActionListener(this);

        this.add(topPanel);
        this.add(screePanel);
        this.add(keyboardPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == memoryAddButton) {
            memoryString = Calculations.makeCalculations(Integer.toString(0), currentExpression, "+");
            memoryScreen.setText(memoryString);
        }
        if (e.getSource() == memoryCallButton) {
            currentExpression = memoryString;
        }
        if (e.getSource() == cencelLastButton) {
            currentExpression = currentExpression.substring(0, currentExpression.length() - 1);
        }
        if (e.getSource() == cencelButton) {
            currentExpression = "";
            tempString = "";
            memoryString = "";
            memoryScreen.setText("");
            tempScreen.setText("");
        }
        if (e.getSource() == zeroButton) {
            currentExpression += "0";
        }
        if (e.getSource() == oneButton) {
            currentExpression += "1";
        }
        if (e.getSource() == twoButton) {
            currentExpression += "2";
        }
        if (e.getSource() == threeButton) {
            currentExpression += "3";
        }
        if (e.getSource() == fourButton) {
            currentExpression += "4";
        }
        if (e.getSource() == fiveButton) {
            currentExpression += "5";
        }
        if (e.getSource() == sixButton) {
            currentExpression += "6";
        }
        if (e.getSource() == sevenButton) {
            currentExpression += "7";
        }
        if (e.getSource() == eightButton) {
            currentExpression += "8";
        }
        if (e.getSource() == nineButton) {
            currentExpression += "9";
        }
        if (e.getSource() == dotButton) {
            currentExpression += ".";
        }
        if (e.getSource() == equalsButton) {
            currentExpression = Calculations.makeCalculations(tempString, currentExpression, choosenEquasion);
            tempScreen.setText("");
            choosenEquasion = "";
        }
        if (e.getSource() == plusButton) {
            choosenEquasion = "+";
            tempString = currentExpression;
            tempScreen.setText(tempString);
            currentExpression = "";
        }
        if (e.getSource() == minusButton) {
            if (!currentExpression.isEmpty()) {
                choosenEquasion = "-";
                tempString = currentExpression;
                tempScreen.setText(tempString);
                currentExpression = "";
            } else {
                currentExpression += "-";
            }
        }
        if (e.getSource() == multiplyButton) {
            choosenEquasion = "*";
            tempString = currentExpression;
            tempScreen.setText(tempString);
            currentExpression = "";
        }
        if (e.getSource() == divideButton) {
            choosenEquasion = "/";
            tempString = currentExpression;
            tempScreen.setText(tempString);
            currentExpression = "";
        }
        screenField.setText(currentExpression);
    }

}
