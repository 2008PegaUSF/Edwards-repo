
public class customArray {

	//Initialize the private object array
	private Object[] obj = new Object[3];
	
	
	//Getter to return object at index specified
	public Object get(int index) {
		
		//System.out.println(index);
		return this.obj[index];
		
	}
	
	//add object to array and check to see if array needs to be longer
	public void add(Object newObj) {
		
		for(int i=0; i<obj.length + 1; ++i ) {
			
			//System.out.println(i);
			
			if(i < obj.length && obj[i] == null ) {
				obj[i] = newObj;
				//System.out.println(i);
				break;
			}
			
			else if(i == obj.length ) {
				
				//System.out.println(i);
				
					Object[] newObjArray = new Object[i*2];
					
					for(int x=0; x<obj.length - 1; ++x) {
						 newObjArray[x] = obj[x];
					}
					
					newObjArray[i] = newObj;
					
					obj = newObjArray;
					
				}
		}
		
	}
	
}
