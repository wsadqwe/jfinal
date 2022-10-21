package com.niit.bean2;

import java.util.Arrays;
import java.util.List;

/**
 * @Author
 * @Date 2022/9/30 20:22
 * @Description
 **/
public class Zoo {
    private String zName;
    private String[] animalType;
    private List<String> cats;

    public String getzName() {
        return zName;
    }

    public void setzName(String zName) {
        this.zName = zName;
    }

    public String[] getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String[] animalType) {
        this.animalType = animalType;
    }

    public List<String> getCats() {
        return cats;
    }

    public void setCats(List<String> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zName='" + zName + '\'' +
                ", animalType=" + Arrays.toString(animalType) +
                ", cats=" + cats +
                '}';
    }
}
