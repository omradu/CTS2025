public class PersonStub implements IPerson {
    int returnCalculateCreditScore;

    public void setReturnCalculateCreditScore(int returnCalculateCreditScore) {
        this.returnCalculateCreditScore = returnCalculateCreditScore;
    }

    @Override
    public int calculateCreditScore() {
        return returnCalculateCreditScore;
    }
}
