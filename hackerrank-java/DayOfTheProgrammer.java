public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        if( year == 1918 ) return "26.09.1918";
        if( isLeap( year ) ) return "12.09." + Integer.toString( year );
        else return "13.09." + Integer.toString( year );

    }
    
    static boolean isLeap( int year ) {

        if( year % 4 != 0 ) return false;
        if( year > 1918 && year % 100 == 0 && year % 400 != 0 ) return false;
        return true;

}
}