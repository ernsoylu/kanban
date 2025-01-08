package org.softncon.User;

public class User {
    private String id;
    private String username;
    private String password;
    private int permissionState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPermissionState() {
        return permissionState;
    }

    public void setPermissionState(int permissionState) {
        this.permissionState = permissionState;
    }
}
