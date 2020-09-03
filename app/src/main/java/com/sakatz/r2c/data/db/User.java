package com.sakatz.r2c.data.db;

import androidx.room.*;

@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "display_name")
    public String displayName;

    @ColumnInfo(name = "password_hash")
    public String passwordHash;
}