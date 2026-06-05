package com.example.JWT.Dto;

import lombok.Generated;

public class LoginRequest {
    private String username;
    private String password;

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public void setUsername(final String username) {
        this.username = username;
    }

    @Generated
    public void setPassword(final String password) {
        this.password = password;
    }

    @Generated
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof LoginRequest)) {
            return false;
        } else {
            LoginRequest other = (LoginRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Generated
    protected boolean canEqual(final Object other) {
        return other instanceof LoginRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        String var10000 = this.getUsername();
        return "LoginRequest(username=" + var10000 + ", password=" + this.getPassword() + ")";
    }
}
