public class Odkurzacz extends Uzodzenie {
    protected boolean stan = false;
    public void On()
    {
        if (!stan)
        {
            stan=true;
            Show("Odkurzacz włączono");
        }

    }
    public void Off()
    {
        if (stan)
        {
            stan=false;
            Show("Odkurzacz wyłączono");
        }
    }
}
