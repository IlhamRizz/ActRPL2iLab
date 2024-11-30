package rpl2_pert2_50421834;
import java.time.*;

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    private String name;
    private String npm;
    private String alamat;
    private String classNumber;
    private int birthYear;
    
    public Student(){
        this.name = "";
        this.npm = "";
        this.alamat = "";
        this.classNumber = ""; 
        this.birthYear = 0;
    }
    
    public int calculateAge(){
        int currentYear = Year.now().getValue();
        int x = currentYear - birthYear;
        return x;
    }
}
