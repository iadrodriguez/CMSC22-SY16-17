package lab11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * Created by USER on 10/25/2016.
 */

public class RockPaperScissorsLizardSpock extends Frame {
    private Label yourChoice;
    private Button rpsls;
    private CheckboxGroup lngGrp;
    private Checkbox selectedHand;
    private TextArea result;
    private Label playerScoreLabel;
    private Label computerScoreLabel;
    private String winnerThisRound = new String();
    private int playerScore;
    private int computerScore;
    private TextField dispPlayerScore;
    private TextField dispCompScore;
    private int randomInt;
    private Button ok;
    private Checkbox compSelectedHand;
    /*private*/ Dialog gameOver;
    private Label forDialog;
    private String overAllWinner = new String();

    public RockPaperScissorsLizardSpock() {
        setLayout(new FlowLayout());

        yourChoice = new Label("Your Choice:");
        add(yourChoice);
        lngGrp = new CheckboxGroup();
        Checkbox rock = new Checkbox("Rock", lngGrp, true);
        Checkbox paper = new Checkbox("Paper", lngGrp, true);
        Checkbox scissors = new Checkbox("Scissors", lngGrp, true);
        Checkbox lizard = new Checkbox("Lizard", lngGrp, true);
        Checkbox spock = new Checkbox("Spock", lngGrp, true);
        add(rock);
        add(paper);
        add(scissors);
        add(lizard);
        add(spock);

        rpsls = new Button("RockPaperScissorsLizardSpock!");
        add(rpsls);

        rpsls.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                selectedHand = lngGrp.getSelectedCheckbox();
                Random random = new Random();
                randomInt = random.nextInt(5) + 1;


                if (randomInt == 1) {
                    compSelectedHand = rock;
                    if ((selectedHand == lizard) || (selectedHand == scissors)) {
                        computerScore++;
                        winnerThisRound = "COMPUTER WINS THIS ROUND.";
                    }
                    else if ((selectedHand == spock) || (selectedHand == paper)) {
                        playerScore++;
                        winnerThisRound = "YOU WIN THIS ROUND";
                    }
                }
                else if (randomInt == 2) {
                    compSelectedHand = paper;
                    if ((selectedHand == rock) || (selectedHand == spock)) {
                        computerScore++;
                        winnerThisRound = "COMPUTER WINS THIS ROUND.";
                    }
                    else if ((selectedHand == scissors) || (selectedHand == lizard)) {
                        playerScore++;
                        winnerThisRound = "YOU WIN THIS ROUND";
                    }
                }
                else if (randomInt == 3) {
                    compSelectedHand = scissors;
                    if ((selectedHand == lizard) || (selectedHand == paper)) {
                        computerScore++;
                        winnerThisRound = "COMPUTER WINS THIS ROUND.";
                    }
                    else if ((selectedHand == spock) || (selectedHand == rock)) {
                        playerScore++;
                        winnerThisRound = "YOU WIN THIS ROUND";
                    }
                }
                else if (randomInt == 4) {
                    compSelectedHand = lizard;
                    if ((selectedHand == paper) || (selectedHand == spock)) {
                        computerScore++;
                        winnerThisRound = "COMPUTER WINS THIS ROUND.";
                    }
                    else if ((selectedHand == scissors) || (selectedHand == rock)) {
                        playerScore++;
                        winnerThisRound = "YOU WIN THIS ROUND";
                    }
                }
                else if (randomInt == 5) {
                    compSelectedHand = spock;
                    if ((selectedHand == rock) || (selectedHand == scissors)) {
                        computerScore++;
                        winnerThisRound = "COMPUTER WINS THIS ROUND.";
                    }
                    else if ((selectedHand == paper) || (selectedHand == lizard)) {
                        playerScore++;
                        winnerThisRound = "YOU WIN THIS ROUND";
                    }
                }

                dispCompScore.setText(computerScore + "");
                dispPlayerScore.setText(playerScore + "");
                result.replaceRange("Results: " + "\n" + "Player chose " + selectedHand.getLabel() + "\n" + "Computer chose " + compSelectedHand.getLabel() + "\n" + winnerThisRound, 0, result.getText().length());
                if ((playerScore >= 5) || (computerScore >= 5)) {
                    if (playerScore > computerScore) {
                        overAllWinner = "Player ";
                    } else {
                        overAllWinner = "Computer ";
                    }
                    gameOver.setVisible(true);
                }
            }
        });
        result = new TextArea("Results:");
        add(result);
        playerScoreLabel = new Label("Player's Score");
        add(playerScoreLabel);
        dispPlayerScore = new TextField();
        add(dispPlayerScore);
        computerScoreLabel = new Label("Computer's Score");
        add(computerScoreLabel);
        dispCompScore = new TextField();
        add(dispCompScore);
        System.out.println(playerScore + "");

        gameOver = new Dialog(this, "Game Over!");
        gameOver.setLayout(new FlowLayout());
        forDialog = new Label("Game Over!" + "\n" + overAllWinner + " won.");
        gameOver.add(forDialog);
        ok = new Button("OK");
        gameOver.add(ok);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RockPaperScissorsLizardSpock();
            }
        });

        setTitle("RockPaperScissorsLizardSpock");
        setSize(300, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
    });
    }



    public static void main(String[] args) throws InterruptedException {
        new RockPaperScissorsLizardSpock();
    }
}
