public class User extends  Person{
    private  String login;
    private int total_Assisted;
    public User(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.total_Assisted = 0;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public int getTotal_Assisted() {
        return total_Assisted;
    }

    public void setTotal_Assisted(int total_Assisted) {
        this.total_Assisted = total_Assisted;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", total_Assisted=" + total_Assisted +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", experience=" + experience +
                '}';
    }
}
