package org.example.creational.builder.modal;

import java.util.List;

public class User {
    private final Long id;
    private final String firstName;
    private final String secondName;
    private final String address;
    private final String email;
    private final List<Skill> skills;

    public User(Long id, String firstName, String secondName, String address, String email, List<Skill> skills) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.email = email;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", skills=" + skills +
                '}';
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private Long id;
        private String firstName;
        private String secondName;
        private String address;
        private String email;
        private List<Skill> skills;

        public User build() {
            return new User(id, firstName, secondName, address, email, skills);
        }

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder skills(List<Skill> skills) {
            this.skills = skills;
            return this;
        }
    }
}
