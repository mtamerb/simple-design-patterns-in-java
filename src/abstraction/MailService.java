package abstraction;

public class MailService {

    public void sendEmail() {
        connectToServer();
        authenticate();
        disconnectFromServer();
    }
    /*
        Our purpose is to reduce complexity in our classes. Main not effected.
        private void connectToServer(int timeout) {
        System.out.println("Connect to server...");
        }
    */
    private void connectToServer() {
        System.out.println("Connect to server...");
    }

    private void disconnectFromServer() {
        System.out.println("Disconnect from server...");
    }

    private void authenticate() {
        System.out.println("Authenticate...");
    }
}
