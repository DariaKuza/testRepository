package App;

import javafx.scene.layout.BorderRepeat;
import javafx.scene.layout.BorderStrokeStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private int winWidth = 750;
    private int winHeight = 600;
    private int winPositionX = 300;
    private int winPositionY = 150;

    private JButton btnStart;
    private JButton btnExit;
    private JButton btnClearLog;

    private JPanel panelSettingsGame;
    private JPanel panelControlsElement;

    private JTextArea gameLog;
    private JScrollPane scrollPanel;

    private GameMap gameMap;


    public MainWindow() {

        setupWindow();
        prepareGameSettingsPanel();
        prepareButtons();
        prepareGameSettingsControl();
        prepareGameLogElement();

        gameMap = new GameMap();

        panelSettingsGame.add(panelControlsElement, BorderLayout.NORTH);
        panelSettingsGame.add(scrollPanel, BorderLayout.SOUTH);

        add(panelSettingsGame, BorderLayout.EAST);
        add (gameMap);

        setVisible(true);

    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
        setLocation(winPositionX, winPositionY);
        setTitle("Application: Game");
        setResizable(false);
    }
    private void prepareGameSettingsPanel() {
        panelSettingsGame = new JPanel();
        panelSettingsGame.setLayout(new GridLayout(2, 1));
    }

    private void prepareButtons() {
        btnStart = new JButton("Start game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveLog("Hello game");
            }
        });

        btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnClearLog = new JButton("Clear Log");
        btnClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              gameLog.setText("");
            }
        });

    }

    private void prepareGameSettingsControl() {
        panelControlsElement = new JPanel();
        panelControlsElement.setLayout(new GridLayout(10, 1));
        panelControlsElement.add(btnStart);
        panelControlsElement.add(btnExit);
        panelControlsElement.add(btnClearLog);
    }


    private void prepareGameLogElement() {
        gameLog = new JTextArea("Hello");
        scrollPanel = new JScrollPane(gameLog);
        gameLog.setLineWrap(true); //перенос строки
        gameLog.setWrapStyleWord(true); //целиком переноситься на новую строку


    }
void saveLog(String text) {
        gameLog.append(text + "\n");
}
    }

