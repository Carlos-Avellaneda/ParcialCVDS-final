package parcial.cvds;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DateRepository extends MongoRepository<Date,String> {
    List<Date> findBySpeciality(String especialidad);
}
