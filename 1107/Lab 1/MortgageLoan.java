public class MortgageLoan {

  public float computeInterestValue(int years, float totalBorrowedValue, int noMonths)
  {
      float interestValue = 0;
      float standardRate = 15/100;
      float flexibleRate = (float)noMonths/100;
      float currentRate = (noMonths > 10) ? standardRate : flexibleRate;
      if (years == 1)
      {
        interestValue = totalBorrowedValue;
      }
      else if (years == 2)
      {
        interestValue = (totalBorrowedValue - (0.1f * totalBorrowedValie)) - currentRate * (totalBorrowedValue - (0.1f * totalBorrowedValue));
      }
      else if (years == 3)
      {
        interestValue = (totalBorrowedValue - (0.25f * totalBorrowedValie)) - currentRate * (totalBorrowedValue - (0.25f * totalBorrowedValue));
      }
      else if (years == 4)
      {
        interestValue = (totalBorrowedValue - (0.35f * totalBorrowedValie)) - currentRate * (totalBorrowedValue - (0.35f * totalBorrowedValue));
      }

      return interestValue;
  }
  
}
