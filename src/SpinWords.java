public class SpinWords {
    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for (String s :
                arr) {
            reverseSentence.append((s.length() < 5) ? s + " "
                    : new StringBuilder(s).reverse().toString() + " ");
        }
        reverseSentence = new StringBuilder(reverseSentence.substring(0, reverseSentence.length() - 1));

        return reverseSentence.toString();
    }
}
