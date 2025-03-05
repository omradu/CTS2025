public enum Exams {
    OOP(1), JAVA(2), DATA_STRUCTURE(3), C_SHARP(4), STATISTICS(5);

    private int id;

    ExamSubjects (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static String getExamById(int id) {
        for(Exams exams : values()) {
            if(exams.getId() == id)
                return exams.name();
        }
        return null;
    }
}
