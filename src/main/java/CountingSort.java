public class CountingSort {
   
    /**
    * Implemente a versão clássica do counting sort que vimos em sala de aula. Você pode
    * criar métodos auxiliares se precisar.
    */
    public int[] classicCountingSort(int[] a, int k) {

       int[] c = new int[k];
       //frequência
       for(int i = 0; i < a.length; i++) {
            c[a[i]-1] += 1;
       }
       //cumulativa
       for(int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
       }
       int[] b = new int[a.length];
       //ordenada
       for(int i = a.length-1; i >= 0; i--) {
            b[c[a[i]-1] - 1] = a[i];
            c[a[i]-1] --;
       }

       return b;
    }

    /**
    * Implemente uma versão do counting sort que aceita valor 0 na coleção original.
    */
    public int[] zeroCountingSort(int[] v, int k) {
       int[] c = new int[k + 1];
       //frequência
       for(int i = 0; i < v.length; i++) {
            c[v[i]] += 1;
       }
       //cumulativa
       for(int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
       }
       int[] b = new int[v.length];
       //ordenada
       for(int i = v.length-1; i >= 0; i--) {
            b[c[v[i]] - 1] = v[i];
            c[v[i]] --;
       }

       return b;
    }

    /**
    * Implemente uma versão do counting sort que aceita valores negativos na coleção original. Você
    * vai precisar identificar o menor elemento do array. Faça isso no início do método.
    */
    public int[] negativosCountingSort(int[] v, int k) {
     int menor = v[0];
     int maior = v[0];

	for(int i = 1; i < v.length; i++) {

		if(v[i] < menor) {
			menor = v[i];
               }

		if(v[i] > maior) {
			maior = v[i];
               }
	}

       int[] c = new int[maior - menor + 1];
       //frequência
       for(int i = 0; i < v.length; i++) {
            c[v[i] - menor] += 1;
       }
       //cumulativa
       for(int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
       }
       int[] b = new int[v.length];
       //ordenada
       for(int i = v.length-1; i >= 0; i--) {
            b[c[v[i] - menor] - 1] = v[i];
            c[v[i] - menor] --;
       }

       return b;
    }
    }
}
