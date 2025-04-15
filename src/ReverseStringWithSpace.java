
public class ReverseStringWithSpace {

	public static void main(String[] args) {
		
		reverseString("A am not String");
	}
		public static void reverseString(String inputString)
		{
		char[]inputArray = inputString.toCharArray();
		char[]resultArray= new char[inputString.length()];
		 
		//inserting the space in result array
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]==' ') {
				resultArray[i]=' ';
			}
		}
			
			int j=resultArray.length-1;
			for(int i=0;i<inputArray.length;i++) {
				if(inputArray[j]!=' ') {
					j--;
				}
				resultArray[j]=inputArray[i];
				j--;
			}
			System.out.println(inputString+"-->"+String.valueOf(resultArray));
		}

		
	}


