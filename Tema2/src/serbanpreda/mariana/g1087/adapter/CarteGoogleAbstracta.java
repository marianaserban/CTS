package serbanpreda.mariana.g1087.adapter;

import java.util.ArrayList;

public abstract class CarteGoogleAbstracta {
	
	String title;
	ArrayList<Integer>noteArrayList=new ArrayList<>();

	public CarteGoogleAbstracta(String title,ArrayList<Integer>note) {
		super();
		this.title=title;
		this.noteArrayList=note;
	}
	public String getTitle() {
		return title;
	}

	public ArrayList<Integer> getNoteArrayList() {
		return noteArrayList;
	}

	public abstract void esteDeschisa(String link);
	public abstract double getMediaNotelor();
	public abstract void acordaNota(int nota);
}
