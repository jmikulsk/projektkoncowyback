package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;

@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String data;
    private float temperatura;
    private float wilgotnosc;

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

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(float wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }
}
