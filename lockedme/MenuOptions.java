package com.lockedme;

public class MenuOptions {
	public static void printWelcomeScreen(String appName, String
			developerName) {
			System.out.println();
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("* LOCKEDME.COM *");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("\n");
			String companyDetails =
			String.format("*****************************************************\n"+ "** Welcome to %s.com. \n" + "** This application is developed by %s.\n" + "*****************************************************\n", appName, developerName);
			String appFunction = "You can use this application to :-\n"
			+ "• Retrieve all file names in the \"main\" folder\n"
			+ "• Search, add, or delete files in \"main\" folder.\n"
			+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
			System.out.println(companyDetails);
			System.out.println(appFunction);
			}
			public static void displayMenu() {
			System.out.println("=====================================");
			System.out.println("| MAIN MENU |");
			System.out.println("--------------------------------------");
			String menu = "\n****** Select any option number from below and press Enter ******\n"
			+ "|1) Retrieve all files inside \"main\" folder|\n" + "|2) Display menu for File operations|\n"
			+ "|3) Exit program|\n";
			System.out.println(menu);
			System.out.println("=====================================");
			System.out.print("Enter your choice : ");
			}
			public static void displayFileMenuOptions() {
			System.out.println("=====================================");
			System.out.println("| SUB MENU |");
			System.out.println("--------------------------------------");
			String fileMenu = "\n****** Select any option number from below and press Enter ******\n"
			+ "|1) Add a file to \"main\" folder|\n" + "|2) Delete a file from \"main\" folder|\n"
			+ "|3) Search for a file from \"main\" folder|\n" + "|4) Show Previous Menu|\n" + "|5) Exit program|\n";
			System.out.println(fileMenu);
			System.out.println("=====================================");
			System.out.print("Enter your choice : ");
			} 


}
