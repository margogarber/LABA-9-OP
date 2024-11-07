public class StringToInt {
    public static int strToInt(String hexString) {
        int decimalValue = 0;
        int base = 1;

        for (int i = hexString.length() - 1; i >= 0; i--) {
            char hexChar = hexString.charAt(i);

            int hexDigit;
            if (hexChar >= '0' && hexChar <= '9') {
                hexDigit = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexDigit = hexChar - 'A' + 10;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                hexDigit = hexChar - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hex character: " + hexChar);
            }

            decimalValue += hexDigit * base;
            base *= 16;
        }

        return decimalValue;
    }
}