public class ZooTest {

	public void zooConstructorTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		int expCapacity = 20;
		Animal[] expAnimals = new Animal[20];

		Assert.assertEquals(expCapacity, zoo.getCapacity());
		Assert.assertEquals(expAnimals, zoo.getAnimals());

	}

	public void addAnimalTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		Animal monkey = new Animal();
		int expectedNumAnimals = 1;
		zoo.addAnimal(monkey);
		
		Assert.assertEquals(expectedNumAnimals, zoo.getAnimals().length);
		Assert.assertEquals(monkey, zoo.getAnimals()[0]);
		Assert.assertEquals(20, zoo.getCapacity());

	}

	public void gettersTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		Animal monkey = new Animal("Brown", "George", 20, 3);
		zoo.addAnimal(monkey);
		Animal snake = new Animal("Green", "Sly", 10, 2);
		zoo.addAnimal(snake);
		
		int expectedCapacity = 20;
		double expectedTotalHeight = 5;
		double expectedAverageWeight = 15;
		double expectedAverageWeightGreen = 10;
		Animal[] expectedAnimals = {monkey, snake};
		
		
		Assert.assertEquals(expectedCapacity, zoo.getCapacity());
		Assert.assertEquals(expectedTotalHeight, zoo.getTotalHeight(), .01);
		Assert.assertEquals(expectedAverageWeight, zoo.getAverageWeight(), 0.01);
		Assert.assertEquals(expectedAverageWeightGreen, zoo.getAverageWeight("Green"), 0.01);
		Assert.assertEquals(expectedAnimals, zoo.getAnimals());


	}

	public void toStringTest() {
		String expected = "These animals live in the zoo: \n";

	}

}