package temperature.beans;
import java.time.LocalDateTime; 
public class Building {
    private String name;
    private String area;
    private double floor;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    
    public String getName() {
        return name;
    }       
    public void setName(String name) {
        this.name = name;
    }                   
    public String getArea() {
        return area;
    } 
    public void setArea(String area) {
        this.area = area;
    }
    public double getFloor() {
        return floor;
    }
    public void setFloor(double floor) {
        this.floor = floor;
    }
    public LocalDateTime getOpendatetime() {
        return opendatetime;
    }
    public void setOpendatetime(LocalDateTime opendatetime) {
        this.opendatetime = opendatetime;
    }
    public LocalDateTime getClosedatetime() {
        return closedatetime;
    }
    public void setClosedatetime(LocalDateTime closedatetime) {
        this.closedatetime = closedatetime;
    }
    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Number of Floors: " + floor);
        System.out.println("Open Date and Time: " + opendatetime);
        System.out.println("Close Date and Time: " + closedatetime);
    }
    @Override
    public String toString() { 
        return "Building [name=" + name + ", area=" + area + ", floor=" + floor + ", opendatetime=" + opendatetime
                + ", closedatetime=" + closedatetime + "]";
    }
}
