package com.wolfe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by pi6220na on 10/25/2016.
 */
public class PetSurvey extends JFrame {
    private JCheckBox catCheckBox;
    private JCheckBox dogCheckBox;
    private JCheckBox FIshCheckBox;
    private JButton quitButton;
    private JLabel LabelOne;
    private JPanel rootPanel2;
    private JLabel surveyResultsLabel;

    private boolean fish, cat, dog;



    PetSurvey() {
        setContentPane(rootPanel2);
        pack();
        setTitle("PeT Survey");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = catCheckBox.isSelected();

                updateResults();


            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                dog = dogCheckBox.isSelected();

                updateResults();
            }
        });
        FIshCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                fish = FIshCheckBox.isSelected();

                updateResults();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                int quit = JOptionPane.showConfirmDialog(PetSurvey.this,
                        "Are you sure you want to quit",
                        "Quit", JOptionPane.OK_CANCEL_OPTION);
                if (quit == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }

            }
        });

    }

    private void updateResults() {

        String hasDog = dog ? "a dog" : "no dogs";
        String hasCat = cat ? "a cat" : "no catss";
        String hasFish = fish ? "a fish" : "no fish";

        String results = "you have " + hasCat + " and " + hasDog + " and " + hasFish;
        surveyResultsLabel.setText(results);
    }

}
