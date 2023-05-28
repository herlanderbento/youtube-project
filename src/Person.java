public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected float experience;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public float getExperience(){
        return this.experience;
    }

    public float setExperience(float experience){
        return this.experience = experience;
    }

}
