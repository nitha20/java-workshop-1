package src.com.example.temp.bean;

public class Building {
    private String name;
    private String area;
    private double floor;
    private LocalDatetime opendatetime;
    private LocalDatetime closedatetime;

    // Getters and Setters
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
    public LocalDatetime getOpendatetime() {
        return opendatetime;
    }

    public void setOpendatetime(LocalDatetime opendatetime) {
        this.opendatetime = opendatetime;
    }
    public LocalDatetime getClosedatetime() {
        return closedatetime;
    }
    public void setClosedatetime(LocalDatetime closedatetime) {
        this.closedatetime = closedatetime;
    }

    
}
