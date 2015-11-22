package com.hackgirlszju.model;

/**
 * Created by sibylla on 15/11/22.
 */
public class UserKey {

    private String name;

    private Integer id;

    public UserKey(Integer id,String name) {
        this.name = name;
        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
