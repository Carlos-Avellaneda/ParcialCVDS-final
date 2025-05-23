package parcial.cvds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class DatesController {

    @Autowired
    private DateRepository dateRepository;


    @GetMapping
    public List<Date> listarDates() {
        return dateRepository.findAll();
    }


    @GetMapping("/{id}")
    public Date obtainDate(@PathVariable String id) {
        return dateRepository.findById(id).orElse(null);
    }


    @PostMapping
    public Date createDate(@RequestBody String name,String cedula,String speciality) {

        Date date = new Date(name,cedula);
        date.setDateA(LocalDate.of(2023, 10, 15));
        date.setDoctor("doctor simisimi");
        date.setSpeciality(speciality);
        date.setLocation("Hospital");
        return dateRepository.save(date);
    }

    @DeleteMapping("/{id}")
    public void deleteDate(@PathVariable String id) {
        dateRepository.deleteById(id);
    }


    @GetMapping("/speciality/{speciality}")
    public List<Date> searchBySpeciality(@PathVariable String speciality) {
        return dateRepository.findBySpeciality(speciality);
    }
}