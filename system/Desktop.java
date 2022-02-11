package org.system;

public class Desktop {
	public void desktopsize() {
		System.out.println("My desktop size is 14 inches");
	}
		public static void main(String[] args) {
	   Computer comp = new Computer();
	   Desktop desk = new Desktop();
	   comp.ComputerModel();
	   desk.desktopsize();
		}

}
