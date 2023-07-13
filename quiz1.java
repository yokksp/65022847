
/**
 * student
 */
public class quiz1 {

    public static void main(String[] args) {
       student S1 = new student(65000001, "bee", 2003, 3.00);
       student S2 = new student(65000002, "bam", 2003, 3.50);
       student S3 = new student(65000003, "bar", 2003, 3.20);

       S1.ShowDetails();

       S2.ChangeGPA(3.35);
       S2.ShowDetails();
       
       S3.ShowDetails();
       S3.ChangeName("bar");
       S3.ShowDetails();
    }
}
class student {
    private int ID;
    private String Name;
    private int addmissionYear;
    private double GPA;

    public void ShowDetails(){
        System.out.println("ID : " +ID);
        System.out.println("Name : " +Name);
        System.out.println("addmissionYear : " +addmissionYear);
        System.out.println("GPA : " +GPA);
        System.out.println();
    }

    student (int id , String name , int addmissionYear , double gpa){
        this.ID = id;
        this.Name = name;
        this.addmissionYear = addmissionYear;
        this.GPA = gpa;
    }

    public void ChangeGPA(double gpa){
        
        System.out.println("change" + this.Name + this.ID + this.GPA + "->" +GPA);
        this.GPA = gpa;
    }

    public void ChangeName(String name){
        
        System.out.println("change" + this.Name + this.ID + this.GPA + "->" +GPA);
        this.Name = name;
    }

}