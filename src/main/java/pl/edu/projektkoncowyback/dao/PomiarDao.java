package pl.edu.projektkoncowyback.dao;

import org.springframework.data.repository.CrudRepository;
import pl.edu.projektkoncowyback.domain.Pomiar;

public interface PomiarDao extends CrudRepository<Pomiar, Integer> {
}
