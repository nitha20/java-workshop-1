package temperature.beans;

public class Zone {
    private String name;
    private int zoneId;
    private String type;
    private double area;

    //getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getZoneId() {
        return zoneId;
    }
    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {  
        return "Zone [name=" + name + ", zoneId=" + zoneId + ", type=" + type + ", area=" + area + "]";
    }   
    
    
}
