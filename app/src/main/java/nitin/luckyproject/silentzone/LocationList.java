package nitin.luckyproject.silentzone;


public class LocationList {
    String mplace;
    String maddress;


    public LocationList(String place, String address) {
        this.mplace = place;
        this.maddress = address;
    }

    public String getMplace() {
        return mplace;
    }

    public void setMplace(String place) {
        this.mplace = place;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String address) {
        this.maddress = address;
    }
}
