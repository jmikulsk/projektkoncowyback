package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;

    private Date data;
    private Long temperatura;
    private Long wilgotnosc;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Long temperatura) {
        temperatura = temperatura;
    }

    public Long getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(Long wilgotnosc) {
        wilgotnosc = wilgotnosc;
    }
}
