import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebsiteThing {
    private double intValue1;
    private double intValue2;
    private Object IllegalArgumentException;


    /**
     * funqciad mecera tavidan da gadmovakete exla, imedia didi kvali ar darcha dzveli chanafiqris :]
     */
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Currency: ");
        String first = sc.nextLine();
        System.out.println("Enter Second Currency");
        String second = sc.nextLine();

        WebsiteThing thing = new WebsiteThing();
        System.out.println("The Exchange Rate Is: " + thing.getCourse(first,second));

    }
    public WebsiteThing() {
        intValue1 = -1;
        intValue2 = -2;
        IllegalArgumentException = new IllegalArgumentException();
    }
    public double getCourse(String val1, String val2) throws Throwable {

        URL url = new URL("http://www.nbg.ge/rss.php");
        Scanner sc = new Scanner(url.openStream());

        while (sc.hasNext()) {
            String curr = sc.next().toString();

            if(curr.contains(val1)) {
                String currentVal;
                while(true) {
                    currentVal = sc.next();
                    if(currentVal.contains("</td>")) break;
                }
                currentVal = sc.next();
                currentVal = currentVal.replaceAll("<[^>]*>", "");
                intValue1 = Double.valueOf(currentVal);
            }
            if(curr.contains(val2)) {
                String currentVal;
                while(true) {
                    currentVal = sc.next();
                    if(currentVal.contains("</td>")) break;
                }
                currentVal = sc.next();
                currentVal = currentVal.replaceAll("<[^>]*>", "");
                intValue2 = Double.valueOf(currentVal);
            }

            if( intValue1 >= 0 && intValue2 >= 0) break;

        }
        if( intValue1 >= 0 && intValue2 >= 0) {
            double result = intValue1 / intValue2;
            return result;
        } else throw (Throwable) IllegalArgumentException;
    }

}
