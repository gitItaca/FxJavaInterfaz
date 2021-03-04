package OpenJFXInterfaz.DiscotecaModels;

public class Album {
	private String artista;
	private String nombre;
	private Formato formato;
	private Integer anno;
	private String metaInfo;
	
	public Album(String artista, String nombre, String anno, Formato formato) {
		this.artista = artista;
		this.nombre = nombre;
		this.formato = formato;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Formato getFormato() {
		return formato;
	}
	
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	public void setMetaInfo(String metainfo) {
		this.metaInfo = metainfo;
	}
	public String getMetaInfo() {
		return this.metaInfo;
	}
	
	public String toString() {
		return "The album is: " + this.nombre + ", " + this.artista + " : " + this.formato + " - " + this.anno;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
}
