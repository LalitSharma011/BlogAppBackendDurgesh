package com.natwest.blogappapis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

//@NoArgsConstructor
//@Getter
//@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username must be at least 4 characters")
    private String name;

    @Email(message = "Email address not valid !")
    private String email;

    @NotEmpty
    @Size(min = 3, max = 10, message = "Password must be at least 3 characters and maximum 10 characters long")
//    @Pattern(regexp = )
    private String password;

    @NotEmpty
    private String about;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
