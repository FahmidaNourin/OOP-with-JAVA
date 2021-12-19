package lab_Ten;

public class Herb extends Plant{
	static private boolean isMedicinal;
	static private String season;

	public Herb(String name,String color,String season,boolean isMedicinal) {
		super(name, color);
		this.isMedicinal=isMedicinal;
		this.season=season;
	}

	public static boolean isMedicinal() {
		return isMedicinal;
	}

	public static void setMedicinal(boolean isMedicinal) {
		Herb.isMedicinal = isMedicinal;
	}

	public  String getSeason() {
		return season;
	}

	public static void setSeason(String season) {
		Herb.season = season;
	}
	@Override
	public String toString() {
		return "Medical:"+isMedicinal+"Season:"+season;
	}
	
	


}
