public class MaximumRefOv2 {

	public static Integer maximum( Integer [ ] array ) {
		Integer max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max.compareTo( array[ i ]) < 0 ) 		
				max = array[ i];
		return max;
	}//maximum 


	public static Long maximum( Long [ ] array ) {
		Long max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max.compareTo( array[ i ]) < 0 ) 		
				max = array[ i];
		return max;
	}//maximum 


	public static Character maximum( Character [ ] array ) {
		Character max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max.compareTo( array[ i ]) < 0 ) 		
				max = array[ i];
		return max;
	}//maximum 


	public static Double maximum( Double [ ] array ) {
		Double max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max.compareTo( array[ i ]) < 0 ) 		
				max = array[ i];
		return max;
	}//maximum 


	public static String maximum( String [ ] array ) {
		String max = array[ 0 ];
		for (int i =1; i < array.length; i++)	
			if (max.compareTo( array[ i ]) < 0 ) 		
				max = array[ i];
		return max;
	}//maximum 

	public static void main(String[ ] args) {

		Integer[  ] intList = { 23, 34, -5, 345, 123, 15, 16};
		System.out.println(" The largest element in the List is: " +maximum( intList ));

		Long[ ] longList ={ 101L, 33L, 202L, 44L, 342L};
		System.out.println(" The largest element in the List is: " +maximum( longList ));

		Character[ ] charList ={ 'a', 'i', 's','t','e'};
		System.out.println(" The largest element in the List is: " +maximum( charList ));

		Double[ ] doubleList = { 1.12D, 2.3D, 45.6D, -3D, 4.5D};
		System.out.println(" The largest element in the List is: " +maximum( doubleList ));
		
		String[ ] stringList = { "apple", "fun", "crazy", "God Knows Best"};
		System.out.println(" The largest element in the List is: " +maximum( stringList ));

		

		
	}//main( )
}//Maximum class

	