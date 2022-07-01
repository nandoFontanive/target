import java.util.Scanner;
public class ex4
{
    public static void main (String args[])
    {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        double pSP = (sp * 100) / total;
        double pRJ = (rj * 100) / total; 
        double pMG =  (mg * 100) / total;
        double pES =  (es * 100) / total;
        double pOutros =  (outros * 100) / total;
        System.out.println("*** O percentual de cada estado é: ***");
        System.out.printf("SP %.2f %n", pSP);
        System.out.printf("RJ %.2f %n", pRJ);
        System.out.printf("MG %.2f %n", pMG);
        System.out.printf("ES %.2f %n", pES);
        System.out.printf("Outros %.2f %n", pOutros);

    }
}