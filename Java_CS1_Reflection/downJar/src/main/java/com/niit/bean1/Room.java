package com.niit.bean1;

/**
 * @Author
 * @Date 2022/9/30 20:07
 * @Description
 **/
public class Room {
    private String roomNumber;
    private TV tv;

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", tv=" + tv +
                '}';
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
