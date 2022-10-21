package com.niit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author
 * @Date 2022/9/30 15:06
 * @Description
 **/

public class Plane {
    private int pNumber;
    private String pType;
    private String pName;

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "pNumber=" + pNumber +
                ", pType='" + pType + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
