package models;


public class User {
    String firstName;
    String surName;
    String gender;
    String yearOfBirth;
    String email;
    String password;

    User(String firstName, String surName, String gender, String yearOfBirth, String email, String password) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.password = password;
    }

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$firstName = this.getFirstName();
                Object other$firstName = other.getFirstName();
                if (this$firstName == null) {
                    if (other$firstName != null) {
                        return false;
                    }
                } else if (!this$firstName.equals(other$firstName)) {
                    return false;
                }

                Object this$surName = this.getSurName();
                Object other$surName = other.getSurName();
                if (this$surName == null) {
                    if (other$surName != null) {
                        return false;
                    }
                } else if (!this$surName.equals(other$surName)) {
                    return false;
                }

                Object this$gender = this.getGender();
                Object other$gender = other.getGender();
                if (this$gender == null) {
                    if (other$gender != null) {
                        return false;
                    }
                } else if (!this$gender.equals(other$gender)) {
                    return false;
                }

                label62: {
                    Object this$yearOfBirth = this.getYearOfBirth();
                    Object other$yearOfBirth = other.getYearOfBirth();
                    if (this$yearOfBirth == null) {
                        if (other$yearOfBirth == null) {
                            break label62;
                        }
                    } else if (this$yearOfBirth.equals(other$yearOfBirth)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label55;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label55;
                    }

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

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

//    public int hashCode() {
//        int PRIME = true;
//        int result = 1;
//        Object $firstName = this.getFirstName();
//        int result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
//        Object $surName = this.getSurName();
//        result = result * 59 + ($surName == null ? 43 : $surName.hashCode());
//        Object $gender = this.getGender();
//        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
//        Object $yearOfBirth = this.getYearOfBirth();
//        result = result * 59 + ($yearOfBirth == null ? 43 : $yearOfBirth.hashCode());
//        Object $email = this.getEmail();
//        result = result * 59 + ($email == null ? 43 : $email.hashCode());
//        Object $password = this.getPassword();
//        result = result * 59 + ($password == null ? 43 : $password.hashCode());
//        return result;
//    }

    public String toString() {
        return "User(firstName=" + this.getFirstName() + ", surName=" + this.getSurName() + ", gender=" + this.getGender() + ", yearOfBirth=" + this.getYearOfBirth() + ", email=" + this.getEmail() + ", password=" + this.getPassword() + ")";
    }

    public static class UserBuilder {
        private String firstName;
        private String surName;
        private String gender;
        private String yearOfBirth;
        private String email;
        private String password;

        UserBuilder() {
        }

        public User.UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public User.UserBuilder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public User.UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public User.UserBuilder yearOfBirth(String yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public User.UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User.UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this.firstName, this.surName, this.gender, this.yearOfBirth, this.email, this.password);
        }

        public String toString() {
            return "User.UserBuilder(firstName=" + this.firstName + ", surName=" + this.surName + ", gender=" + this.gender + ", yearOfBirth=" + this.yearOfBirth + ", email=" + this.email + ", password=" + this.password + ")";
        }
    }
}

