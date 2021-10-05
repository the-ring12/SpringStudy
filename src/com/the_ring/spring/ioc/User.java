package com.the_ring.spring.ioc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

    private String sname;

//    public User(String sname) {
//        this.sname = sname;
//    }

    private String[] ss;

    private List<String> friends;

    private Map<String, String> parents;

    private Set<String> abc;

    private TelNum telephone;

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSs(String[] ss) {
        this.ss = ss;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setParents(Map<String, String> parents) {
        this.parents = parents;
    }

    public void setAbc(Set<String> abc) {
        this.abc = abc;
    }

    public void setTelephone(TelNum telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User{" +
                "sname='" + sname + '\'' +
                ", ss=" + Arrays.toString(ss) +
                ", friends=" + friends +
                ", parents=" + parents +
                ", abc=" + abc +
                ", telephone=" + telephone +
                '}';
    }

    public void add() {
        System.out.println("add......");
    }
}
