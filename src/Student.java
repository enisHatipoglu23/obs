public class Student {
    String name;
    String stdNo;
    String classes;
    Lessons mat;
    Lessons av;
    Lessons fizik;
    Lessons kimya;
    double average;
    boolean isPass;

    Student(String name, String stdNo, String classes, Lessons mat,
                   Lessons fizik, Lessons kimya) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;
    }

    public Student(){
    }



    public void addBulkExamNote(int mat, int fizik, int kimya ){
        if (mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
    }

    public void addBulkSpeakingExamNote(int mat, int fizik, int kimya ){
        if (mat >= 0 && mat <= 100){
            this.mat.sNote = mat;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.sNote = fizik;
        }
        if (kimya >= 0 && kimya <= 100){
            this.kimya.sNote = kimya;
        }
    }

    public void calcAverage(){
        this.mat.av = (((this.mat.note * 0.80) + (this.mat.sNote * 0.20)));
        this.fizik.av =  ((this.fizik.note * 0.80) + (this.fizik.sNote * 0.20));
        this.kimya.av =  ((this.kimya.note * 0.80) + (this.kimya.sNote * 0.20));
        this.average =( mat.av + fizik.av + kimya.av )/ 3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;

    }

    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note  == 0 ||
                this.mat.sNote == 0 || this.fizik.sNote == 0 || this.kimya.sNote  == 0){
            System.out.println("Ders notları eksik girilmiştir. ");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass){
                System.out.println("Class has been passed. ");
            }else{
                System.out.println("Lessons average are not enough to pass class. ");
            }

        }
    }
    public void printNote(){
        System.out.println("Name : " + name);
        System.out.println("Calcilus : " + this.mat.av);
        System.out.println("Phisic  : " + this.fizik.av);
        System.out.println("Chemia : " + this.kimya.av);


    }


}
