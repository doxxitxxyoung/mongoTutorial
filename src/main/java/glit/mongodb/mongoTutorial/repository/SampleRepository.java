package glit.mongodb.mongoTutorial.repository;

import glit.mongodb.mongoTutorial.model.Samples;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SampleRepository extends MongoRepository<Samples, String> {
    List<Samples> findAll();

    Optional<Samples> findById(String id);

    List<Samples> findByDrugname(String drugname);
}
