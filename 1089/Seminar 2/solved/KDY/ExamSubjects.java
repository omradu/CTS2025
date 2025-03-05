public enum ExamSubjects {
    OOP(1), JAVA(2), DATA_STRUCTURE(3), C_SHARP(4), STATISTICS(5);

    private int id;

    ExamSubjects (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static String getExamById(int id) {
        for(ExamSubjects examSubjects : values()) {
            if(examSubjects.getId() == id)
                return examSubjects.name();
        }
        return null;
    }
}
