package com.example.roomdatabaseuserdataexample.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity( tableName = "user", primaryKeys = {"user_id","last_name"})
public class User {
    @ColumnInfo (name ="user_id")
    @PrimaryKey
    public int userID;
    @ColumnInfo(name = "first_name")
    public String strFirstName;
    @ColumnInfo(name = "last_name")
    public String strLastName;

    @Ignore
    public String strRemark;

    public String getStrRemark() {
        return strRemark;
    }

    public void setStrRemark(String strRemark) {
        this.strRemark = strRemark;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }
}
