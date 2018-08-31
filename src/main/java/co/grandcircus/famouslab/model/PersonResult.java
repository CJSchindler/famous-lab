package co.grandcircus.famouslab.model;

import java.util.List;

public class PersonResult {

	private List<Person> complete;
	private List<TinyPerson> tiny;
	
	public List<Person> getComplete() {
		return complete;
	}
	public void setComplete(List<Person> complete) {
		this.complete = complete;
	}
	public List<TinyPerson> getTiny() {
		return tiny;
	}
	public void setTiny(List<TinyPerson> tiny) {
		this.tiny = tiny;
	}
	
	

	
	
}
