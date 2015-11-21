package com.hackgirlszju.model;

public class Nominee {
    private Integer id;

    private Integer taskId;

    private Integer nomineeId;

    private String nomineeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getNomineeId() {
        return nomineeId;
    }

    public void setNomineeId(Integer nomineeId) {
        this.nomineeId = nomineeId;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName == null ? null : nomineeName.trim();
    }
}