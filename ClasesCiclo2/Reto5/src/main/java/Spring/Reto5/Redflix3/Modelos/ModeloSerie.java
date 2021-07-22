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
 * @author Valeria
 */
@Entity
@Table(name = "serie")
public class ModeloSerie {
    @Id //indica que es la llave primaria
    @Column(name = "id_serie")
    Long idSerie;
    
    @Column(name = "titulo_serie")
    String tituloSerie;
    
    @Column(name = "episodios_serie")
    Long numEpisodios;
    
    @Column(name = "temporadas_serie")
    Long numTemporadas;

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public Long getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(Long numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public Long getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(Long numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "ModeloSerie{" + "idSerie=" + idSerie + ", tituloSerie=" + tituloSerie + ", numEpisodios=" + numEpisodios + ", numTemporadas=" + numTemporadas + '}';
    }

    

}