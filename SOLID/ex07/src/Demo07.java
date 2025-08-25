import Printer.BasicPrinter;
import Printer.Printer;
import Scanner.Scanner;
import Scanner.BasicScanner;

public class Demo07 {
    public static void main(String[] args) {
        Printer m = new BasicPrinter();
        m.print("Hello");
        Scanner s = new BasicScanner();
        s.scan("/tmp/out"); 
    }
}
