package inClassSep3;

public class Driver {

	public static void main(String[] args) {
		//-------ArrayList of String Objects----------------
		ArrayList<String> list = new ArrayList<String>(1);
		//--------------------------------------------------
		int index;
		String str;
		
		list.add("String One");
		list.add("String Two");
		list.add("String Three");
		list.add("String Four");
		list.add("String Five");
		list.add("String Six");
		
		//System.out.printf("%s\n", list.get(10));
		
		for(index=0;index<list.size();index++) {
			str=list.get(index);
			System.out.printf("[%d]: %s\n", index,str);
		}
	}

}
