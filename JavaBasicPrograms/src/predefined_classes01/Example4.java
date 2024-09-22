package predefined_classes01;



public class Example4 {

	public static void main(String[] args) {
		System.out.println("User dir:"+System.getProperty("user.home"));
		System.out.println("Current dir:"+System.getProperty("user.dir"));
		System.out.println("JAVA dir:"+System.getProperty("java.home"));
		System.out.println("JAVA version:"+System.getProperty("java.version"));
		System.out.println("os.name:"+System.getProperty("os.name"));
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		System.clearProperty("user.home");
		System.out.println("User dir:"+System.getProperty("user.home"));
		System.setProperty("user.home", "F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJavaSessions\\Day2");
		System.out.println("User dir:"+System.getProperty("user.home"));
	}

}
