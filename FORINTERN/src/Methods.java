import java.util.Arrays;

public class Methods {

    public boolean isPalindrome(String text) {
        if(text.length() <= 1)
            return true;
        if(text.charAt(0) == text.charAt(text.length()-1)) {
            return isPalindrome(text.substring(1,text.length()-1));
        } else {
            return false;
        }
    }

    public int minSplit(int amount) {
        int[] coinsWeHave = new int[5];
        coinsWeHave[0] = 50;
        coinsWeHave[1] = 20;
        coinsWeHave[2] = 10;
        coinsWeHave[3] = 5;
        coinsWeHave[4] = 1;

        int result = 0;
        for(int i = 0; i < coinsWeHave.length; i++) {
            int fits = amount/coinsWeHave[i];
            if(fits > 0) {
                amount = amount - fits*coinsWeHave[i];
                result = result + fits;
            }
            if( amount == 0 )
                break;
        }
        return result;
    }

    public int notContains(int[] array) {
        Arrays.sort(array);

        int result = -1;
        if(array[0] > 1) {
            return 1;
        }
        for(int i = 0; i < array.length-2; i++) {
            if(array[i+1] - array[i] > 1) {
                return array[i] +1;
            }
        }
        return array[array.length-1] +1;
    }

    public int countVariants(int stearsCount) {
        if(stearsCount == 0 ) {
            return 1;
        }
        if(stearsCount < 0) {
            return 0;
        }
        int result = 0;
        result+= countVariants(stearsCount-2);
        result+= countVariants(stearsCount-1);
        return result;
    }

    public boolean isProperly(String sequence) {
        int open = 0;
        for(int i = 0; i < sequence.length(); i++) {
            if(sequence.charAt(i) == '(') {
                open++;
            }
            if(sequence.charAt(i) == ')') {
                if(open == 0) {
                    return false;
                }
                open--;
            }
        }
        return open == 0;
    }

}