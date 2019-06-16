/******************************************************************************
 *******                     YOUSEF ALAKOUR                             *******
 *******                       1306151365                               *******
 ******************************************************************************/
package shapesgame;

public class Gamer {

    private boolean connected;
    private boolean nicknameConfirmed;
    private String nickname;
    private Client gamerClient;
    private int score;

    public Gamer() {
        this.connected = false;
        this.nicknameConfirmed = false;
        this.score = 0;
        this.nickname = "";
    }

    public int addPointsToScore(int points) {
        this.score += points;
        return this.score;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isNicknameConfirmed() {
        return nicknameConfirmed;
    }

    public void setNicknameConfirmed(boolean nicknameConfirmed) {
        this.nicknameConfirmed = nicknameConfirmed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Client getGamerClient() {
        return gamerClient;
    }

    public void setGamerClient(Client gamerClient) {
        this.gamerClient = gamerClient;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int increaseScore(int increment) {
        this.score = this.score + increment;
        return this.score;
    }

    public int decreaseScore(int decrement) {
        this.score = this.score - decrement;
        return this.score;
    }

}
