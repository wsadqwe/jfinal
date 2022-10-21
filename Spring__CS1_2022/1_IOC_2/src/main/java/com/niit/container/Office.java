package com.niit.container;

import java.util.Map;
import java.util.Set;

/**
 * @Author
 * @Date 2022/10/3 19:17
 * @Description
 **/
public class Office {
    private Set<String> chairs;
    private Map<String,String> computers;

    @Override
    public String toString() {
        return "Office{" +
                "chairs=" + chairs +
                ", computers=" + computers +
                '}';
    }

    public Set<String> getChairs() {
        return chairs;
    }

    public void setChairs(Set<String> chairs) {
        this.chairs = chairs;
    }

    public Map<String, String> getComputers() {
        return computers;
    }

    public void setComputers(Map<String, String> computers) {
        this.computers = computers;
    }
}
