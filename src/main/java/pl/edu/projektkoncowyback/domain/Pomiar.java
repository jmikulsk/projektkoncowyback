package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    LocalDateTime today = LocalDateTime.now();
    private String data  =formatter.format(today);

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
