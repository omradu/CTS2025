public class TestContBancar {

    ContBancar contBancar;

    public static final double SOLD = 100;

    @Before
    public void setUp() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    //Test Right cu stub
    @Test
    public void testCalculeazaAvantajClientCuStub() throws ExceptieTipContInvalid {
        StubPersoana stubPersoana = new StubPersoana();
        stubPersoana.setReturnGetCalculeazaScorCredit(10);

        contBancar=new ContBancar(stubPersoana, SOLD);

        double avantajClientAsteptat = 30;
        double avantajClientCalculat = contBancar.calculeazaAvantajClient();

        Assert.assertEquals(avantajClientAsteptat,avantajClientAsteptat,0);
    }
}
