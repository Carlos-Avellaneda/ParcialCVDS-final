package parcial.cvds;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Document(collection = "citas")
public class Date {
    @Id
    private String id;
    private String name;
    private String cedula;
    private LocalDate dateA;
    private String speciality;
    private String doctor;
    private String location;

    
    public Date() {}

    public Date( String name, String cedula) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getSpeciality(){return speciality;}
    public void setSpeciality(String speciality1){this.speciality = speciality1;}
    public String getDoctor(){return doctor;}
    public void setDoctor(String doctor1){this.doctor = doctor1;}
    public String getLocation(){return location;}
    public void setLocation(String location1){this.location = location1;}
    public LocalDate getDateA(){return dateA;}
    public void setDateA(LocalDate dateA1){this.dateA=dateA1;}
}
