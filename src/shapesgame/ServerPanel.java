/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
//import javax.swing.Timer;

public class ServerPanel extends javax.swing.JFrame implements FrameBehavior {
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnstartgame = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbltred = new javax.swing.JLabel();
        lbltblue = new javax.swing.JLabel();
        lbltellw = new javax.swing.JLabel();
        lblcred = new javax.swing.JLabel();
        lblcblue = new javax.swing.JLabel();
        lblcellw = new javax.swing.JLabel();
        lblrred = new javax.swing.JLabel();
        lblrblue = new javax.swing.JLabel();
        lblrellw = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtwidth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtheight = new javax.swing.JTextField();
        lblerrorheight = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        lblerrorduration = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblerrorwidth = new javax.swing.JLabel();
        sliderspeed = new javax.swing.JSlider();
        txtTimer = new javax.swing.JTextField();
        lblplayers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listplayers = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMesajlar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnstartgame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnstartgame.setForeground(new java.awt.Color(0, 102, 102));
        btnstartgame.setText("start game");
        btnstartgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartgameActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scores Points", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        lbltred.setForeground(new java.awt.Color(102, 102, 102));
        lbltred.setText("Triangle[RED]");

        lbltblue.setForeground(new java.awt.Color(102, 102, 102));
        lbltblue.setText("Triangle[BLUE]");

        lbltellw.setForeground(new java.awt.Color(102, 102, 102));
        lbltellw.setText("Triangle[YELLOW]");

        lblcred.setForeground(new java.awt.Color(102, 102, 102));
        lblcred.setText("Circle[RED]");

        lblcblue.setForeground(new java.awt.Color(102, 102, 102));
        lblcblue.setText("Circle[BLUE]");

        lblcellw.setForeground(new java.awt.Color(102, 102, 102));
        lblcellw.setText("Circle[YELLOW]");

        lblrred.setForeground(new java.awt.Color(102, 102, 102));
        lblrred.setText("Rectangle[RED]");

        lblrblue.setForeground(new java.awt.Color(102, 102, 102));
        lblrblue.setText("Rectangle[BLUE]");

        lblrellw.setForeground(new java.awt.Color(102, 102, 102));
        lblrellw.setText("Rectangle[YELLOW]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltred)
                    .addComponent(lbltblue)
                    .addComponent(lbltellw))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcred)
                    .addComponent(lblcblue)
                    .addComponent(lblcellw))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrred)
                    .addComponent(lblrblue)
                    .addComponent(lblrellw))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblrred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblrblue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblrellw))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblcred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcblue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcellw))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltblue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltellw)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("width [pixels]:");

        txtwidth.setForeground(new java.awt.Color(0, 102, 102));
        txtwidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtwidth.setText("300");
        txtwidth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwidthKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("height [pixels]:");

        txtheight.setForeground(new java.awt.Color(0, 102, 102));
        txtheight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtheight.setText("250");
        txtheight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtheightKeyReleased(evt);
            }
        });

        lblerrorheight.setForeground(new java.awt.Color(255, 102, 0));
        lblerrorheight.setText("error");

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Duration [minutes]:");

        txtduration.setForeground(new java.awt.Color(0, 102, 102));
        txtduration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtduration.setText("1");
        txtduration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdurationKeyReleased(evt);
            }
        });

        lblerrorduration.setForeground(new java.awt.Color(255, 102, 0));
        lblerrorduration.setText("error");

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Generate Shapes Speed:");

        lblerrorwidth.setForeground(new java.awt.Color(255, 102, 0));
        lblerrorwidth.setText("error");

        sliderspeed.setBackground(new java.awt.Color(255, 255, 255));
        sliderspeed.setForeground(new java.awt.Color(0, 153, 153));
        sliderspeed.setMajorTickSpacing(1);
        sliderspeed.setMaximum(15);
        sliderspeed.setMinimum(5);
        sliderspeed.setMinorTickSpacing(1);
        sliderspeed.setPaintLabels(true);
        sliderspeed.setPaintTicks(true);
        sliderspeed.setSnapToTicks(true);
        sliderspeed.setValue(10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtwidth)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblerrorwidth))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblerrorheight))
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblerrorduration)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addComponent(txtheight)
                    .addComponent(txtduration)
                    .addComponent(sliderspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblerrorwidth))
                .addGap(1, 1, 1)
                .addComponent(txtwidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblerrorheight))
                .addGap(1, 1, 1)
                .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblerrorduration))
                .addGap(1, 1, 1)
                .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(sliderspeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTimer.setEditable(false);
        txtTimer.setBackground(new java.awt.Color(255, 255, 255));
        txtTimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTimer.setForeground(new java.awt.Color(255, 102, 0));
        txtTimer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblplayers.setForeground(new java.awt.Color(0, 102, 102));
        lblplayers.setText("Players:");

        listplayers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listplayers.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(listplayers);

        txtMesajlar.setColumns(20);
        txtMesajlar.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtMesajlar.setForeground(new java.awt.Color(0, 102, 102));
        txtMesajlar.setRows(5);
        jScrollPane1.setViewportView(txtMesajlar);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnstartgame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimer)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblplayers)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblplayers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimer)
                            .addComponent(btnstartgame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartgameActionPerformed
        if (!txtwidth.getText().equals("")) {
            width = Integer.parseInt(txtwidth.getText());
        } else {
            lblerrorwidth.setText("* required");
        }
        
        if (!txtheight.getText().equals("")) {
            height = Integer.parseInt(txtheight.getText());
        } else {
            lblerrorheight.setText("* required");
        }
        
        if (!txtduration.getText().equals("")) {
            duration = Integer.parseInt(txtduration.getText());
        } else {
            lblerrorduration.setText("* required");
        }

//        if (!txtgenrateShapes.getText().equals("")) {
//            generateShapes = Integer.parseInt(txtgenrateShapes.getText());
//        } else {
//            lblerrorGenerate.setText("* required");
//        }
        if (width != 0 && height != 0 && duration != 0) {
            printResult("Width = " + width + " px\nHeight = " + height + " px\nDuration = " + duration + " minutes");
        }
        
        scoreArray = new int[9];
        // Generate Score dynamiclly
        Random r = new Random();
        for (int i = 0; i < 9; i++) {
            scoreArray[i] = r.nextInt(10 + 1 + 10) - 10;
        }
        lbltred.setText("Triangle[RED]: " + scoreArray[0]);
        lbltblue.setText("Triangle[BLUE]: " + scoreArray[1]);
        lbltellw.setText("Triangle[YELLOW]: " + scoreArray[2]);
        lblcred.setText("Circle[RED]: " + scoreArray[3]);
        lblcblue.setText("Circle[BLUE]: " + scoreArray[4]);
        lblcellw.setText("Circle[YELLOW]: " + scoreArray[5]);
        lblrred.setText("Rectangle[RED]: " + scoreArray[6]);
        lblrblue.setText("Rectangle[BLUE]: " + scoreArray[7]);
        lblrellw.setText("Rectangle[YELLOW]: " + scoreArray[8]);
        
        gamers.forEach((c) -> {
            Client player = c.getGamerClient();
            if (!c.isConnected()) {
                player.myOutputMessages.add("game.errorConnect.You should connect first");
            } else {
                if (!c.isNicknameConfirmed()) {
                    player.myOutputMessages.add("game.errorConnect.You should Send Nickname");
                } else {
                    c.setScore(0);
                    player.myOutputMessages.add("game.start.width." + width + ".height." + height + ".duration." + duration);
                    player.myOutputMessages.add("game.Scoreboard."
                            + scoreArray[0] + "." + scoreArray[1] + "." + scoreArray[2] + "."
                            + scoreArray[3] + "." + scoreArray[4] + "." + scoreArray[5] + "."
                            + scoreArray[6] + "." + scoreArray[7] + "." + scoreArray[8]);
                }
            }
        });
        
        gameStarted = true;
        gametimer = new Timer();
        gametasks = new GameDurationTasks(duration, generateShapes);
        gametimer.schedule(gametasks, 100, 1000);
        
        shapetimer = new Timer();
        shapetasks = new ShapesGenerationTasks(duration, generateShapes);
        //int percent = generateShapes * 100;
        int percent = (int) sliderspeed.getValue() * 100;
        gametimer.schedule(shapetasks, 100, percent);
    }//GEN-LAST:event_btnstartgameActionPerformed

    private void txtdurationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdurationKeyReleased
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key))) {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                try {
                    int temp = Integer.parseInt(txtduration.getText());
                    lblerrorduration.setText("");
                } catch (NumberFormatException ex) {
                    lblerrorduration.setText("* numbers only");
                }
                if (txtduration.getText().equals("")) {
                    lblerrorduration.setText("");
                }
            } else {
                lblerrorduration.setText("* numbers only");
            }
        } else {
            lblerrorduration.setText("");
        }
    }//GEN-LAST:event_txtdurationKeyReleased

    private void txtwidthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwidthKeyReleased
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key))) {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                try {
                    int temp = Integer.parseInt(txtwidth.getText());
                    lblerrorwidth.setText("");
                } catch (NumberFormatException ex) {
                    lblerrorwidth.setText("* numbers only");
                }
                if (txtwidth.getText().equals("")) {
                    lblerrorwidth.setText("");
                }
            } else {
                lblerrorwidth.setText("* numbers only");
            }
        } else {
            lblerrorwidth.setText("");
        }
    }//GEN-LAST:event_txtwidthKeyReleased

    private void txtheightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtheightKeyReleased
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key))) {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                try {
                    int temp = Integer.parseInt(txtheight.getText());
                    lblerrorheight.setText("");
                } catch (NumberFormatException ex) {
                    lblerrorheight.setText("* numbers only");
                }
                if (txtheight.getText().equals("")) {
                    lblerrorheight.setText("");
                }
            } else {
                lblerrorheight.setText("* numbers only");
            }
        } else {
            lblerrorheight.setText("");
        }
    }//GEN-LAST:event_txtheightKeyReleased
    
    public ServerPanel() {
        initComponents();
        
        lblerrorheight.setText("");
        lblerrorwidth.setText("");
        lblerrorduration.setText("");
        //lblerrorGenerate.setText("");
        width = 0;
        height = 0;
        duration = 0;
        generateShapes = 0;
        
        gameStarted = false;
        
        l1 = new DefaultListModel<>();
        
        serverlistener = new ServerListener("2019", this);
        serverlistener.start();
        //btnServerStart.setEnabled(false);

        gamers = new ArrayList<>();
        shapesGame = new ArrayList<>();
        idShapes = 1;
        
        printResult("Server Started");
    }
    
    DefaultListModel<String> l1;
    private ServerListener serverlistener;
    private static ArrayList<Gamer> gamers;
    private Client tempclient;
    private int width;
    private int height;
    private int duration;
    private boolean gameStarted;
    private Timer gametimer;
    private GameDurationTasks gametasks;
    private Timer shapetimer;
    private ShapesGenerationTasks shapetasks;
    private int generateShapes;
    
    @Override
    public void makeAction(String msg, Client sender) {
        String[] mParsed = msg.split("\\.");
        
        boolean newGamer = true;
        tempclient = null;
        Gamer player = null;
        for (Gamer c : gamers) {
            if (c.getGamerClient().equals(sender)) {
                tempclient = c.getGamerClient();
                newGamer = false;
                player = c;
//                break;
            }
        }
        if (newGamer) {
            // ================================================================= New Gamer
            tempclient = sender;
            
            if (!mParsed[0].equals("game") || mParsed.length < 2) {
                tempclient.myOutputMessages.add("game.error.Wrong Protocol Message");
            } else {
                if (!mParsed[1].equals("connect")) {
                    tempclient.myOutputMessages.add("game.errorConnect.You should connect first");
                } else {
                    Gamer g = new Gamer();
                    g.setConnected(true);
                    g.setGamerClient(tempclient);
                    gamers.add(g);
                    tempclient.myOutputMessages.add("game.welcome");
                }
            }
        } else {
            // ================================================================= Player
            if (!mParsed[0].equals("game") || mParsed.length < 2) {
                tempclient.myOutputMessages.add("game.error.Wrong Protocol Message");
            } else {
                switch (mParsed[1]) {
                    case "connect":
                        if (!player.isConnected()) {
                            player.setConnected(true);
                            tempclient.myOutputMessages.add("game.welcome");
                        } else {
                            tempclient.myOutputMessages.add("game.error.Player is Connected");
                        }
                        break;
                    
                    case "nickname":
                        if (mParsed.length < 3) {
                            tempclient.myOutputMessages.add("game.error.Not Found Nickname");
                        } else {
                            // the nickname is not white spaces
                            if (!mParsed[2].matches(".*\\w.*")) {
                                tempclient.myOutputMessages.add("game.error.Not Found Nickname");
                            } else {
                                // the client send the nickname and the server should confirm it
                                // if the server not confirm it the client send error message
                                if (player.isNicknameConfirmed()) {
                                    tempclient.myOutputMessages.add("game.error.Nickname have been setted");
                                } else {
                                    // detect if nickname is unique
                                    boolean unique = true;
                                    //ArrayList<String> playerslist = new ArrayList <>();
                                    String playermsg = "game.players";
                                    for (Gamer c : gamers) {
                                        if (!c.getNickname().equals("")) { // condition for the new one
                                            playermsg = playermsg + "." + c.getNickname();
                                        }
                                        if (c.getNickname().equals(mParsed[2])) {
                                            unique = false;
                                        }
                                    }
                                    if (unique) {
                                        player.setNickname(mParsed[2]);
                                        player.setNicknameConfirmed(true);
                                        tempclient.myOutputMessages.add("game.nickname.joined");
                                        playermsg = playermsg + "." + mParsed[2];

                                        // if the game was starting, the player game will be started
                                        if (gameStarted) {
                                            tempclient.myOutputMessages.add("game.start.width." + width + ".height." + height + ".duration." + duration);
                                            tempclient.myOutputMessages.add("game.Scoreboard."
                                                    + scoreArray[0] + "." + scoreArray[1] + "." + scoreArray[2] + "."
                                                    + scoreArray[3] + "." + scoreArray[4] + "." + scoreArray[5] + "."
                                                    + scoreArray[6] + "." + scoreArray[7] + "." + scoreArray[8]);
                                        }
                                    } else {
                                        tempclient.myOutputMessages.add("game.nickname.existed");
                                    }
                                    l1 = new DefaultListModel<>();
                                    for (Gamer c : gamers) {
                                        c.getGamerClient().myOutputMessages.add(playermsg);
                                        l1.addElement(c.getNickname());
                                    }
                                    listplayers.setModel(l1);
                                    lblplayers.setText("Players: " + (gamers.size()));
                                }
                            }
                        }
                        break;
                    
                    case "clickshape":
                        if (mParsed.length != 3) {
                            tempclient.myOutputMessages.add("game.errorclickshape.Wrong Protocol Click Message");
                        } else {
                            try {
                                int cShapeId = Integer.parseInt(mParsed[2]);
                                for (shapeServer s : shapesGame) {
                                    if (s.id == cShapeId) {
                                        s.clicked = true;
                                        int playerscore = player.addPointsToScore(s.points);
                                        tempclient.myOutputMessages.add("game.score." + playerscore);
                                        break;
                                    }
                                }
                                for (Gamer gamer : gamers) {
                                    gamer.getGamerClient().myOutputMessages.add("game.clientclickshape." + cShapeId);
                                }
                            } catch (NumberFormatException e) {
                                tempclient.myOutputMessages.add("game.errorclickshape.Wrong ID");
                            }
                        }
                        break;
                    
                    case "disconnect":
                        gamers.remove(player);
                        lblplayers.setText("Players: " + gamers.size());
                        l1 = new DefaultListModel<>();
                        String ppmsg = "game.players";
                        for (Gamer c : gamers) {
                            ppmsg = ppmsg + "." + c.getNickname();
                            l1.addElement(c.getNickname() + " - Score: " + c.getScore());
                        }
                        listplayers.setModel(l1);
                        for (Gamer g : gamers) {
                            g.getGamerClient().myOutputMessages.add(ppmsg);
                        }
                        break;
                    
                    default:
                        //sender.myOutputMessages.add("game.error.Not defined in game protocol");
                        break;
                }
            }
        }
        printResult(msg);
        repaint();
    }
    
    public void printResult(String msg) {
        txtMesajlar.setText(txtMesajlar.getText() + "\n" + msg);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame myframe = new ServerPanel();
                
                myframe.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/icon.png")));
                myframe.setTitle("Colored-Shapes Game");
                myframe.setLocation(150, 100);
                myframe.setResizable(false);
                myframe.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnstartgame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcblue;
    private javax.swing.JLabel lblcellw;
    private javax.swing.JLabel lblcred;
    private javax.swing.JLabel lblerrorduration;
    private javax.swing.JLabel lblerrorheight;
    private javax.swing.JLabel lblerrorwidth;
    private javax.swing.JLabel lblplayers;
    private javax.swing.JLabel lblrblue;
    private javax.swing.JLabel lblrellw;
    private javax.swing.JLabel lblrred;
    private javax.swing.JLabel lbltblue;
    private javax.swing.JLabel lbltellw;
    private javax.swing.JLabel lbltred;
    private javax.swing.JList<String> listplayers;
    private javax.swing.JSlider sliderspeed;
    private javax.swing.JTextArea txtMesajlar;
    private javax.swing.JTextField txtTimer;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtwidth;
    // End of variables declaration//GEN-END:variables

    private class shapeServer {
        
        public int id;
        public String shape;
        public String Color;
        public int xloc;
        public int yloc;
        public int points;
        public boolean clicked;
        
        public shapeServer(int id, String shape, String Color, int xloc, int yloc, int points) {
            this.id = id;
            this.shape = shape;
            this.Color = Color;
            this.xloc = xloc;
            this.yloc = yloc;
            this.points = points;
            this.clicked = false;
        }
        
        public shapeServer() {
        }
        
    }
    
    private int idShapes;
    private ArrayList<shapeServer> shapesGame;
    private int[] scoreArray;
    
    private class GameDurationTasks extends TimerTask {

        //private Gamer gamers;
        private int duration;
        private Random randClr;
        private Random randshape;
        private Random randLcatin;
        private String sendClr;
        private String sendShape;
        private int generateShapes;
        private int points;
        
        public GameDurationTasks(int duration, int generateShapes) {
            //this.gamers = gamers;
            this.duration = duration * 60;
            this.randClr = new Random();
            this.randshape = new Random();
            this.randLcatin = new Random();
            this.generateShapes = generateShapes;
        }
        
        @Override
        public void run() {
            if (this.duration == 0) {
                gameStarted = false;
                this.cancel();
//                for (Gamer c : gamers) {
                gamers.forEach((c) -> {
                    c.getGamerClient().myOutputMessages.add("game.stop.endtime");
                });
                
                l1 = new DefaultListModel<>();
                gamers.forEach((c) -> {
                    l1.addElement(c.getNickname() + " - Score: " + c.getScore());
                });
                listplayers.setModel(l1);
            }
            
            txtTimer.setText(this.duration + "");
            this.duration -= 1;
            
        }
    }
    
    private class ShapesGenerationTasks extends TimerTask {

        //private Gamer gamers;
        private int duration;
        private Random randClr;
        private Random randshape;
        private Random randLcatin;
        private String sendClr;
        private String sendShape;
        private int generateShapes;
        private int points;
        
        public ShapesGenerationTasks(int duration, int generateShapes) {
            //this.gamers = gamers;
            this.duration = duration * 60;
            this.randClr = new Random();
            this.randshape = new Random();
            this.randLcatin = new Random();
            this.generateShapes = generateShapes;
        }
        
        @Override
        public void run() {
            if (gameStarted) {
                int selectedClr = randClr.nextInt(3) + 1;
                switch (selectedClr) {
                    case 1:
                        sendClr = "red";
                        break;
                    
                    case 2:
                        sendClr = "yellow";
                        break;
                    
                    case 3:
                        sendClr = "blue";
                        break;
                }
                
                int selectedShape = randshape.nextInt(3) + 1;
                switch (selectedShape) {
                    case 1:
                        sendShape = "rectangle";
                        if ("red".equals(sendClr)) {
                            points = scoreArray[6];
                        }
                        if ("blue".equals(sendClr)) {
                            points = scoreArray[7];
                        }
                        if ("yellow".equals(sendClr)) {
                            points = scoreArray[8];
                        }
                        break;
                    
                    case 2:
                        sendShape = "triangle";
                        if ("red".equals(sendClr)) {
                            points = scoreArray[0];
                        }
                        if ("blue".equals(sendClr)) {
                            points = scoreArray[1];
                        }
                        if ("yellow".equals(sendClr)) {
                            points = scoreArray[2];
                        }
                        break;
                    
                    case 3:
                        sendShape = "circle";
                        if ("red".equals(sendClr)) {
                            points = scoreArray[3];
                        }
                        if ("blue".equals(sendClr)) {
                            points = scoreArray[4];
                        }
                        if ("yellow".equals(sendClr)) {
                            points = scoreArray[5];
                        }
                        break;
                }
                
                int selected_X_lcatin = randshape.nextInt(width - 20) + 1;
                int selected_Y_lcatin = randshape.nextInt(height - 20) + 1;
                
                gamers.forEach((c) -> {
                    shapeServer temp = new shapeServer(idShapes, sendShape, sendClr, selected_X_lcatin, selected_Y_lcatin, points);
                    shapesGame.add(temp);
                    c.getGamerClient().myOutputMessages.add("game.clientshape." + idShapes + "." + sendClr + "." + sendShape + "." + selected_X_lcatin + "." + selected_Y_lcatin);
                });
                idShapes += 1;
            } // end of game started
        } // end of run
    } // end of class
}
