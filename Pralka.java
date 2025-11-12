public class Pralka extends Uzodzenie{
    private int numerPrania =0;
    public void UstawProgramPrania(int programPrania)
    {
        if (programPrania>1&&programPrania<12)
        {
            numerPrania=programPrania;
            Show("Program został ustawiony");
        }
        else {
            numerPrania = 0;
            Show("Podano niepoprawny numer programu");
        }
        Show(String.valueOf(numerPrania));
    }
}
