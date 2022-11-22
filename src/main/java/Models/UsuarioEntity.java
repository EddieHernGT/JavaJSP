package Models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "usuario", schema = "salonesdb", catalog = "")
public class UsuarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusuario")
    private int idusuario;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "perfil")
    private String perfil;
    @Basic
    @Column(name = "puesto")
    private String puesto;
    @Basic
    @Column(name = "username")
    private String username;
    @OneToMany(mappedBy = "usuarioByIdusuario")
    private Collection<ReservaEntity> reservasByIdusuario;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (idusuario != that.idusuario) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (perfil != null ? !perfil.equals(that.perfil) : that.perfil != null) return false;
        if (puesto != null ? !puesto.equals(that.puesto) : that.puesto != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idusuario;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (perfil != null ? perfil.hashCode() : 0);
        result = 31 * result + (puesto != null ? puesto.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    public Collection<ReservaEntity> getReservasByIdusuario() {
        return reservasByIdusuario;
    }

    public void setReservasByIdusuario(Collection<ReservaEntity> reservasByIdusuario) {
        this.reservasByIdusuario = reservasByIdusuario;
    }
}
