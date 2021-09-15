import java.math.BigInteger;

public class Atoi {

    public static final BigInteger MAXINTEGER = BigInteger.valueOf(Integer.MAX_VALUE);
    public static final BigInteger MININTEGER = BigInteger.valueOf(Integer.MIN_VALUE);

    public static int myAtoi(String str) {
        int result = 0;
        BigInteger resultBig = BigInteger.valueOf(result);

        str = str.trim();

        try {
            resultBig = new BigInteger(str);
        } catch (NumberFormatException e) {
            if(Character.isDigit(str.charAt(0))
                    || str.charAt(0) == '-') {
                int strLoop = 1;
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
                resultBig = new BigInteger(strNumber);
            }
        }

        if(resultBig.compareTo(MAXINTEGER)== 1) {
            return Integer.MAX_VALUE;
        } else if(resultBig.compareTo(MININTEGER) == -1){
            return Integer.MIN_VALUE;
        }

        return resultBig.intValue();
    }
}
