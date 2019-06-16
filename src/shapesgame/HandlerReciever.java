/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

import java.io.IOException;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class HandlerReciever extends Thread {

    private Socket client;
    private Scanner input;
    private ArrayBlockingQueue<String> myMessages;
    private FrameBehavior myFrame;
    private Client me;

    public HandlerReciever(Socket socket, ArrayBlockingQueue<String> msg,
            FrameBehavior frm, Client c) {
        //Set up reference to associated socket...
        client = socket;
        myMessages = msg;
        myFrame = frm;
        me = c;
        try {
            input = new Scanner(client.getInputStream());
        } catch (IOException ioEx) {
            System.out.println("HandlerReciever: " + ioEx.getMessage());
        }
    }

    @Override
    public void run() {
        String received;
        do {
            received = input.nextLine();
            if (received != null && !"".equals(received)) {
                myFrame.makeAction(received, me);
            }
            received = "";
        } while (!received.equals("QUIT"));

        try {
            if (client != null) {
                System.out.println("Closing down connection...");
                client.close();
            }
        } catch (IOException ioEx) {
            System.out.println("Unable to disconnect!\n" + ioEx.getMessage());
        }
    }
}
