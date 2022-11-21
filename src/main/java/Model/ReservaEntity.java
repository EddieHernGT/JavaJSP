package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva", schema = "salonesdb", catalog = "")
public class ReservaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idreserva")
    private int idreserva;
    @Basic
    @Column(name = "numaula")
    private int numaula;
    @Basic
    @Column(name = "idusuario")
    private int idusuario;
    @ManyToOne
    @JoinColumn(name = "numaula", referencedColumnName = "num_aula", nullable = false)
    private AulaEntity aulaByNumaula;
    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = false)
    private UsuarioEntity usuarioByIdusuario;

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getNumaula() {
        return numaula;
    }

    public void setNumaula(int numaula) {
        this.numaula = numaula;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservaEntity that = (ReservaEntity) o;

        if (idreserva != that.idreserva) return false;
        if (numaula != that.numaula) return false;
        if (idusuario != that.idusuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idreserva;
        result = 31 * result + numaula;
        result = 31 * result + idusuario;
        return result;
    }

    public AulaEntity getAulaByNumaula() {
        return aulaByNumaula;
    }

    public void setAulaByNumaula(AulaEntity aulaByNumaula) {
        this.aulaByNumaula = aulaByNumaula;
    }

    public UsuarioEntity getUsuarioByIdusuario() {
        return usuarioByIdusuario;
    }

    public void setUsuarioByIdusuario(UsuarioEntity usuarioByIdusuario) {
        this.usuarioByIdusuario = usuarioByIdusuario;
    }
}
