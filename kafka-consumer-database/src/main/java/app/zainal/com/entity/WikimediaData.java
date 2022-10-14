package app.zainal.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "wikimedia_recentchange")
public class WikimediaData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Lob
	private String wikiEventData;

	public WikimediaData() {
	}

	public WikimediaData(Long id, String wikiEventData) {
		super();
		this.id = id;
		this.wikiEventData = wikiEventData;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWikiEventData() {
		return wikiEventData;
	}

	public void setWikiEventData(String wikiEventData) {
		this.wikiEventData = wikiEventData;
	}

	@Override
	public String toString() {
		return "WikimediaData [id=" + id + ", wikiEventData=" + wikiEventData + "]";
	}

}
