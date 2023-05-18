package sg.edu.rp.c346.id21037598.mymodules;

import java.io.Serializable;

// Create new module class to store module objects
public class Module implements Serializable {

    private String code, name, venue;
    private int year = 2023, semester = 1, credit = 4;

    public Module(String code, String name, String venue) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.credit = credit;
        this.venue = venue;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public int getCredit() {
        return credit;
    }

    public String getVenue() {
        return venue;
    }

}
