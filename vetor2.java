public class vetor2 {
    public static void main(String[] args) {
        int[] vetor = {5,7,8,10,12};
        int maior = 0;
        int menor = 0;
        for(int i : vetor) {
            if (i>maior){
                maior = i;
            }
            if(i<menor){
                menor = i;
            }
        }
        System.out.println(maior + "e"+ menor);
    }
    
}
