package org.bank_deatils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.StaleStateException;

@Entity
public class Bankdeatisl
{
    @Id
    private int bnk_id;
    private String bnk_name;
    private String bnk_city;
    private String bnk_ifc;

    public Bankdeatisl(int i, String axis, String hyderabad, String axis000HYD005)
    {
        this.bnk_id = bnk_id;
        this.bnk_name = bnk_name;
        this.bnk_city = bnk_city;
        this.bnk_ifc = bnk_ifc;
    }

    public int getBnk_id() {
        return bnk_id;
    }

    public void setBnk_id(int bnk_id) {
        this.bnk_id = bnk_id;
    }

    public String getBnk_name() {
        return bnk_name;
    }

    public void setBnk_name(String bnk_name) {
        this.bnk_name = bnk_name;
    }

    public String getBnk_city() {
        return bnk_city;
    }

    public void setBnk_city(String bnk_city) {
        this.bnk_city = bnk_city;
    }

    public String getBnk_ifc() {
        return bnk_ifc;
    }

    public void setBnk_ifc(String bnk_ifc) {
        this.bnk_ifc = bnk_ifc;
    }


    @Override
    public String toString() {
        return "Bankdeatisl{" +
                "bnk_id=" + bnk_id +
                ", bnk_name='" + bnk_name + '\'' +
                ", bnk_city='" + bnk_city + '\'' +
                ", bnk_ifc='" + bnk_ifc + '\'' +
                '}';
    }
}
