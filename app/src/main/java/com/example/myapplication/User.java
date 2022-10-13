package com.example.myapplication;

import android.os.Parcelable;
import android.os.Parcel;

import java.io.Serializable;


public class User implements Parcelable {

    private String name;
    private String company;
    private int age;


    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            String name = source.readString();
            String company = source.readString();
            int age = source.readInt();
            return new User(name, company, age);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String name, String company, int age){
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(){
        this.company = company;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
        dest.writeString(company);
        dest.writeInt(age);
    }

}
