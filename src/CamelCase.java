public class CamelCase {
    public static String camelCase(String input) {

        char[] arr = input.toCharArray();
        StringBuilder camelCase = new StringBuilder();

        for (char temp : arr) {
//            if (Character.isLowerCase(temp)) {
//                camelCase += temp;
//            } else {
//                camelCase += " " + temp;
//            }
            camelCase.append(Character.isLowerCase(temp) ? temp : " " + temp);
        }
        return camelCase.toString();
    }
}
