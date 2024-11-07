public class Main {
    public static void main(String[] args) {

        String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        int count = countnumwithstr.countNumWithStr(sentence);
        System.out.println(sentence + " (count of str with int is): " + count);

        String hexString = "CAFE";
        int decimalValue = StringToInt.strToInt(hexString);
        System.out.println(hexString + " is: " + decimalValue);
    }
}