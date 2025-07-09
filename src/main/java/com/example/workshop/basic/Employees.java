package src.com.example.temp.bean;

public class Employees{
    public static void main(String[] args) {
        String[][] employees= new String[3][2];
        employees[0][0] = "nidha";
        employees[0][1] = "10000";
        employees[1][0] = "nowrin";
        employees[1][1] = "20000";
        employees[2][0] = "lara";
        employees[2][1] = "30000";
           for (String[] emp : employees) {
            System.out.println("Name: " + emp[0] + ", Salary: " + emp[1]);
    }
    

            

    }


    
}
