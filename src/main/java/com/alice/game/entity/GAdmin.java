package com.alice.game.entity;

public class GAdmin {
    private Integer id;

    private String adminaccount;

    private String adminpassword;

    private String adminnickname;

    private Integer adminlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminnickname() {
        return adminnickname;
    }

    public void setAdminnickname(String adminnickname) {
        this.adminnickname = adminnickname == null ? null : adminnickname.trim();
    }

    public Integer getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(Integer adminlevel) {
        this.adminlevel = adminlevel;
    }
}