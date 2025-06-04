public class PersonTest {

    // Test fixture
    Person person;

    public static final String NAME;
    public static final int AGE = IPersonValidation.MIN_AGE; // Limits are defined in an interface
    public static final String SSN;
    public static final String ADDRESS;
    public static final double SALARY = 1500;

    // Generate test values that fall within valid character length limits
    static {
        String initialName = "";
        String initialSSN = "";
        String initialAddress = "";

        for (int i = 0; i < IPersonValidation.MIN_NAME_LENGTH; i++) {
            initialName += "A";
        }
        NAME = initialName;

        for (int i = 0; i < IPersonValidation.SSN_LENGTH; i++) {
            initialSSN += "1";
        }
        SSN = initialSSN;

        for (int i = 0; i < IPersonValidation.MIN_ADDRESS_LENGTH; i++) {
            initialAddress += "A";
        }
        ADDRESS = initialAddress;
    }

    @Before
    public void setUp() throws Exception {
        person = new Person(NAME, AGE, SSN, ADDRESS, SALARY);
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

    

    // 1. Constructor Right Test – Attribute Initialization
    @Test
    public void testConstructorCorrectAttributeInitialization() {
        String name = "Marcel";
        int age = 25;
        String ssn = "1880923670027";
        String address = "Plopilor Alley, No. 24";

        Person testPerson = new Person(name, age, ssn, address, SALARY);

        Assert.assertEquals("Name is not initialized correctly", name, testPerson.getName());
        Assert.assertEquals("Age is not initialized correctly", age, testPerson.getAge());
        Assert.assertEquals("SSN is not initialized correctly", ssn, testPerson.getSSN());
        Assert.assertEquals("Address is not initialized correctly", address, testPerson.getAddress());
    }

    // 2. Conformance + Right – Input is valid, result is as expected
    @Test
    public void testSetAgeConformance() throws InvalidPersonAgeException {
        int differentAge = AGE + 5;
        person.setAge(differentAge);
        Assert.assertEquals("Age is not as expected", differentAge, person.getAge());
    }

    // 3. Existence – Object is created successfully
    @Test
    public void testConstructorObjectCreation() {
        try {
            Person person1 = new Person(NAME, AGE, SSN, ADDRESS, SALARY);
            Assert.assertNotNull(person1);
        } catch (Exception e) {
            Assert.fail("Constructor threw an exception for valid input");
        }
    }

    // 4. Right – Credit score calculation for valid input
    @Test
    public void testCalculateCreditScoreCorrect() throws InvalidPersonAgeException {
        person.setAge(15);
        int expectedScore = 10;
        int calculatedScore = person.calculateCreditScore();
        Assert.assertEquals("Credit score was not calculated correctly", expectedScore, calculatedScore);
    }

    // 5. Error Conditions – Invalid age should throw exception
    @Test(expected = InvalidPersonAgeException.class)
    public void testSetAgeErrorCondition() throws InvalidPersonAgeException {
        int invalidAge = -50;
        person.setAge(invalidAge);
    }
}
