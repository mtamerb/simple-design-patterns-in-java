package abstraction;

public class Main {

    // We ignore unnecessary features to reduce complexity in our classes.

    public static void main(String[] args) {

        var mailService = new MailService();
        mailService.sendEmail();

    /*
        We ignore these methods: connectToServer, authenticate, disconnectFromServer
        We go to the MailService class and make our unnecessary methods private.
    */

    }
}
