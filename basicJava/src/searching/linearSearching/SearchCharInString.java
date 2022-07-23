package searching.linearSearching;

public class SearchCharInString {

	public static void main(String[] args) {
		String name = "Github kumar nana";
		char c = 'm';

		System.out.println(findCharInString(name, c));
	}

	static boolean findCharInString(String name, char target) {

		if (name.length() == 0) {
			return false;
		}

		for (int i = 0; i < name.length(); i++) {
			if (target == name.charAt(i)) {
				return true;
			}
		}

		/*
		 * //we have Alternate solution for this for(char c : name.toCharArray()) {
		 * if(c==target) { return true; } }
		 */
		return false; // char not found

	}

}
