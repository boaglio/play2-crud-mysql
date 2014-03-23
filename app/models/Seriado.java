package models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@Entity
public class Seriado extends Model implements BasicModel<Long> {

	private static final long serialVersionUID = 2500768374252151706L;

	@Id
	private Long id;

	@Basic
	@Required
	private String nome;

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

	public Long getKey() {
		return id;
	}

	public void setKey(Long key) {
		setId(key);
	}

}
