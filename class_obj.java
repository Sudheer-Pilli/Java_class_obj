/* 
Name: Sudheer P
RollNo: 2147234
Programming lang: Java
*/
import java.util.Scanner;


class Student_list {
    int Std_id ;
    String Std_name;
    String Dept_id;
    int Age;
    float Marks;
    String Gender;
    static String College_name = "jain";

    static void get_static_data(){
        College_name = "christ";
    }
    public String show_std_data(){ 
        System.out.print("Enter Std_id: ");
        Scanner Sip = new Scanner(System.in);
        Std_id = Sip.nextInt();
        Sip.nextLine();
        System.out.print("Enter name: ");
        Std_name = Sip.nextLine();
        System.out.print("Enter Dept: ");
        Dept_id= Sip.nextLine();
        // System.out.print("Enter age: ");
        // Age=Sip.nextInt();
        // System.out.print("Enter marks: ");
        // Marks=Sip.nextFloat();
        // Sip.nextLine();
        // System.out.print("Enter Gneder: ");
        // Gender= Sip.nextLine();
        return Std_id + Std_name + Dept_id + College_name;
    }
    public String get_std_name(int Std_id) { //  method with one parameters
        return Std_name;
    }
    public String get_std_name (int Std_id, String Std_name){ // method overloading with two parameters
        return Std_name + Std_id;
    }
    
}

class Department_list {
    int Dept_id ;
    String Dept_name;
    String Dept_desc;
    String Dept_hod;
    // Student_list.College_name ="test";

    private String get_dept_name(int Dept_id) {
        return Dept_hod;
    }

    public void get_Dept() {
        System.out.println(get_dept_name(101));
    }
}

class Company_list {
    int Cmp_id = 102;
    String Cmp_name = "Google";
    int Cmp_rank;
    String Cmp_contact;

    public String get_cmp_name(int Cmp_id) {
        return Cmp_name;
    }
}

class Placement_office {
    int Crd_id;
    int Std_id;
    int Placement_year;
    int Cmp_id;
}

class Placement_coordinator {
    int Crd_id;
    String Crd_name;
    int Crd_phone_no;
    int Std_id;
}

class Job {
    int job_id;
    int Cmp_id;
    String job_role;
    int Std_id;
    float Std_marks;
    boolean check;

    public Boolean eligible_or_not() {
        System.out.println("Welcome to check if you are eligble for the job or not ");
        Scanner jip = new Scanner(System.in);
        // System.out.print("Please enter your Std id ");
        // Std_id = jip.nextInt();
        System.out.print("Please enter your marks");
        Std_marks = jip.nextFloat();
        if (Std_marks >= 80) {
           check=true;
        
        }else{
            check=false;
        }return check;
    }

    public void eligible_or_not(String job_role, int Std_id) {
        // System.out.println("Welcome to check if you are eligble for the job or not overriding ");
        Scanner apj = new Scanner(System.in);
        while(!job_role.equals("DA") && !job_role.equals("AI") ){
            System.out.println("Please chose the jobrole, DA or AI");
            job_role = apj.nextLine();
            System.out.println("You have sucessfully applied for " + job_role);
        }
    }
}

class Interview_schedule {
    int Sch_id;
    String Cmp_Name;
    int sch_time;
    int Job_id;
    int Std_id;

    public void Interview_schedule(){ // method to schedule interview
        System.out.println("please select the select the company: ");
        System.out.println("Google, facebook, instagram");
        Scanner insch =  new Scanner(System.in);
        Cmp_Name = insch.nextLine();
        while(!Cmp_Name.equals("Google") && !Cmp_Name.equals("facebook") && !Cmp_Name.equals("instagram")){
            System.out.println("please enter the correct input");
            Cmp_Name = insch.nextLine();
        }
        System.out.println("please select time and date");
        sch_time = insch.nextInt();

       // returns company name and the interview name
    }
    // Interview_schedule(int a){ // method to schedule interview
    //     System.out.println(" Already scheduled ");

    //    // returns company name and the interview name
    // }


}

class Interview_progress {
    int int_id;
    int Std_id;
    int Cmp_id;
    String Int_status;
}

public class class_obj {

    // Static var,method, block
    static String College_name = "Pes Campus interview";
    
    static{
        System.out.println("college name before " + College_name);
        System.out.println("there is an error in the college name after change");
        College_name="Christ university Campus interview";
    }
    public static void main(String[] args) {
        Student_list Std_list = new Student_list();
        Department_list Dp_list = new Department_list();
        Company_list Cmp_list = new Company_list();
        Placement_office Po_list = new Placement_office();
        Placement_coordinator Plo_list = new Placement_coordinator();
        Job Jb_list = new Job();
        Interview_schedule Is_lSchedulesecond = new Interview_schedule();
        Interview_progress Ip_list = new Interview_progress();

  
        System.out.println(College_name);
        
        Std_list.show_std_data();
        Jb_list.eligible_or_not();
        // Applying for job
        System.out.println("Do you want to apply for job? ");
        Scanner apj = new Scanner(System.in);
        String apply = apj.nextLine();
        // Validating for the input
        while(!apply.equals("Yes") && !apply.equals("No") ){
            System.out.println("Please chose the correct input");
            apply = apj.nextLine();
           
        }
        if (apply.equals("No")){
            System.out.println("Thank you");

            }
            else{
                // System.out.println("Please Enter rollNo: ");
                // Jb_list.Std_id = apj.nextInt();
                 System.out.println("Please chose jobrole, DA or AI");
                 Jb_list.job_role = apj.nextLine();
                Jb_list.eligible_or_not(Jb_list.job_role,Jb_list.Std_id);
                Interview_schedule Is_lScheduleFirst = new Interview_schedule();
                // Interview_schedule Is_lScheduleFirst2 = new Interview_schedule(2);
        }
    }

    

}
