public class BankAccountTest {

    BankAccount bankAccount;

    public static final double BALANCE = 100;

    @Before
    public void setUp() throws Exception {
        
    }

    @AfterClass
    public static void afterClass() throws Exception {
        
    }

    // Right test using a stub
    @Test
    public void testCalculateClientAdvantageWithStub() throws InvalidAccountTypeException {
        PersonStub stubPerson = new PersonStub();
        stubPerson.setReturnCalculateCreditScore(10);

        bankAccount = new BankAccount(stubPerson, BALANCE);

        double expectedClientAdvantage = 30;
        double calculatedClientAdvantage = bankAccount.calculateClientAdvantage();

        Assert.assertEquals(expectedClientAdvantage, calculatedClientAdvantage, 0);
    }
}
