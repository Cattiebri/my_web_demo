package lv.accenture.bootcamp.webdemo.model;

import java.io.Serializable;

public class Cat implements Serializable {

    private Long id;
    private String nickname;
    private String age;
    private String photo;

    public Cat(Long id, String nickname, String age, String photo) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.photo = photo;
    }

    public Cat() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
