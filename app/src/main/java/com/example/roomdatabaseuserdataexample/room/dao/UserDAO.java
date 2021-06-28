package com.example.roomdatabaseuserdataexample.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomdatabaseuserdataexample.room.entities.User;

import java.util.List;

@Dao
public interface  UserDAO {

    @Insert
    public void setUser(User user);

    @Query("Select * from user")
    public LiveData<List<User>> getAllUsers();

}
