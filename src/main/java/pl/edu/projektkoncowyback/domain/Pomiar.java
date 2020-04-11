package pl.edu.projektkoncowyback.domain;

import javax.persistence.*;

@Entity
@Table(name="pomiary")
public class Pomiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;


//    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//    private Date tymczasowa = new Date();
//	private String data = dateFormat.format(tymczasowa);
private String data;
    private int temperatura;
    private int wilgotnosc;
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

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(long temperatura) {
        temperatura = temperatura;
    }

    public int getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(long wilgotnosc) {
        wilgotnosc = wilgotnosc;
    }
}
