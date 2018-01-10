package principal;
//version2.0
public class Primitive {
	
	public static void main(String[] args) {

		int []numeros=new int[6];
		double c;
		int d;
		c=1+Math.random()*49;
		d=(int)c;
		numeros[0]=d;
		//llenamos el array con los seis números
		for (int i=1;i<=5;i++) {
			
			c=1+Math.random()*49;
			d=(int)c;
			numeros[i]=d;
			
			for(int e=1;e<=5;e++){
				for(int j=0;j<numeros.length-1;j++){
					if(e!=j){
						if(numeros[e]==numeros[j]){
							// eliminamos su valor
						//	numeros[e]=0;
							c=1+Math.random()*49;
							d=(int)c;
							numeros[e]=d;
						}
					}
				}
			}

		
			
			
		}
       //ordenamos los números, llamamos a método

		ordenarArray(numeros);
		for (int i=0;i<=5;i++) {
			System.out.println(numeros[i]);
		}
		//reintegro
		c=Math.random()*10;
		d=(int)c;
		System.out.println("reintegro:"+d);
		
	}
//final de la clase Primitive
//método para ordenamos los números	
	 public static int[] ordenarArray(int[] n) {
	    int aux;

	    for (int i = 0; i < n.length - 1; i++) {
	        for (int x = i + 1; x < n.length; x++) {
	            if (n[x] < n[i]) {
	                aux = n[i];
	                n[i] = n[x];
	                n[x] = aux;
	            }
	        }
	    }

	    return n;
	}
//final del método
}
