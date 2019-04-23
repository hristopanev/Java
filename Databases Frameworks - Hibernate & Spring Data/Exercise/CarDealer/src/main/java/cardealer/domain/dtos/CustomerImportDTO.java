package cardealer.domain.dtos;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerImportDTO {

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "birth-date")
    private String  birthDate;

    @XmlElement(name = "is-young-driver")
    private Boolean isYoungDriver;


    public CustomerImportDTO() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getYoungDriver() {
        return this.isYoungDriver;
    }

    public void setYoungDriver(Boolean youngDriver) {
        isYoungDriver = youngDriver;
    }
}
