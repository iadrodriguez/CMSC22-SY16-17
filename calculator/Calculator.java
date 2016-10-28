package Calculator;
/**
 * Created by USER on 10/29/2016.
 */
import java.awt.EventQueue;
import javax.swing.*;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculator {

    private JFrame frmCalculator;
    private JTextField screen;
    String nums = new String();
    String nums2 = new String();
    int operator;
    BigDecimal result;
    boolean negate = false;
    boolean flag = false, flag2 = false, mflag = false, nflag = true;
    BigDecimal hundred = new BigDecimal("100");


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frmCalculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator() {
        initialize();

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCalculator = new JFrame();
        frmCalculator.getContentPane().setBackground(new Color(255, 248, 220));
        frmCalculator.setTitle("Calculator");
        frmCalculator.setBounds(100, 100, 233, 356);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCalculator.getContentPane().setLayout(null);

        screen = new JTextField();
        screen.setFont(new Font("Calibri", Font.BOLD, 15));
        screen.setBackground(new Color(255, 245, 238));
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        screen.setBounds(10, 11, 195, 65);
        frmCalculator.getContentPane().add(screen);
        screen.setColumns(10);

        //0
        JButton zero = new JButton("0");
        zero.setBackground(new Color(255, 245, 238));
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + zero.getText();
                screen.setText(screen.getText().concat("0"));
            }
        });
        zero.setBounds(10, 253, 94, 30);
        frmCalculator.getContentPane().add(zero);

        //1
        JButton one = new JButton("1");
        one.setBackground(new Color(255, 245, 238));
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + one.getText();
                screen.setText(screen.getText().concat("1"));
            }
        });
        one.setBounds(10, 210, 45, 30);
        frmCalculator.getContentPane().add(one);

        //2
        JButton two = new JButton("2");
        two.setBackground(new Color(255, 245, 238));
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + two.getText();
                screen.setText(screen.getText().concat("2"));
            }
        });
        two.setBounds(59, 210, 45, 30);
        frmCalculator.getContentPane().add(two);

        //3
        JButton three = new JButton("3");
        three.setBackground(new Color(255, 245, 238));
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + three.getText();
                screen.setText(screen.getText().concat("3"));
            }
        });
        three.setBounds(110, 210, 45, 30);
        frmCalculator.getContentPane().add(three);

        //4
        JButton four = new JButton("4");
        four.setBackground(new Color(255, 245, 238));
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + four.getText();
                screen.setText(screen.getText().concat("4"));
            }
        });
        four.setBounds(10, 169, 45, 30);
        frmCalculator.getContentPane().add(four);

        //5
        JButton five = new JButton("5");
        five.setBackground(new Color(255, 245, 238));
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + five.getText();
                screen.setText(screen.getText().concat("5"));
            }
        });
        five.setBounds(59, 169, 45, 30);
        frmCalculator.getContentPane().add(five);

        //6
        JButton six = new JButton("6");
        six.setBackground(new Color(255, 245, 238));
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + six.getText();
                screen.setText(screen.getText().concat("6"));
            }
        });
        six.setBounds(110, 169, 45, 30);
        frmCalculator.getContentPane().add(six);

        //7
        JButton seven = new JButton("7");
        seven.setBackground(new Color(255, 245, 238));
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + seven.getText();
                screen.setText(screen.getText().concat("7"));
            }
        });
        seven.setBounds(10, 128, 45, 30);
        frmCalculator.getContentPane().add(seven);

        //8
        JButton eight = new JButton("8");
        eight.setBackground(new Color(255, 245, 238));
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + eight.getText();
                screen.setText(screen.getText().concat("8"));
            }
        });
        eight.setBounds(59, 128, 45, 30);
        frmCalculator.getContentPane().add(eight);

        //9
        JButton nine = new JButton("9");
        nine.setBackground(new Color(255, 245, 238));
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				nums = screen.getText() + nine.getText();
                screen.setText(screen.getText().concat("9"));
            }
        });
        nine.setBounds(110, 128, 45, 30);
        frmCalculator.getContentPane().add(nine);

        //+
        JButton add = new JButton("+");
        add.setFont(new Font("Century Gothic", Font.BOLD, 13));
        add.setBackground(new Color(255, 228, 225));
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				String nums = screen.getText() + "+";
                nums = screen.getText();
                screen.setText("");
                operator = 1;
                mflag = true;
                nflag = false;
            }
        });
        add.setBounds(160, 210, 45, 30);
        frmCalculator.getContentPane().add(add);

        //-
        JButton minus = new JButton("-");
        minus.setFont(new Font("Century Gothic", Font.BOLD, 13));
        minus.setBackground(new Color(255, 228, 225));
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				String nums = screen.getText() + "-";
                nums = screen.getText();
                screen.setText("");
                operator = 2;
                mflag = true;
                nflag = false;
            }
        });
        minus.setBounds(160, 169, 45, 30);
        frmCalculator.getContentPane().add(minus);

        //*
        JButton times = new JButton("x");
        times.setFont(new Font("Century Gothic", Font.BOLD, 13));
        times.setBackground(new Color(255, 228, 225));
        times.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				String nums = screen.getText() + "x";
                nums = screen.getText();
                screen.setText("");
                operator = 3;
                mflag = true;
                nflag = false;
            }
        });
        times.setBounds(160, 128, 45, 30);
        frmCalculator.getContentPane().add(times);

        //div
        JButton div = new JButton("\u00F7");
        div.setFont(new Font("Century Gothic", Font.BOLD, 13));
        div.setBackground(new Color(255, 228, 225));
        div.setForeground(new Color(0, 0, 0));
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				String nums = screen.getText() + "÷";
                screen.setText("");
                operator = 4;
                mflag = true;
                nflag = false;
            }
        });
        div.setBounds(160, 87, 45, 30);
        frmCalculator.getContentPane().add(div);

        //ac
        JButton ac = new JButton("AC");
        ac.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
        ac.setBackground(new Color(255, 192, 203));
        ac.setForeground(new Color(0, 0, 0));
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                screen.setText("");
            }
        });
        ac.setBounds(10, 87, 45, 30);
        frmCalculator.getContentPane().add(ac);

        //+-
        JButton negate = new JButton("+/-");
        negate.setBackground(new Color(255, 245, 238));
        negate.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
        negate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BigDecimal nega = BigDecimal.valueOf(-1);
                try {
                    BigDecimal given = new BigDecimal(screen.getText());
                    given = given.multiply(nega);
                    screen.setText("" + given);
                }
                catch (NumberFormatException error) {}
            }
        });
        negate.setBounds(60, 87, 45, 30);
        frmCalculator.getContentPane().add(negate);

        //%
        JButton percent = new JButton("%");
        percent.setBackground(new Color(255, 245, 238));
        percent.setFont(new Font("Century Gothic", Font.BOLD, 13));
        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nflag == true) {
                    flag = true;
                }
                if (mflag == true) {
                    flag2 = true;
                }
            }
        });
        percent.setBounds(110, 87, 45, 30);
        frmCalculator.getContentPane().add(percent);

        //decimalPoint
        JButton decimal = new JButton(".");
        decimal.setFont(new Font("Tahoma", Font.BOLD, 11));
        decimal.setBackground(new Color(255, 245, 238));
        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                screen.setText(screen.getText().concat("."));
            }
        });
        decimal.setBounds(110, 253, 45, 30);
        frmCalculator.getContentPane().add(decimal);

        JButton equals = new JButton("=");
        equals.setFont(new Font("Century Gothic", Font.BOLD, 13));
        equals.setBackground(new Color(255, 228, 225));
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nums2 = screen.getText();
                BigDecimal num1Big = new BigDecimal(nums);
                BigDecimal num2Big = new BigDecimal(nums2);
                if (flag == true) {
                    num1Big = num1Big.divide(hundred);
                }
                if (flag2 == true) {
                    num2Big = num2Big.divide(hundred);
                }
                if (operator == 1) {
                    result = num1Big.add(num2Big);
                }
                if (operator == 2) {
                    result = num1Big.subtract(num2Big);
                }
                if (operator == 3) {
                    result = num1Big.multiply(num2Big);
                }
                if (operator == 4) {
                    result = num1Big.divide(num2Big);
                }
                flag = false;
                flag2 = false;
                mflag = false;
                nflag = true;
                screen.setText("" +result);
            }
        });
        equals.setBounds(160, 253, 45, 30);
        frmCalculator.getContentPane().add(equals);
    }
}
