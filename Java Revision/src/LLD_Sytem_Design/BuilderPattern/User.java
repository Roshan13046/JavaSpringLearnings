package LLD_Sytem_Design.BuilderPattern;

public class User {
    String name;
    String email;
    String phoneNo;
    String Address;
    String optionalEmailId;

    User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNo = builder.phoneNo;
        this.Address = builder.Address;
        this.optionalEmailId = builder.optionalEmailId;
    }

    public static class Builder{
        String name;
        String email;
        String phoneNo;
        String Address;
        String optionalEmailId;

        Builder(String name,String email){
            this.name = name;
            this.email = email;
        }


        public Builder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder Address(String address){
            this.Address = address;
            return this;
        }

        public Builder optionalEmailId(String optionalEmailId){
            this.optionalEmailId = optionalEmailId;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }


    public static void main(String[] args) {
        User user = new User.Builder("ROSHAN", "rosxyz@gmail.com")
                .phoneNo("8394984")
                .Address("AdressXYZ, BHDBHJ, JH").build();

        System.out.println("USER: " + user.name);
    }
}
