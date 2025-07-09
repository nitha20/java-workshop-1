package temperature.beans;

import java.util.Arrays;

public class Employee {

    public static void main(String[] args) {

        String[][] employees = new String[03][02];
        employees[0][0] = "Reshma";
        employees[0][1] = "10,000";
        employees[1][0] = "Nowfiya";
        employees[1][1] = "15,000";
        employees[2][0] = "Sowmya";
        employees[2][1] = "20,000";

        for(String[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }
    }

} 


