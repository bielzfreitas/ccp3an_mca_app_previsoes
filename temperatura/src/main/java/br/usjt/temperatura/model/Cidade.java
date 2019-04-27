package br.usjt.temperatura.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_cidade")
@NamedQuery (name = "Cidade.buscarPeloNomeELatitudeELongitude",
query = "SELECT a FROM Cidade a WHERE nome = :nome AND latitude = :latitude AND longitude = :longitude")
public class Cidade implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String Latitude;
	private String Longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	
	@OneToMany(mappedBy="cidade")
	private Temperatura temperatura;
	
	public Temperatura getTemperatura() {
		return temperatura;
	}
	public void setPrevisao(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Latitude == null) ? 0 : Latitude.hashCode());
		result = prime * result + ((Longitude == null) ? 0 : Longitude.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (Latitude == null) {
			if (other.Latitude != null)
				return false;
		} else if (!Latitude.equals(other.Latitude))
			return false;
		if (Longitude == null) {
			if (other.Longitude != null)
				return false;
		} else if (!Longitude.equals(other.Longitude))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
}
