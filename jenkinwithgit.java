package miscelleneous;

/**
 * @author S M Jithendra swamy , jithuswamy12571257@gmail.com
 */
public class jenkinwithgit {

    public static void main(String[] args) {
        // code to print unicode characters
        int charPerLine = 0;
        for (int i = 33; i < 256; i++, charPerLine++) {
            System.out.print((char)i + ((charPerLine % 10 == 0 && charPerLine != 0) ? "\n" : "\t"));
        }
        System.out.println(); // Final newline for clean console output
    }
}