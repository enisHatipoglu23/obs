public class Main {
    public static void main(String[] args) {

        Teacher m1 = new Teacher("MAT", "Maykıl");
        Teacher f1 = new Teacher("FİZ", "ceksın");
        Teacher k1 = new Teacher("KİM", "bilmemmi");

        Lessons mat = new Lessons("Matematik", "mat101", "MAT");
       Lessons fiz = new Lessons("Fizik", "fiz101", "FİZ");
        Lessons kim = new Lessons("Kimya", "kim101", "KİM");

        Student student1 = new Student("enis", "2212121", "4", mat, fiz, kim );
        student1.addBulkExamNote(50,60,55);
        student1.addBulkSpeakingExamNote(45,70,65);
        student1.isPass();

        Student student2 = new Student("yamur", "2323232", "4", mat, fiz, kim );
        student2.addBulkExamNote(54,67,69);
        student2.addBulkSpeakingExamNote(45,70,65);
        student2.isPass();

        Student student3 = new Student("gotelek", "232565562", "4", mat, fiz, kim );
        student3.addBulkExamNote(23,31,69);
        student3.addBulkSpeakingExamNote(33,63,29);
        student3.isPass();


        mat.addTeacher(m1);

        fiz.addTeacher(f1);

        kim.addTeacher(k1);







    }
}
