public class MaximumPrOv {

	public static int maximum( int [ ] array ) {
		int max = array[ 0 ];
		for (int i =1; i < array.length; i++)
			if (max < array[ i ] ) 	
				max = array[ i];
		return max;
	}// maximum

	public static long maximum( long [ ] array ) {
		long max = array[ 0 ];
		for (int i =1; i < array.length; i++)
			if (max < array[ i ] ) 	
				max = array[ i];
		return max;
	}// maximum

	public static char maximum( char [ ] array ) {
		char max = array[ 0 ];
		for (int i =1; i < array.length; i++)
			if (max < array[ i ] ) 	
				max = array[ i];
		return max;
	}//maximum

	public static double maximum( double [ ] array ) {
		double max = array[ 0 ];
		for (int i =1; i < array.length; i++)
			if (max < array[ i ] ) 	
				max = array[ i];
		return max;
	}//maximum

	/*public static String maximum( String [ ] array ) {
		String max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max < array[ i ]  ) 		//ERROR 
				max = array[ i];
		return max;
	}//maximum */

	public static void main(String[ ] args) {

		int[  ] intList = { 23, 34, -5, 345, 123, 15, 16};
		System.out.println(" The largest element in the List is: " +maximum( intList ));

		long[ ] longList ={ 101, 33, 202, 44, 342};
		System.out.println(" The largest element in the List is: " +maximum( longList ));

		char[ ] charList ={ 'a', 'i', 's','t','e'};
		System.out.println(" The largest element in the List is: " +maximum( charList ));

		double[ ] doubleList = { 1.12, 2.3, 45.6, -3, 4.5};
		System.out.println(" The largest element in the List is: " +maximum( doubleList ));
		
		String[ ] stringList = { "apple", "fun", "crazy", "God Knows Best"};
		//System.out.println(" The largest element in the List is: " +maximum( stringList ));

		

		
	}//main( )
}//Maximum class

	