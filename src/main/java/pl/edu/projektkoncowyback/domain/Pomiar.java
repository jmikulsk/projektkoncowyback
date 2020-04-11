package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;

@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;

    private String data;
    private Integer temperatura;
    private Integer wilgotnosc;
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

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        temperatura = temperatura;
    }

    public Integer getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(Integer wilgotnosc) {
        wilgotnosc = wilgotnosc;
    }
}
