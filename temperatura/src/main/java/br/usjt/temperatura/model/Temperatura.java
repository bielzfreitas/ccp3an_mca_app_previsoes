package br.usjt.temperatura.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.usjt.temperatura.model.DiaSemana;
import br.usjt.temperatura.model.Temperatura;
import br.usjt.temperatura.model.Cidade;

@Entity
@Table (name = "tb_Temperatura")
public class Temperatura implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String dataHora;
	private String tempMax;
	private String tempMin;
	private String umidade;
	private String texto;
	
	@OneToOne(optional = false)
	@JoinColumn(name="id_dia")
	private DiaSemana diaSemana;
	
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_cidade")
	private Cidade cidade;
	
	public Cidade getnomeCidade() {
		return cidade;
	}
	
	public void setnomeCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	public String getTempMax() {
		return tempMax;
	}
	
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}
	
	public String getTempMin() {
		return tempMin;
	}
	
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	
	public String getUmidade() {
		return umidade;
	}
	
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((diaSemana == null) ? 0 : diaSemana.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tempMax == null) ? 0 : tempMax.hashCode());
		result = prime * result + ((tempMin == null) ? 0 : tempMin.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((umidade == null) ? 0 : umidade.hashCode());
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
		Temperatura other = (Temperatura) obj;
		
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} 
		else if (!cidade.equals(other.cidade))
			return false;
		
		if (dataHora == null) {
			if (other.dataHora != null)
				return false;
		} 
		else if (!dataHora.equals(other.dataHora))
			return false;
		
		if (diaSemana == null) {
			if (other.diaSemana != null)
				return false;
		} 
		else if (!diaSemana.equals(other.diaSemana))
			return false;
		
		if (id == null) {
			if (other.id != null)
				return false;
		} 
		else if (!id.equals(other.id))
			return false;
		
		if (tempMax == null) {
			if (other.tempMax != null)
				return false;
		} 
		else if (!tempMax.equals(other.tempMax))
			return false;
		
		if (tempMin == null) {
			if (other.tempMin != null)
				return false;
		} 
		else if (!tempMin.equals(other.tempMin))
			return false;
		
		if (texto == null) {
			if (other.texto != null)
				return false;
		} 
		else if (!texto.equals(other.texto))
			return false;
		
		if (umidade == null) {
			if (other.umidade != null)
				return false;
		} 
		else if (!umidade.equals(other.umidade))
			return false;
		
		return true;
	}
	
	
	
}
