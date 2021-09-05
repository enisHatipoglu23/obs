public class Lessons {
    Teacher teacher;
    String name;
    String prefix;
    double note;
    double sNote;
    double av;
    String lCode;

    public Lessons(String name, String lCode, String prefix) {
        this.prefix = prefix;
        this.name = name;
        this.lCode = lCode;
    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            printTeacher();
            System.out.println("Eşleştirme tamamlandı. ");
        }else{
            System.out.println(teacher.name + "Yanlış kişiyi seçtiniz. ");
        }

    }

    public void printTeacher(){
        if (teacher != null){
            System.out.println(this.name + " dersinin akademisyeni " + teacher.name + "'dir.");
            System.out.println("****************");
        }else{
            System.out.println(this.name + " dersine akademisyen atanmamıştır. ");
        }
    }


}
