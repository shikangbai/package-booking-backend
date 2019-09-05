package tws.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Package {
    @NotBlank(message = "billNo不能为空")
    private String billNo;
    @NotBlank(message = "addressee不能为空")
    private String addressee;
    @NotBlank(message = "photo不能为空")
    private String photo;
    @NotBlank(message = "status不能为空")
    private String status;
    private Date pickTime;
    private String weight;

    public Package(String billNo, String addressee, String photo, String status, Date pickTime,String weight) {
        this.billNo = billNo;
        this.addressee = addressee;
        this.photo = photo;
        this.status = status;
        this.pickTime = pickTime;
        this.weight = weight;
    }

    public Package() {
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPickTime() {
        return pickTime;
    }

    public void setPickTime(Date pickTime) {
        this.pickTime = pickTime;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Package{" +
                "billNo='" + billNo + '\'' +
                ", addressee='" + addressee + '\'' +
                ", photo='" + photo + '\'' +
                ", status='" + status + '\'' +
                ", pickTime=" + pickTime +
                ", weight='" + weight + '\'' +
                '}';
    }
}
