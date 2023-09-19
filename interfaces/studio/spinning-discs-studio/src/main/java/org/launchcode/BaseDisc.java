package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name; {

    }
    private ArrayList<String> contents;
    private Integer capacity;
    private String type;
    private Integer remainingSpace;

    public BaseDisc(String name, String contents, Integer capacity, String type, Integer remainingSpace) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.type = type;
        this.remainingSpace = remainingSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRemainingSpace() {
        return remainingSpace;
    }

    public void setRemainingSpace(Integer remainingSpace) {
        this.remainingSpace = remainingSpace;
    }

    public void writeData(String data, int dataSize) {
        if (checkCapacity(dataSize)>dataSize){
            this.contents.add(data);
        }
    };

    public void readData() {
        System.out.println(contents);
    }
    public int checkCapacity(int dataWritten) {
        int remainingCapacity;
        remainingCapacity=capacity-dataWritten;
               return remainingCapacity;
    }
}
