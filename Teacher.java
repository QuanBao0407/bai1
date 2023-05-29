public class Teacher extends People {
    public String level;
    public String experience;
    public String subject;
    public Teacher() {
        super();
    }

    public Teacher(String level, String experience, String subject) {
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    public Teacher(String name, String sex, int age, int height, int weight, String level, String experience, String subject) {
        super(name, sex, age, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString(){
        return "level "+getLevel()+"subject"+getSubject()+getExperience();
    }
}
