package za.ac.cput.Assign5.com.Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by louisane Malu on 3/28/2016.
 */
public class Customer implements Serializable, Payment {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String identification;
    private String custNum;
    private String name;
    private String surname;

    private Customer(Builder b){
        identification = b.identification;
        name = b.name;
        surname = b.surname;
        custNum = b.custNum;
    }

    @Override
    public String paymentType() {
        return null;
    }

    @Override
    public double costForEverything() {
        return 0;
    }

    public static class Builder{
        private String identification;
        private String name;
        private String surname;
        private String custNum;

        public Builder(String custNum) {
            this.custNum = custNum;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder idendtification(String identification){
            this.identification = identification;
            return this;
        }
        public Builder customer(Customer cust){
            name = cust.getName();
            surname = cust.getSurname();
            identification = cust.getIdentification();
            custNum = cust.getCustNum();
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public String getIdentification() {
        return identification;
    }
    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }
    public String getCustNum() {
        return custNum;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identification != null ? identification.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.identification == null && other.identification != null) || (this.identification != null && !this.identification.equals(other.identification))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Customer[ id = " + identification + " ]";
    }
}
