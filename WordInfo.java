package com.example.mywordapp.data;

public class WordInfo {
    private int id;
    private String user;
    private String language;
    private String learningCheck;
    private String word;
    private String meaning;
    private String picture;
    private int checked;
    private int del;
    private String createDate;
    private String modifyDate;


    public WordInfo(String user, String language, String word, String meaning) {
        this.user = user;
        this.language = language;
        this.word = word;
        this.meaning = meaning;
    }

    public WordInfo(int id, String user, String language, String learningCheck, String word, String meaning, String picture, int checked, int del, String createDate, String modifyDate) {
        this.id = id;
        this.user = user;
        this.language = language;
        this.learningCheck = learningCheck;
        this.word = word;
        this.meaning = meaning;
        this.picture = picture;
        this.checked = checked;
        this.del = del;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLearningCheck() {
        return learningCheck;
    }

    public void setLearningCheck(String learningCheck) {
        this.learningCheck = learningCheck;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "WordInfo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", language='" + language + '\'' +
                ", learningCheck='" + learningCheck + '\'' +
                ", word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", picture='" + picture + '\'' +
                ", checked=" + checked +
                ", del=" + del +
                ", createDate='" + createDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
