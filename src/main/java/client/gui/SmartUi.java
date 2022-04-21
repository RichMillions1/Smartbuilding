package client.gui;

import client.*;
import client.jmdns.CommunicationService;
import client.jmdns.JmDNSClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SmartUi {
    public static String JMDNS_MESSAGE = "";

    public static void startUi() {
        JFrame frame = new JFrame("Smart Building");
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeStatus(panel);
        placeLogin(panel);
        placeMenu(panel);
        placeUserInfo(panel);
        placePrice(panel);
        placeCalculation(panel);
        placeJmDNS(panel);
        frame.setVisible(true);
    }

    private static void placeStatus(JPanel panel) {
        panel.setLayout(null);
        String message = WelcomeClient.getWelcomeMessage();
        JLabel statusMessageLabel = new JLabel(message);

        statusMessageLabel.setBounds(40, 10, 400, 55);
        panel.add(statusMessageLabel);

        JButton refreshButton = new JButton("refresh");
        refreshButton.setBounds(200, 60, 80, 25);
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = WelcomeClient.getWelcomeMessage();
                statusMessageLabel.setText(message);
            }
        });
        panel.add(refreshButton);


    }

    private static void placeLogin(JPanel panel) {
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(40, 90, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(130, 90, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40, 120, 80, 25);
        panel.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(130, 120, 165, 25);
        panel.add(passwordText);


        String loginMessage = "need login";
        JLabel loginMessageLabel = new JLabel(loginMessage);
        loginMessageLabel.setBounds(130, 160, 165, 25);
        panel.add(loginMessageLabel);


        JButton loginButton = new JButton("login");
        loginButton.setBounds(40, 160, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean result = UserLoginClient.checkUser(userText.getText(), passwordText.getText());
                if (result) {
                    loginMessageLabel.setText("login success");
                } else {
                    loginMessageLabel.setText("login failed");
                }
            }
        });
        panel.add(loginButton);
    }

    private static void placeMenu(JPanel panel) {
        JLabel userLabel = new JLabel("input:");
        userLabel.setBounds(40, 210, 80, 25);
        panel.add(userLabel);

        JTextField menuText = new JTextField(20);
        menuText.setBounds(130, 210, 165, 25);
        panel.add(menuText);

        String menuMessage = "";
        JLabel menuMessageLabel = new JLabel(menuMessage);
        menuMessageLabel.setBounds(130, 230, 300, 25);
        panel.add(menuMessageLabel);

        JButton menuButton = new JButton("menu input");
        menuButton.setBounds(40, 230, 80, 25);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String menuMessage = MainClient.getMenu(menuText.getText());
                menuMessageLabel.setText(menuMessage);
            }
        });
        panel.add(menuButton);
    }


    private static void placeUserInfo(JPanel panel) {
        JLabel phoneLabel = new JLabel("UserName and Phone:");
        phoneLabel.setBounds(40, 270, 150, 25);
        panel.add(phoneLabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(170, 270, 165, 25);
        panel.add(phoneText);

        String infoMessage = "";
        JLabel infoMessageLabel = new JLabel(infoMessage);
        infoMessageLabel.setBounds(130, 300, 165, 25);
        panel.add(infoMessageLabel);


        JButton uploadButton = new JButton("upload");
        uploadButton.setBounds(40, 300, 80, 25);
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = UserInforClient.uploadPhone(phoneText.getText());
                infoMessageLabel.setText(result);
            }
        });
        panel.add(uploadButton);
    }

    private static void placePrice(JPanel panel) {
        JLabel userLabel = new JLabel("Stock Code input:");
        userLabel.setBounds(40, 330, 100, 25);
        panel.add(userLabel);

        JTextField priceText = new JTextField(20);
        priceText.setBounds(150, 330, 165, 25);
        panel.add(priceText);

        String priceMessage = "";
        JLabel priceMessageLabel = new JLabel(priceMessage);
        priceMessageLabel.setBounds(130, 360, 165, 25);
        panel.add(priceMessageLabel);

        JButton menuButton = new JButton("price");
        menuButton.setBounds(40, 360, 80, 25);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String priceMessage = PriceClient.getPrice(priceText.getText());
                priceMessageLabel.setText(priceMessage);
            }
        });
        panel.add(menuButton);
    }

    private static void placeCalculation(JPanel panel) {
        JLabel userLabel = new JLabel("calc input:");
        userLabel.setBounds(40, 390, 80, 25);
        panel.add(userLabel);

        JTextField priceText = new JTextField(20);
        priceText.setBounds(130, 390, 165, 25);
        panel.add(priceText);

        String priceMessage = "";
        JLabel priceMessageLabel = new JLabel(priceMessage);
        priceMessageLabel.setBounds(130, 420, 165, 25);
        panel.add(priceMessageLabel);

        JButton menuButton = new JButton("calc");
        menuButton.setBounds(40, 420, 80, 25);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String priceMessage = CalculationClient.getCalculation(priceText.getText());
                priceMessageLabel.setText(priceMessage);
            }
        });
        panel.add(menuButton);
    }


    private static void placeJmDNS(JPanel panel) {
        String message = "jmdns not found";
        JLabel messageLabel = new JLabel(message);
        messageLabel.setBounds(130, 480, 165, 25);
        panel.add(messageLabel);

        JButton menuButton = new JButton("JMDNS register");
        menuButton.setBounds(40, 450, 160, 25);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                JmDNSClient.startClient();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }).start();

                    messageLabel.setText("waiting jmdns discovery");
                    for (int i = 1; i < 11; i++) {
                        System.out.println(JMDNS_MESSAGE);
                        if (JMDNS_MESSAGE != null && JMDNS_MESSAGE.length() > 0) {
                            break;
                        }
                        messageLabel.setText("waiting jmdns discovery:" + i);
                        Thread.sleep(1000);
                    }
                    messageLabel.setText(JMDNS_MESSAGE);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(menuButton);
    }

}
