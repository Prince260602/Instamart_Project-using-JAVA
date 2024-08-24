package Domain;

import java.util.Date;

public class RentalPackageRate {
    private Integer id;
    private RentalPackage rentalPackage;
    private Integer rate;
    private Date startDate;
    private Date endDate;

    public RentalPackageRate() {
        
    }

    public RentalPackageRate(Integer id, RentalPackage rentalPackage, Integer rate, Date startDate, Date endDate) {
        this.id = id;
        this.rentalPackage = rentalPackage;
        this.rate = rate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RentalPackage getRentalPackage() {
        return rentalPackage;
    }

    public void setRentalPackage(RentalPackage rentalPackage) {
        this.rentalPackage = rentalPackage;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
    
    
}
