package npivalidate;

public class npiData {
	
	private String npi;
	private String prov_fname;
	private String prov_mname;
	private String prov_lname;
	private String entity_typ_cd;
	private String prov_org_nm;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String zip;
	
	public npiData(String npi, String prov_fname, String prov_mname, String prov_lname, String entity_typ_cd,
			String prov_org_nm, String address_line1, String address_line2, String city, String state, String zip){
		this.npi = npi;
		this.prov_fname = prov_fname;
		this.prov_mname = prov_mname;
		this.prov_lname = prov_lname;
		this.entity_typ_cd = entity_typ_cd;
		this.prov_org_nm = prov_org_nm;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.zip = zip;		
	}
	
	npiData(String npi) {
		
	}
	
	public String getNpi() {
		return npi;
	}
	public void setNpi(String npi) {
		this.npi = npi;
	}
	public String getProv_fname() {
		return prov_fname;
	}
	public void setProv_fname(String prov_fname) {
		this.prov_fname = prov_fname;
	}
	public String getProv_mname() {
		return prov_mname;
	}
	public void setProv_mname(String prov_mname) {
		this.prov_mname = prov_mname;
	}
	public String getProv_lname() {
		return prov_lname;
	}
	public void setProv_lname(String prov_lname) {
		this.prov_lname = prov_lname;
	}
	public String getEntity_typ_cd() {
		return entity_typ_cd;
	}
	public void setEntity_typ_cd(String entity_typ_cd) {
		this.entity_typ_cd = entity_typ_cd;
	}
	public String getProv_org_nm() {
		return prov_org_nm;
	}
	public void setProv_org_nm(String prov_org_nm) {
		this.prov_org_nm = prov_org_nm;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "npiData [npi=" + npi + ", prov_fname=" + prov_fname + ", prov_mname=" + prov_mname + ", prov_lname="
				+ prov_lname + ", entity_typ_cd=" + entity_typ_cd + ", prov_org_nm=" + prov_org_nm + ", address_line1="
				+ address_line1 + ", address_line2=" + address_line2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
	
}
