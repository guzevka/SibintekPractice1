public class Cipher {
    Cipher(){};

    public String encrypt(String message, int shiftKey) {
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (((Character.toUpperCase(character) - 'A' + shiftKey) % 26) + 'A');
                result.append(shiftedChar);
            } else if (Character.isDigit(character)) {
                char shiftedDigit = (char) (((character - '0' + shiftKey) % 10) + '0');
                result.append(shiftedDigit);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public String decrypt(String encryptedMessage, int shiftKey) {
        StringBuilder result = new StringBuilder();

        for (char character : encryptedMessage.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (((Character.toUpperCase(character) - 'A' + (26 - shiftKey)) % 26) + 'A');
                result.append(shiftedChar);
            } else if (Character.isDigit(character)) {
                char shiftedDigit = (char) (((character - '0' + (10 - shiftKey)) % 10) + '0');
                result.append(shiftedDigit);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
