package javaconcept;

class ConstructorTry {

	public void finalize() {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ConstructorTry c = new ConstructorTry();
		c=null;
		ConstructorTry c1 = new ConstructorTry();
		c1=null;
		ConstructorTry c2 = new ConstructorTry();
		c2= null;
		ConstructorTry c3 = new ConstructorTry();

		System.gc();
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
	}

}
