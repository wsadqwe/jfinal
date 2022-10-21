package com.niit.autoinject;

/**
 * @Author
 * @Date 2022/10/6 8:28
 * @Description
 **/
public class Room {
    private Sofa sofa;

    @Override
    public String toString() {
        return "Room{" +
                "sofa=" + sofa +
                '}';
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }
}
