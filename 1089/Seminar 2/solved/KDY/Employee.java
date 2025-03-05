public class Employee {
    int salaryPerHour;
    //int salary; ->KISS 
    int hours;

    public void reportHours(int addHours) {
        hours+=addHours;
        //salary=salaryPerHour*hours;
    }

    public int findMinInsideUnsortedArray(int [] v) throws Exception {//DRY + KISS
        if(v==null || v.length==0 ) {
            throw new Exception("Vector is null");
        }
        int min=v[0];
        for(int i=0;i<v.length;i++) {
            if(min>v[i]) {
                min=v[i];
            }
        }
//		for(int i=2;i<v.length;i=i+2) {
//			if(min>v[i]) {  
//				min=v[i];
//			}
//		}
//
        return min;
    }

    public String getExam(int numberExam) throws Exception {

        if(numberExam<1 || numberExam>5)
          throw new Exception("exam must be in range 1 to 5");

        String[] exams = {
                "OOP Exam",
                "Java Exam",
                "Data structure Exam",
                "C# Exam",
                "Statistics Exam"

        };

        return exams[numberExam - 1];

      //return ExamSubjects.getExamById(numberExam);
    }


}
