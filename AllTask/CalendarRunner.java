class CalendarRunner{
	public static void main(String[] args){
		System.out.println("------------persons details-----------");
		String personName1="shashank";
		String personName2="srivatsa";
		String personName3="abhi";
		System.out.println("personName1 is "+personName1+ "  month is " +Calendar.getBirthMonth(personName1)+ "day is " +Calendar.getBirthDay(personName1)); 
		//System.out.println("day is " +Calendar.getBirthDay(personName1));
		System.out.println("personName2 is "+personName2+ "  month is " +Calendar.getBirthMonth(personName2));
		System.out.println("day is " +Calendar.getBirthDay(personName2));
		System.out.println("personName3 is "+personName3+ "  month is " +Calendar.getBirthMonth(personName3)); 
		System.out.println("day is " +Calendar.getBirthDay(personName3));
	}
	
}