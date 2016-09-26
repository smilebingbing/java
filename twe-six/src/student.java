
public class student {
     String id;
     int de;
     int cai;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDe() {
		return de;
	}
	public void setDe(int de) {
		this.de = de;
	}
	public int getCai() {
		return cai;
	}
	public void setCai(int cai) {
		this.cai = cai;
	}
     public int getSum(){
    	 return this.getDe()+this.getCai();
     }
}
