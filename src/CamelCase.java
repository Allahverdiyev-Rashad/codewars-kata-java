public class CamelCase {
    public static String camelCase(String input) {

        char[] arr = input.toCharArray();
        String camelCase = "";

        for (char temp : arr) {
//            if (Character.isLowerCase(temp)) {
//                camelCase += temp;
//            } else {
//                camelCase += " " + temp;
//            }
            camelCase += Character.isLowerCase(temp) ? temp : " " + temp;
        }
        return camelCase;
    }
}
