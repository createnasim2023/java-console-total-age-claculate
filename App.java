import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("java, World!");



        System.out.println(23+5+2023);
        System.out.println(29+5+2023);
        System.out.println(23+11+1992);
        System.out.println(23+11+1990);



        //ggggggg

        // D =DATE
        Scanner scan = new Scanner(System.in);
        System.out.println( "***** CALCULATE THE HUMAN DATE OF BIRTH AGE NUMBER ***** ");
        System.out.println("Enter the DATE (DD) number  =   " );
        int dd = scan.nextInt();
        System.out.println("Age: " + dd);
        //M= MONTH
        System.out.println("Enter the MONTH  (MM) number  =   " );
        int mm = scan.nextInt();
        System.out.println("Age: " + mm);
        // Y= YEAR
        System.out.println("Enter the YEAR  (YYYY) number  =   " );
        int yyyy = scan.nextInt();
        System.out.println("Age: " + yyyy);

        
        System.out.println("**** AGE TOTAL ADD NUMBER **** " );
        int totalage = dd+mm+yyyy;
        System.out.println("Total Age: " + totalage);



        

        
            
        //System.out.println("Enter the two digit number  " + age);

        ///
/*
 * 

        // Java program to read data of various types using Scanner
// class.
//import java.util.Scanner;
//public class ScannerDemo1 {
	///public static void main(String[] args)
	//{
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);

		// String input
		String name = sc.nextLine();

		// Character input
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();

		// Print the values to check if the input was
		// correctly obtained.
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);

         */
	}
}


   // }
//}
