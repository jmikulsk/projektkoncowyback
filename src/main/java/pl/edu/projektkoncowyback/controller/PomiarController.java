package pl.edu.projektkoncowyback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.projektkoncowyback.dao.PomiarDao;
import pl.edu.projektkoncowyback.domain.Pomiar;

import java.util.List;
u
@RestController
@RequestMapping("api")
@CrossOrigin
public class PomiarController {
    @Autowired
    private PomiarDao pomiarDao;

    @GetMapping("pomiary")
    public List<Pomiar> pomiary() { return (List)pomiarDao.findAll();}

    @DeleteMapping("pomiary/usun/{id}")
    public void removeProduct(@PathVariable Integer id) {
        pomiarDao.deleteById(id);
    }

    @PostMapping("pomiary/zapisz")
    public void saveProduct(@RequestBody Pomiar pomiar) {
        pomiarDao.save(pomiar);
    }

    @GetMapping("pomiary/single/{id}")
    public Pomiar getProduct(@PathVariable Integer id) {
        return pomiarDao.findById(id).get();
    }


}
