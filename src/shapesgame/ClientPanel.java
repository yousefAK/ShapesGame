/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Polygon;
//import java.awt.Shape;
import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
import java.awt.event.*;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Rectangle2D;
import java.awt.geom.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.DefaultListModel;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.WindowConstants;
import javax.swing.*;

public class ClientPanel extends javax.swing.JFrame implements FrameBehavior {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelback = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresults = new javax.swing.JTextArea();
        lbl1 = new javax.swing.JLabel();
        txtnickname = new javax.swing.JTextField();
        btnjoin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblconnected = new javax.swing.JLabel();
        lblnickname = new javax.swing.JLabel();
        lblwidth = new javax.swing.JLabel();
        lblheight = new javax.swing.JLabel();
        lblduration = new javax.swing.JLabel();
        lblscore = new javax.swing.JLabel();
        lblnicknameError = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listplayers = new javax.swing.JList<>();
        lblplayers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelback.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelback.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelback.setForeground(new java.awt.Color(0, 102, 102));

        txtresults.setEditable(false);
        txtresults.setColumns(20);
        txtresults.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtresults.setForeground(new java.awt.Color(0, 102, 102));
        txtresults.setRows(5);
        txtresults.setCaretColor(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(txtresults);

        lbl1.setForeground(new java.awt.Color(0, 102, 102));
        lbl1.setText("nickname:");

        txtnickname.setForeground(new java.awt.Color(0, 102, 102));
        txtnickname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnickname.setText("yousef");
        txtnickname.setName(""); // NOI18N

        btnjoin.setForeground(new java.awt.Color(0, 102, 102));
        btnjoin.setText("join");
        btnjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjoinActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        lblconnected.setForeground(new java.awt.Color(0, 102, 102));
        lblconnected.setText("connection");

        lblnickname.setForeground(new java.awt.Color(0, 102, 102));
        lblnickname.setText("nickname");

        lblwidth.setForeground(new java.awt.Color(0, 102, 102));
        lblwidth.setText("width");

        lblheight.setForeground(new java.awt.Color(0, 102, 102));
        lblheight.setText("height");

        lblduration.setForeground(new java.awt.Color(0, 102, 102));
        lblduration.setText("duration");

        lblscore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblscore.setForeground(new java.awt.Color(255, 102, 0));
        lblscore.setText("Score");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblconnected)
                    .addComponent(lblnickname)
                    .addComponent(lblwidth)
                    .addComponent(lblheight)
                    .addComponent(lblduration)
                    .addComponent(lblscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblconnected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnickname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblwidth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblheight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblduration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblscore)
                .addContainerGap())
        );

        lblnicknameError.setForeground(new java.awt.Color(255, 51, 0));
        lblnicknameError.setText("error");

        listplayers.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(listplayers);

        lblplayers.setForeground(new java.awt.Color(0, 102, 102));
        lblplayers.setText("Players:");

        javax.swing.GroupLayout panelbackLayout = new javax.swing.GroupLayout(panelback);
        panelback.setLayout(panelbackLayout);
        panelbackLayout.setHorizontalGroup(
            panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelbackLayout.createSequentialGroup()
                            .addComponent(lbl1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnicknameError)
                                .addGroup(panelbackLayout.createSequentialGroup()
                                    .addComponent(txtnickname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnjoin))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblplayers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelbackLayout.setVerticalGroup(
            panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbackLayout.createSequentialGroup()
                        .addGroup(panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnjoin)
                            .addComponent(lbl1)
                            .addComponent(txtnickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(lblnicknameError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblplayers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static InetAddress host;
    public Client server = null;
    public String nickname;

    private boolean gameConnected;
    private boolean gameNickname;
    private boolean startgame;
    private int width;
    private int height;
    private int duration;
    private static JFrame gameFrame;
    private JFrame boardFrame;
    private ShapePanel gamepanel;

    public ClientPanel() {
        initComponents();

        lblconnected.setText("not connected");
        lblnickname.setText("nickname not joined");
        lblnicknameError.setText("");
        gameConnected = false;
        gameNickname = false;
        startgame = false;
        width = 0;
        height = 0;
        duration = 0;

        lblscore.setText("");

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (server != null) {
                    server.myOutputMessages.add("game.disconnect");
                }
            }
        });

    }


    private void btnjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjoinActionPerformed
        if (!txtnickname.getText().equals("")) {
            try {
                nickname = txtnickname.getText();
                host = InetAddress.getByName("127.0.0.1");
                Socket client = new Socket(host, 2019);
                server = new Client(client, this);
                server.myOutputMessages.add("game.connect");
                server.myOutputMessages.add("game.nickname." + nickname);
                btnjoin.setEnabled(false);

            } catch (UnknownHostException ex) {
                Logger.getLogger(ClientPanel.class
                        .getName()).log(Level.SEVERE, null, ex);

            } catch (IOException ex) {
                Logger.getLogger(ClientPanel.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //showMessage("warning", "Nickname is empty!\nPlease enter your nick name.");
            lblnicknameError.setText("* nickname required");
        }
    }//GEN-LAST:event_btnjoinActionPerformed

    private void createNickname(String nickname) {
        server.myOutputMessages.add("game.nickname." + nickname);
    }

    @Override
    public void makeAction(String msg, Client sender) {
        String[] protocolurl = msg.split("\\.");

        if (!protocolurl[0].equals("game")) {
            server.myOutputMessages.add("game.error.wrong protocol message");
        } else {
            if (!gameConnected) {
                //lblconnected.setText("not connected");
                switch (protocolurl[1]) {
                    case "errorConnect":
                        printResult("ERROR: " + protocolurl[2]);
                        // reconnect
                        break;

                    case "welcome":
                        // connection done successfuly
                        gameConnected = true;
                        lblconnected.setText("connected");
                        break;
                }
            } else {
                if (!gameNickname) {
                    //lblnickname.setText("nickname not joined");
                    if (protocolurl.length > 2) {
                        if (protocolurl[1].equals("nickname")) {
                            switch (protocolurl[2]) {
                                case "existed":
                                    lblnicknameError.setText("nickname is existed. please change it!");
                                    break;

                                case "joined":
                                    gameNickname = true;
                                    lblnickname.setText(protocolurl[2]);
                                    nickname = protocolurl[2];
                                    break;
                            }
                            if (protocolurl[2].equals("joined")) {

                            } else {
                                server.myOutputMessages.add("game.error.nickname not confirmed");
                            }
                        } else {
                            server.myOutputMessages.add("game.error.nickname not confirmed");
                        }
                    } else {
                        server.myOutputMessages.add("game.error.nickname not confirmed");
                    }
                } else {
                    // ======= Here the player client is connected and nickname joined ==========
                    if (protocolurl[1].equals("players")) {
                        if (protocolurl.length > 2) {
                            DefaultListModel<String> l1 = new DefaultListModel<>();
                            for (int i = 2; i < protocolurl.length; i++) {
                                l1.addElement(protocolurl[i]);
                            }
                            listplayers.setModel(l1);
                            lblplayers.setText("Players: " + (protocolurl.length - 2));
                        }
                    }

                    if (protocolurl[1].equals("start")) {
                        if (protocolurl.length != 8) {
                            server.myOutputMessages.add("game.errorStart.wrong start game message");
                        } else {
                            boolean wrongValues = false;
                            try {
                                width = Integer.parseInt(protocolurl[3]);
                            } catch (NumberFormatException ex) {
                                server.myOutputMessages.add("game.errorStart.wrong width");
                                wrongValues = true;
                            }

                            try {
                                height = Integer.parseInt(protocolurl[5]);
                            } catch (NumberFormatException ex) {
                                server.myOutputMessages.add("game.errorStart.wrong height");
                                wrongValues = true;
                            }

                            try {
                                duration = Integer.parseInt(protocolurl[7]);
                            } catch (NumberFormatException ex) {
                                server.myOutputMessages.add("game.errorStart.wrong duration");
                                wrongValues = true;
                            }

                            if (!wrongValues) {
                                lblwidth.setText("Width: " + width + " pixels");
                                lblheight.setText("Height: " + height + " pixels");
                                lblduration.setText("Duration: " + duration + " minutes");

                                gamepanel = new ShapePanel(width, height);
                                gamepanel.server = server;
//                                ShapeGame rect = new ShapeGame(1, new Rectangle2D.Double(50, 100, 200, 100));
//                                ShapeGame cirlce = new ShapeGame(2, new Ellipse2D.Double(260, 100, 100, 100));
//                                ShapeGame triangle = new ShapeGame(3, null);
//                                triangle.setTriangle(Color.red, 30, 30);
//                                gamepanel.addShape(rect);
//                                gamepanel.addShape(cirlce);
//                                gamepanel.addShape(triangle);
                                createFormGame(gamepanel);
                            }
                        }
                    } // end of start

                    if (protocolurl[1].equals("stop")) {
                        boardFrame.dispatchEvent(new WindowEvent(boardFrame, WindowEvent.WINDOW_CLOSING));
                        //lblnicknameError.setText("exit");
                    } // end of stop

                    if (protocolurl[1].equals("Scoreboard")) {
                        scoreBoard = new int[9];
                        try {
                            scoreBoard[0] = Integer.parseInt(protocolurl[2]);
                            scoreBoard[1] = Integer.parseInt(protocolurl[3]);
                            scoreBoard[2] = Integer.parseInt(protocolurl[4]);
                            scoreBoard[3] = Integer.parseInt(protocolurl[5]);
                            scoreBoard[4] = Integer.parseInt(protocolurl[6]);
                            scoreBoard[5] = Integer.parseInt(protocolurl[7]);
                            scoreBoard[6] = Integer.parseInt(protocolurl[8]);
                            scoreBoard[7] = Integer.parseInt(protocolurl[9]);
                            scoreBoard[8] = Integer.parseInt(protocolurl[10]);
                            l1.setText("T[RED]: " + scoreBoard[0]);
                            l2.setText("T[BLUE]: " + scoreBoard[1]);
                            l3.setText("T[YELLOW]: " + scoreBoard[2]);
                            l4.setText("C[RED]: " + scoreBoard[3]);
                            l5.setText("C[BLUE]: " + scoreBoard[4]);
                            l6.setText("C[YELLOW]: " + scoreBoard[5]);
                            l7.setText("R[RED]: " + scoreBoard[6]);
                            l8.setText("R[BLUE]: " + scoreBoard[7]);
                            l9.setText("R[YELLOW]: " + scoreBoard[8]);
                        } catch (NumberFormatException e) {
                        }
                    } // end of Scoreboard

                    if (protocolurl[1].equals("clientshape")) {
                        if (protocolurl.length != 7) {
                            server.myOutputMessages.add("game.errorShape.wrong shape game message");
                        } else {
                            String s_color = protocolurl[3];
                            Color rColor = Color.RED;
                            String s_shape = protocolurl[4];
                            ShapeGame rShape = null;
                            int xloc = 0, yloc = 0, idshape = 0;
                            boolean wrongLoc = false;
                            boolean wrongColor = false;
                            boolean wrongShape = false;
                            try {
                                idshape = Integer.parseInt(protocolurl[2]);
                                xloc = Integer.parseInt(protocolurl[5]);
                                yloc = Integer.parseInt(protocolurl[6]);
                            } catch (NumberFormatException ex) {
                                server.myOutputMessages.add("game.errorShape.wrong locations values");
                                wrongLoc = true;
                            }

                            if (!wrongLoc) {
                                int alpha = 127; // 50% transparent
                                switch (s_color) {
                                    case "red":
                                        rColor = Color.RED;

                                        rColor = new Color(255, 0, 0, alpha);
                                        break;

                                    case "yellow":
                                        rColor = Color.YELLOW;
                                        rColor = new Color(255, 255, 0, alpha);
                                        break;

                                    case "blue":
                                        rColor = Color.BLUE;
                                        rColor = new Color(0, 0, 255, alpha);
                                        break;

                                    default:
                                        server.myOutputMessages.add("game.errorShape.wrong Color values");
                                        wrongColor = true;
                                        break;
                                }

                                switch (s_shape) {
                                    case "rectangle":
                                        rShape = new ShapeGame(idshape, new Rectangle2D.Double(xloc, yloc, 20, 20));
                                        break;

                                    case "circle":
                                        rShape = new ShapeGame(idshape, new Ellipse2D.Double(xloc, yloc, 20, 20));
                                        break;

                                    case "triangle":
                                        //rShape = new ShapeGame(idshape, null);
                                        //rShape.setTriangle(Color.red, xloc, yloc);
                                        rShape = new ShapeGame(idshape, new Ellipse2D.Double(xloc, yloc, 40, 20));
                                        break;

                                    default:
                                        server.myOutputMessages.add("game.errorShape.wrong Shape values");
                                        wrongShape = true;
                                        break;
                                }

                                if (!wrongColor || !wrongShape) {
                                    rShape.setColor(rColor);
                                    rShape.id = idshape;
                                    gamepanel.addShape(rShape);
                                    gamepanel.repaint();
                                }
                            } // end of wrong location
                        }
                    } // end of dealing shape

                    if (protocolurl[1].equals("clientclickshape")) {
                        if (protocolurl.length != 3) {
                            server.myOutputMessages.add("game.errorRemoveShape.wrong shape game message");
                        } else {
                            try {
                                int shId = Integer.parseInt(protocolurl[2]);
                                gamepanel.removeShape(shId);
                                gamepanel.repaint();
                            } catch (NumberFormatException e) {
                                server.myOutputMessages.add("game.errorRemoveShape.wrong Integer");
                            }
                        }
                    } // end of clickshape

                    if (protocolurl[1].equals("score")) {
                        if (protocolurl.length != 3) {
                            server.myOutputMessages.add("game.errorScore.wrong score message");
                        } else {
                            try {
                                int score = Integer.parseInt(protocolurl[2]);
                                txtscore.setText(score + " point");
                                lblscore.setText("Score: [" + score + "] points");
                            } catch (NumberFormatException e) {
                                server.myOutputMessages.add("game.errorRemoveShape.wrong Integer");
                            }
                        }
                    } // end of stop

                } // end of else = game nickname joinded
            }
        }

        printResult("D: " + msg);
        repaint();
    }

    public void printResult(String msg) {
        txtresults.setText(txtresults.getText() + "\n" + msg);
    }

    public void showMessage(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(ClientPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame myframe = new ClientPanel();

                myframe.setTitle("Colored-Shapes Game");
                myframe.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/shapesOrange.png")));
                myframe.setLocation(650, 100);
                myframe.setResizable(false);
                myframe.setVisible(true);
                gameFrame = myframe;
            }
        });

    }

    int[] scoreBoard;
    Label l1 = new Label("T[RED]: ");
    Label l2 = new Label("T[BLUE]: ");
    Label l3 = new Label("T[YELLOW]: ");
    Label l4 = new Label("C[RED]: ");
    Label l5 = new Label("C[BLUE]: ");
    Label l6 = new Label("C[YELLOW]: ");
    Label l7 = new Label("R[RED]: ");
    Label l8 = new Label("R[BLUE]: ");
    Label l9 = new Label("R[YELLOW]: ");
    JTextField txtscore;

    private void createFormGame(ShapePanel panel) {
        gameFrame.setVisible(false);

        boardFrame = new JFrame();
        boardFrame.setTitle("Shape Games");
        boardFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/shapesOrange.png")));
        boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boardFrame.setResizable(false);
        boardFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        boardFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gameFrame.setVisible(true);
            }
        });

        JPanel totalGUI = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        totalGUI.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        txtscore = new JTextField();
        txtscore.setEditable(false);
        txtscore.setHorizontalAlignment(JTextField.CENTER);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        totalGUI.add(txtscore, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        totalGUI.add(panel, gbc);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints p_gc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        p_gc.gridx = 0;
        p_gc.gridy = 1;
        p.add(l1, p_gc);
        p_gc.gridx = 1;
        p_gc.gridy = 1;
        p.add(l2, p_gc);
        p_gc.gridx = 2;
        p_gc.gridy = 1;
        p.add(l3, p_gc);
        p_gc.gridx = 0;
        p_gc.gridy = 2;
        p.add(l4, p_gc);
        p_gc.gridx = 1;
        p_gc.gridy = 2;
        p.add(l5, p_gc);
        p_gc.gridx = 2;
        p_gc.gridy = 2;
        p.add(l6, p_gc);
        p_gc.gridx = 0;
        p_gc.gridy = 3;
        p.add(l7, p_gc);
        p_gc.gridx = 1;
        p_gc.gridy = 3;
        p.add(l8, p_gc);
        p_gc.gridx = 2;
        p_gc.gridy = 3;
        p.add(l9, p_gc);
        p_gc.fill = GridBagConstraints.LINE_START;
        totalGUI.add(p, gbc);

        boardFrame.setContentPane(totalGUI);
        boardFrame.pack();
        boardFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjoin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblconnected;
    private javax.swing.JLabel lblduration;
    private javax.swing.JLabel lblheight;
    private javax.swing.JLabel lblnickname;
    private javax.swing.JLabel lblnicknameError;
    private javax.swing.JLabel lblplayers;
    private javax.swing.JLabel lblscore;
    private javax.swing.JLabel lblwidth;
    private javax.swing.JList<String> listplayers;
    private javax.swing.JPanel panelback;
    private javax.swing.JTextField txtnickname;
    private javax.swing.JTextArea txtresults;
    // End of variables declaration//GEN-END:variables
}

class ShapePanel extends JPanel implements MouseListener {

    private Dimension myDimension;
    public final ArrayList<ShapeGame> shapes;
    public Client server;

    public ShapePanel(int width, int height) {
        this.myDimension = new Dimension(width, height);
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(java.awt.SystemColor.controlLtHighlight);
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        server = null;
        shapes = new ArrayList<>();
        addMouseListener(this);

//        this.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent me) {
//                super.mouseClicked(me);
//                for (ShapeGame s : shapes) {
//                    if (s.getShape().contains(me.getPoint())) {//check if mouse is clicked within shape
//                        //we can either just print out the object class name
//                        System.out.println("Clicked a " + s.getClass().getName());
//                        //or check the shape class we are dealing with using instance of with nested if
//                        if (s.getShape() instanceof Rectangle2D) {
//                            System.out.println("Clicked a rectangle");
//                        } else if (s.getShape() instanceof Ellipse2D) {
//                            System.out.println("Clicked a circle");
//                        }
//                    }
//                }
//            }
//        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2d = (Graphics2D) grphcs;
        //Collections.reverse(shapes);
        for (ShapeGame s : shapes) {
            if (s.visible) {
                if (s.getShape() != null) {
                    g2d.setColor(s.getColor());
                    g2d.fill(s.getShape());
                } else {
                    //s.drawTriangle(grphcs);
                    grphcs.setColor(s.getColor());
                    int x = s.getTriangleX();
                    int y = s.getTriangleY();
                    int[] xList = {x - 15, x, x + 15};
                    int[] yList = {y, y - 20, y};
                    Polygon poly = new Polygon(xList, yList, 3);
                    grphcs.fillPolygon(poly);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return myDimension;
    }

    public void addShape(ShapeGame shp) {
        // adding shapes at the front of the arraylist will ensure that the deletion of object
        // will delete the last object has been added because the deletion method remove the first occurance
        // of the object
        this.shapes.add(0, shp);
    }

    public void removeShape(int id) {
        for (ShapeGame shp : this.shapes) {
            if (shp.id == id) {
                shp.visible = false;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click: " + e.getX() + " - " + e.getY());
        System.out.println("Point: " + e.getPoint().toString());
        System.out.println("Shapes: " + shapes.size());
        try {
            for (ShapeGame s : shapes) {
                if (s.shape != null && s.visible) {
                    if (s.shape.contains(e.getPoint())) {//check if mouse is clicked within shape
                        //we can either just print out the object class name
                        //System.out.println("Clicked a " + s.getClass().getName());
                        //or check the shape class we are dealing with using instance of with nested if
                        if (s.getShape() instanceof Rectangle2D) {
                            //System.out.println("Clicked a rectangle");
                            server.myOutputMessages.add("game.clickshape." + s.id);
                            s.visible = false;
                            this.repaint();
                            break;
                        } else if (s.getShape() instanceof Ellipse2D) {
                            //System.out.println("Clicked a circle");
                            server.myOutputMessages.add("game.clickshape." + s.id);
                            s.visible = false;
                            this.repaint();
                            break;
                        }
                    }
                } else {
                    // the shape is triangle
//                    System.out.println("Clicked a triangle");
                }

            }
        } catch (Exception ex) {
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

class ShapeGame {

    public int id;
    public Shape shape;
    public Triangle triangle;
    public Color color;
    public boolean visible;

    public ShapeGame(int id, Shape shape) {
        this.id = id;
        this.shape = shape;
        this.triangle = null;
        this.color = null;
        this.visible = true;
    }

    public int getId() {
        return id;
    }

    public Shape getShape() {
        return shape;
    }

    public int getTriangleX() {
        return triangle.getX();
    }

    public int getTriangleY() {
        return triangle.getY();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTriangle(Color c, int x, int y) {
        this.triangle = new Triangle(c, x, y);
    }

    public void drawTriangle(Graphics g) {
        drawTriangle(g);
    }

}

class Triangle {

    private int x, y;
    private Polygon poly;
    private Color color;

    Triangle(Color c, int xPosition, int yPosition) {
        this.color = c;
        this.x = xPosition;
        this.y = yPosition;
    }

    public void drawTriangle(Graphics2D g) {
        g.setColor(this.color);
        int[] xList = {x - 15, x, x + 15};
        int[] yList = {y, y - 20, y};
        poly = new Polygon(xList, yList, 3);
        g.fillPolygon(poly);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

}
