/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring.Reto5.Redflix3.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DIEGO
 */
@Entity
@Table(name = "Pelicula")
public class Pelicula {
    
    @Id
    @Column(name="id_pelicula")
    private Long idPelicula;
    
    @Column(name="titulo_pelicula")
    private String tituloPelicula;
    
    @Column(name="resumen_pelicula")
    private String resumenPelicula;
    
    @Column(name="anno_pelicula")
    private String añoPelicula;
    
    @Column(name="nombre_director")
    private String nombreDirector;

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getResumenPelicula() {
        return resumenPelicula;
    }

    public void setResumenPelicula(String resumenPelicula) {
        this.resumenPelicula = resumenPelicula;
    }

    public String getAñoPelicula() {
        return añoPelicula;
    }

    public void setAñoPelicula(String añoPelicula) {
        this.añoPelicula = añoPelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", tituloPelicula=" + tituloPelicula + ", resumenPelicula=" + resumenPelicula + ", a\u00f1oPelicula=" + añoPelicula + ", nombreDirector=" + nombreDirector + '}';
    }
    
}
