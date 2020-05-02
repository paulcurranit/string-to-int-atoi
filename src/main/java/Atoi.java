import java.math.BigInteger;

public class Atoi {

    public static final BigInteger MAXINTEGER = BigInteger.valueOf(Integer.MAX_VALUE);
    public static final BigInteger MININTEGER = BigInteger.valueOf(Integer.MIN_VALUE);

    public static int myAtoi(String str) {
        int result = 0;
        BigInteger resultBig = BigInteger.valueOf(result);

        String strWithoutSpaces = str.replaceAll("\\s", "");

        try {
            resultBig = BigInteger.valueOf(Integer.parseInt(strWithoutSpaces));
        } catch (NumberFormatException e) {
            if(Character.isDigit(strWithoutSpaces.charAt(0))
                    || strWithoutSpaces.charAt(0) == '-') {
                int strLoop = 1;
                int numberEndIndex = -1;
                while (strLoop < strWithoutSpaces.length()) {
                    char c = strWithoutSpaces.charAt(strLoop);

                    if (Character.isDigit(c)) {
                        strLoop++;
                        numberEndIndex = strLoop;
                    } else {
                        if (!Character.isDigit(strWithoutSpaces.charAt(strLoop -1))) {
                            return result;
                        } else {
                            strLoop = strWithoutSpaces.length();
                        }

                    }
                }

                String strNumber = strWithoutSpaces.substring(0, numberEndIndex);
                resultBig = BigInteger.valueOf(Long.parseLong(strNumber));
            }
        }
        if(resultBig.compareTo(MAXINTEGER)== 1) {
            return Integer.MAX_VALUE;
        } else if(resultBig.compareTo(MININTEGER) == -1){
            return Integer.MIN_VALUE;
        } else if(resultBig != null) {
            result = resultBig.intValue();
        }

        return result;
    }

    private static boolean startNumberFound(int numberStartIndex) {
        if(numberStartIndex < 0) {
            return false;
        } else {
            return true;
        }
    }
}
