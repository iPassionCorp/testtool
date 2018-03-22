package th.co.ipassion.testtool.dto.tlitext;

public class Address {

    private String addressid;
    private String address;
    private String tumbon;
    private String zipcode;
    private String startdate;

    public String getAddressid() {
        return addressid;
    }

    public String getAddress() {
        return address;
    }

    public String getTumbon() {
        return tumbon;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTumbon(String tumbon) {
        this.tumbon = tumbon;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
}
