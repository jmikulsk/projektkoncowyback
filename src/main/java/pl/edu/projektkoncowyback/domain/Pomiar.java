package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;

@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String data;
    private Long temperatura;
    private Long wilgotnosc;

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
        this.temperatura = temperatura;
    }

    public Long getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(Long wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

}
