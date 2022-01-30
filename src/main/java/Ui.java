import java.io.PrintWriter;
import java.util.Scanner;

class Ui {
    private static final String prefix = "    ";
    private static final String logo = " __   ___\n"
            + "/  | /  / _____  _    _  _____  _____    __\n"
            + "|  |/  / / ____// \\  / \\/  _  \\/  _  \\  \\__\\\n"
            + "|     /  | |___ |  \\ | || | | || |_| /_ |  |\n"
            + "|     \\  | ____|| | \\| || | | ||  ___  ||  |\n"
            + "|  |\\  \\ | |___ | |\\ | || |_| || |___| ||  |\n"
            + "\\__/ \\__\\\\_____\\\\_/ \\__/\\_____/\\_______/|__|\n";

    private PrintWriter pw;

    public Ui() {
        pw = new PrintWriter(System.out);
    }

    public void greet() {
        say("Hello there, I am\n" + logo + "How may I serve you?");
    }

    public void say(String line) {
        Scanner sc = new Scanner(line);

        while (sc.hasNextLine())
        {
            pw.print(prefix);
            pw.println(sc.nextLine());
        }

        sc.close();
        pw.flush();
    }
}