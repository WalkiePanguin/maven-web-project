package testing;

public class JunitTesting {


		public int wordtests(String word) {
			int count = 0;
			for(int i=0; i < word.length();i++)
				if(word.charAt(i)== 'a' || word.charAt(i) =='A') {
					count ++;
				}
				return count;
		}
		public int square(int x)
		{
			return x*x;
		}

}

