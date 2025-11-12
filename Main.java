import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Odkurzacz odkurzacz = new Odkurzacz();
        Pralka pralka = new Pralka();
        odkurzacz.On();
        odkurzacz.On();
        odkurzacz.On();
        Uzodzenie.Show("Odkurzacz wyładował się");
        odkurzacz.Off();
        Scanner scanner = new Scanner(System.in);
        pralka.UstawProgramPrania(scanner.nextInt());
    }
}