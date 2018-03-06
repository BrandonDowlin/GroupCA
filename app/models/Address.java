package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model {
    @Id
    private Long id;

    @Constraints.Required
    private String street;

    @Constraints.Required
    private String county;

    public Address() {
    }

    public Address(Long id, String street, String county) {
        this.id = id;
        this.street = street;
        this.county = county;
    }

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getStreet(){
        return this.street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    public String getCounty(){
        return this.county;
    }
    public void setCounty(String county){
        this.county = county;
    }
}