package tema;

public class Student {
	
	private String nume;
	private String prenume;
	private int id;
	private String dataNasterii;
	private String adresa;
	
	public String getNume() {

		return nume;
	}
	public void setNume(String nume) {

		this.nume = nume;
	}
	public String getPrenume()
	{
		return prenume;
	}
	@Override
	public String toString() {
		return "Student [nume=" + nume + ", prenume=" + prenume + ", id=" + id
				+ ", dataNasterii=" + dataNasterii + ",adresa="+adresa +"]";
	}
	public void setPrenume(String prenume) {

		this.prenume = prenume;
	}
	public int getId() {

		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getDataNasterii() {
		return dataNasterii;
	}
	public void setDataNasterii(String dataNasterii) {
		this.dataNasterii = dataNasterii;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	
	
	
}
