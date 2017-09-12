package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Calendar")
public class Calendar implements Serializable{
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="title")
    private String title;
    
    @Column(name="start")
    private String start;
    
    @Column(name="end")
    private String end;
    
    @Column(name="color")
    private String color;
    
    @Column(name = "Marcador")
    private String Marcador;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campo")
    private Campos campo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Equipo_A")
    private Campos Equipo_A;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Equipo_B")
    private Campos Equipo_B;

    public Calendar() {
        
    }

    public Calendar(int id, String title, String start, String end, String color, String Marcador, Campos campo, Campos Equipo_A, Campos Equipo_B) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
        this.color = color;
        this.Marcador = Marcador;
        this.campo = campo;
        this.Equipo_A = Equipo_A;
        this.Equipo_B = Equipo_B;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarcador() {
        return Marcador;
    }

    public void setMarcador(String Marcador) {
        this.Marcador = Marcador;
    }

    public Campos getCampo() {
        return campo;
    }

    public void setCampo(Campos campo) {
        this.campo = campo;
    }

    public Campos getEquipo_A() {
        return Equipo_A;
    }

    public void setEquipo_A(Campos Equipo_A) {
        this.Equipo_A = Equipo_A;
    }

    public Campos getEquipo_B() {
        return Equipo_B;
    }

    public void setEquipo_B(Campos Equipo_B) {
        this.Equipo_B = Equipo_B;
    }
    
}
