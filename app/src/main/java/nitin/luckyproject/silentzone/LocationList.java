package nitin.luckyproject.silentzone;


public class LocationList {
    String mplace;
    String maddress;

    LocationList(){

    }

    public LocationList(String mplace, String maddress) {
        this.mplace = mplace;
        this.maddress = maddress;
    }

    public String getMplace() {
        return mplace;
    }

    public void setMplace(String mplace) {
        this.mplace = mplace;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }
}
