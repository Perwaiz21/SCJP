
public class TestSingleton {

	private static final TestSingleton instance = new TestSingleton();
	
	private TestSingleton(){
		
	}
	
	public TestSingleton getObject(){
		return instance;
	}

}

