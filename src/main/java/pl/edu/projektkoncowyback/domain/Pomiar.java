package pl.edu.projektkoncowyback.domain;

import java.util.Date;

public class Pomiar {
    private Integer id;
    private Date data;
    private Long Temperatura;
    private Long Wilgotnosc;
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
        return Temperatura;
    }

    public void setTemperatura(Long temperatura) {
        Temperatura = temperatura;
    }

    public Long getWilgotnosc() {
        return Wilgotnosc;
    }

    public void setWilgotnosc(Long wilgotnosc) {
        Wilgotnosc = wilgotnosc;
    }
}
