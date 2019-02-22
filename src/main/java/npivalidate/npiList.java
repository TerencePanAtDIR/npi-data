package npivalidate;

import java.util.ArrayList;
import java.util.List;

public class npiList {
	private List<npiData> results = new ArrayList <>();
	
	
	public npiList (List<npiData> results) {
		this.results = results;
	}
	

	public npiList(npiData npiData) {
		this.results.add(npiData);
	}


	public List<npiData> getResults() {
		return results;
	}


	public void setResults(List<npiData> results) {
		this.results = results;
	}


	@Override
	public String toString() {
		return "npiList [results=" + results + "]";
	}


}
