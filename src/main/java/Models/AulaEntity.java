package Models;

import org.hibernate.annotations.Entity;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "aula", schema = "salonesdb", catalog = "")
public class AulaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_aula")
    private int numAula;
    @Basic
    @Column(name = "capacidad")
    private int capacidad;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "estado")
    private byte estado;
    @OneToMany(mappedBy = "aulaByNumaula")
    private Collection<ReservaEntity> reservasByNumAula;

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AulaEntity that = (AulaEntity) o;

        if (numAula != that.numAula) return false;
        if (capacidad != that.capacidad) return false;
        if (estado != that.estado) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numAula;
        result = 31 * result + capacidad;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (int) estado;
        return result;
    }

    public Collection<ReservaEntity> getReservasByNumAula() {
        return reservasByNumAula;
    }

    public void setReservasByNumAula(Collection<ReservaEntity> reservasByNumAula) {
        this.reservasByNumAula = reservasByNumAula;
    }
}
