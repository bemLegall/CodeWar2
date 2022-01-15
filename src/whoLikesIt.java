
/*You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.*/
public class whoLikesIt {

	public String whoLikesIt(String... names) {
		
		
		
		String [] nomes = names;
		
		if(nomes.length == 0) {
			return "no one likes this";
		}
		
		if(nomes.length == 1) {
			  return nomes[0] +" likes this";
		}
		if(nomes.length == 2) {
			return nomes[0] + " and "+ nomes[1] + " likes this";
		}
		if(nomes.length == 3) {
			return nomes[0] + ", "+  nomes[1]+" and "+ nomes[2] + " likes this";
		}
		
		int total = nomes.length - 2;
		return nomes [0] + ", " + nomes[1]+ " and " + total + " others like this";
		
	}

}
