package arraylist;

public class ArrayList {
	
	private Object[] datos_Elemento;
	
	private int i = 0;
	
	public ArrayList(int z){
		
		datos_Elemento = new Object[z];
		
	}
	
	public Object get(int i){
		
		return datos_Elemento[i];
		
	}
	
	public void add(Object o){
		
		datos_Elemento[i] = o;
		
		i++;
		
	}

}
