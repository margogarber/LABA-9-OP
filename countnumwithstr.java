public class countnumwithstr {
        public static int countNumWithStr(String sentence) {
            String[] words = sentence.split("\\s+"); // Розділяємо за пробілами
            int count = 0;

            for (String word : words) {
                boolean hasLetter = false;
                boolean hasDigit = false;

                for (char ch : word.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        hasLetter = true;
                    } else if (Character.isDigit(ch)) {
                        hasDigit = true;
                    }

                    if (hasLetter && hasDigit) {
                        count++;
                        break; // Виходимо з циклу для цього слова
                    }
                }
            }

            return count;
        }
}

