/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerListener extends Thread {

    private final int portNumber;
    private int clientCount;
    private final FrameBehavior myFrm;
    private ServerSocket serverSocket;

    public ServerListener(String port, FrameBehavior mFrm) {
        portNumber = Integer.parseInt(port);
        serverSocket = null;
        clientCount = 1;
        Client clientobj = new Client(null, mFrm);
        Info.clients = new ArrayList<>();
        //Info.clients.add(clientobj);
        myFrm = mFrm;
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(portNumber);
        } catch (IOException ioEx) {
            System.exit(1);
        }

        do {
            try {
                Socket client = serverSocket.accept();
                Client newGamer = new Client(client, myFrm);
                Info.clients.add(newGamer);
                clientCount++;
            } catch (IOException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (clientCount <= 10);

    }
}
