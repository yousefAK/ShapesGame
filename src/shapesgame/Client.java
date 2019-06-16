/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

import java.net.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Client {

    public String TakmaAd;
    private final Socket client;
    private final FrameBehavior myFrame;
    public ArrayBlockingQueue<String> myInputMessages;
    public ArrayBlockingQueue<String> myOutputMessages;
    private HandlerReciever handleInput;
    private HandlerSender handleOutput;

    public Client(Socket socket, FrameBehavior frm) {
        client = socket;
        myFrame = frm;
        myInputMessages = new ArrayBlockingQueue(1000);
        myOutputMessages = new ArrayBlockingQueue(1000);
        if (client != null) {
            handleInput = new HandlerReciever(socket, myInputMessages, frm, this);
            handleOutput = new HandlerSender(socket, myOutputMessages);
            handleInput.start();
            handleOutput.start();
        }
    }
}
