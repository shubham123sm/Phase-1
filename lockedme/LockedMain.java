package com.lockedme;

public class LockedMain {
	public static void main(String[] args) {
		// Create "main" folder if not present in current folder structure
		FileOperation.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("LockedMe", "Shubham Mehta");
		HandleOperation.handleWelcomeScreenInput();
		}

}
