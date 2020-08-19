public class main {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	customArray obj = new customArray();
	obj.add("test");
	obj.add("test2");
	obj.add("test3");
	
	System.out.println(obj.get(0));
	System.out.println(obj.get(1));
	System.out.println(obj.get(2));
	
	obj.add("test4");
	
	System.out.println(obj.get(3));
	
	obj.add("test5");
	obj.add("test6");
	obj.add("test7");
	obj.add("test8");
	obj.add("test9");
	
	System.out.println(obj.get(4));
	System.out.println(obj.get(5));
	System.out.println(obj.get(6));
	System.out.println(obj.get(7));
	
	}

}
