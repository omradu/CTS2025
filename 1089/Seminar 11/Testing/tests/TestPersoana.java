public class TestPersoana {

    //test fixture
    Persoana persoana;

    public static final String NUME;
    public static final int VARSTA = IValidariPersoana.VARTSA_MIN; //limitele au fost puse intr-o interfata pentru simplificare si respectare clean code
    public static final String CNP;
    public static final String ADRESA;
    public static final double SALARIU = 1500;

    //generam astfel valori de test care sa sa incadreze in limitele de nr de caractere
    static {
        String numeInitial = "";
        String cnpInitial = "";
        String adresaInitiala = "";

        for(int i = 0; i<IValidariPersoana.DIM_NUME_MIN; i++) {
            numeInitial += "A";
        }
        NUME = numeInitial;

        for(int i=0; i<IValidariPersoana.DIM_CNP; i++)
            cnpInitial += "1";
        CNP = cnpInitial;

        for(int i=0; i<IValidariPersoana.DIM_ADRESA_MIN; i++)
            adresaInitiala += "A";
        ADRESA = adresaInitiala;

    }

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana(NUME, VARSTA, CNP, ADRESA, SALARIU);
    }

    @After
    public void tearDown() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    
    //Conformance + Right (pt valori de intrare right ar trebui sa primim valori right)
    //Primim rezultatul asteptat
    @Test
    public void testSetVarsta() throws ExceptiePersoanaVarstaInvalida {
        int varstaDiferita = VARSTA + 5;

        
        persoana.setVarsta(varstaDiferita);
        

        Assert.assertEquals("Varsta nu a fost cea asteptata ", varstaDiferita, persoana.getVarsta());
    }

    
    @Test
    public void testConstructorRightInitializareAtribute() {
        String nume = "Marcel";
        int varsta = 25;
        String cnp = "1880923670027";
        String adresa = "Aleea Plopilor, Nr. 24";

        Persoana persoanaTest = new Persoana(nume, varsta, cnp, adresa, SALARIU);

        Assert.assertEquals("Numele nu este initializat corect", nume, persoanaTest.getNume());
        Assert.assertEquals("Varsta nu este initializata coresct", varsta, persoanaTest.getVarsta());
        Assert.assertEquals("CNP-ul nu este initializat coresct", cnp, persoanaTest.getCNP());
        Assert.assertEquals("ADresa nu este initializata coresct", adresa, persoanaTest.getAdresa());
    }

    //Si Existance
    @Test
    public void testConstructorRightCreareObiect() {
        try {
            Persoana persoana1 = new Persoana(NUME, VARSTA, CNP, ADRESA, SALARIU);
            Assert.assertNotNull(persoana1);
        } catch (Exception e) {
            Assert.fail("Constructorul a generat eroare pentru valori corecte");
        }
    }

    
    @Test
    public void testCalculeazaScorCreditRight() throws ExceptiePersoanaVarstaInvalida {
        persoana.setVarsta(15);

        int scorAsteptat = 10;

        int scorCalculat = persoana.calculeazaScorCredit();

        Assert.assertEquals("Scorul de credit nu a fost calculat cum trebuie", scorAsteptat, scorCalculat);
    }

    //Error conditions
    @Test(expected = ExceptiePersoanaVarstaInvalida.class)
    public void testSetVarstaConditiiEroare() throws ExceptiePersoanaVarstaInvalida {
        int varstaInvalida = -50;

        persoana.setVarsta(varstaInvalida);
    }

}
