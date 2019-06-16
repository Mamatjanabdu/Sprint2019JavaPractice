package day47;



	class Horse extends Mammals{

		@Override
		public void makeNoise() {
			System.out.println(" neigh neigh neigh");
		}

		@Override
		public void eat(String foodName) {
			System.out.println("eating "+ foodName);
		}
		//public abstract void eat(String foodName); 
		@Override
		public void eat(String foodName, int amount) {
			System.out.println("another eat method");
		}


	}