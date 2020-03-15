package com.example.getitems.ItemViewModel;

import com.example.getitems.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ItemAttribute {

    Unknown(0),
    Attack(10),
    Defense(12),
    Speed(20);


    @Override
    public String toString() {
        switch(this){
            case Unknown:
                return "Unknown";
            case Attack:
                return "Attack";
            case Defense:
                return "Defense";
            case Speed:
                return "Speed";
        }
        return "Unknown";
    }

    private int intValue;
    private static final List<String> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (ItemAttribute someEnum : ItemAttribute.values()) {
            VALUES.add(someEnum.toString());
        }
    }

    public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
    }

    ItemAttribute(int value) {
        intValue = value;
    }

    // Lookup the string for the value
    public static String getString(int value){
        for (ItemAttribute item : ItemAttribute.values()) {
            if (value == item.intValue){
                return item.toString();
            }
        }
        return null;
    }

    // Lookup the value for the string
    public static int getValue(String string){
        for (ItemAttribute item : ItemAttribute.values()) {
            if (string.equals(item.toString())){
                return item.intValue;
            }
        }
        return -1;
    }
}