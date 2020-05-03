import java.math.BigInteger;

public class Atoi {

    public static final BigInteger MAXINTEGER = BigInteger.valueOf(Integer.MAX_VALUE);
    public static final BigInteger MININTEGER = BigInteger.valueOf(Integer.MIN_VALUE);

    public static int myAtoi(String str) {
        int result = 0;
        BigInteger resultBig = BigInteger.valueOf(result);

        int strLoop = 0;
        while(str.charAt(strLoop) == ' ' && strLoop < str.length()) {
            str = str.trim();
            strLoop++;
        }

        try {
            resultBig = BigInteger.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            if(Character.isDigit(str.charAt(0))
                    || str.charAt(0) == '-') {
                strLoop = 1;
                int numberEndIndex = -1;
                while (strLoop < str.length()) {
                    char c = str.charAt(strLoop);

                    if (Character.isDigit(c)) {
                        strLoop++;
                        numberEndIndex = strLoop;
                    } else {
                            strLoop = str.length();

                    }
                }

                String strNumber = str.substring(0, numberEndIndex);
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
}
