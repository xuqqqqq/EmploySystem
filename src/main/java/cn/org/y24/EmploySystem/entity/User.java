package cn.org.y24.EmploySystem.entity;

public class User {
    private String id;
    private String name;
    private String org_id;
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String id, String name, String org_id, String email, String phone) {
        this.id = id;
        this.name = name;
        this.org_id = org_id;
        this.email = email;
        this.phone = phone;
    }
}
