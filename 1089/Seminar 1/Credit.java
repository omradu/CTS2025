public class Credit {

  public static final int NUMAR_MAXIM_ANI_DOBANDA_STANDARD = 10;
  public static final float DOBANDA_STANDARD = 0.15f;

  private static float calculeazaDobanda(float sumaCreditata, float procentCredit, float rataDobanzii)
  {
    return (sumaCreditata - (procentCredit * sumaCreditata)) - rataDobanzii * (sumaCreditata - (procentCredit * sumaCreditata));
  }

  public float calculeazaDobandaCretit(int tipulCreditului, float sumaCreditata, int numarAniCreditati)
  {
    float dobanda = 0;
    float rataDobanzii = (numarAniCreditati > NUMAR_MAXIM_ANI_DOBANDA_STANDARD) ? DOBANDA_STANDARD : (float)numarAniCreditati/100;
    float procentCredit;
    if(tipulCreditului == 1)
    {
      dobanda = sumaCreditata;
    }
    else if (tipulCreditului == 2)
    {
      procentCredit = 0.1f;
    }
     else if (tipulCreditului == 3)
    {
      procentCredit = 0.25f;
    }
     else if (tipulCreditului == 4)
    {
      procentCredit = 0.35f;
    }
    dobanda = calculeazaDobanda(sumaCreditata, procentCredit, rataDobanzii);
    return dobanda;
  }
}
