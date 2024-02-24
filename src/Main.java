public class Main {
    public static void main(String[] args) {
        String message = "Hello, World!";
        //String message = "1234";
        int shiftKey = 3;

        Cipher c = new Cipher();

        System.out.println("Исходное сообщение: " + message);

        String encryptedMessage = c.encrypt(message.toUpperCase(), shiftKey);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);

        String decryptedMessage = c.decrypt(encryptedMessage, shiftKey);
        System.out.println("Расшифрованное сообщение: " + decryptedMessage);
    }
}