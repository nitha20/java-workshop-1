package temperature.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String country;
    private String city;
    private String address;
    private double postalcode; 
     

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(double postalcode) {
        this.postalcode = postalcode;
    }
    @Override
    public String toString() {        
        return "Location [name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", country=" + country
                + ", city=" + city + ", address=" + address + ", postalcode=" + postalcode + "]";
    }
 }
    

