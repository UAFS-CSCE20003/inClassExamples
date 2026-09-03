package inClassSep3;

public class Driver2 {

	public static void main(String[] args) {
		//-----------ArrayList of Profile Objects-----------
		ArrayList<Profile> list = new ArrayList<Profile>(1);
		//--------------------------------------------------
		int index;
		Profile profile;
		
		list.add(new Profile("Joe","Smith"));
		list.add(new Profile("Mary","Jones"));
		list.add(new Profile("Jim","Garner"));
		
		//System.out.printf("%s\n", list.get(10));
		
		for(index=0;index<list.size();index++) {
			profile=list.get(index);
			System.out.printf("[%d]: %s, %s\n", index,profile.lname,profile.fname);
		}
	}

}
