package com.pcwk.time.ex08.generics.extendss;

public class GenericPrintMain {

	public static void main(String[] args) {

		GenericPrint<Powder> powderPrinter = new GenericPrint<Powder>();
		powderPrinter.setMaterial(new Powder());

		Powder powder = powderPrinter.getMaterial();
		System.out.println("powder:" + powder);

		System.out.println(powderPrinter.toString());

		GenericPrint<Plastic> plasticPrinter = new GenericPrint<>();
		plasticPrinter.setMaterial(new Plastic());

		System.out.println("PlasticPrinter:" + plasticPrinter);

		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println("plastic : " + plastic); // plastic.toString()
	}

}
