import java.util.Scanner;

class Main {  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros: \n Escolha de preferencia entre 2 ou 3 para facilitar a visualização");
        int tamanhomatriz = leitor.nextInt();
        int valor = 1;
        int matriz[][] = new int[tamanhomatriz][tamanhomatriz];
        int updateMatriz[][] = new int[tamanhomatriz][tamanhomatriz];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor;
                valor ++;
            }
        }
        mostraMatrizOriginal(matriz);
        System.out.println("Informe quantos graus deseja rotacionar sua Matriz:\n 90° \n 180° \n 270° \n 360°");
        int graus = leitor.nextInt();
        if(graus % 90 != 0 || graus > 360){
            System.out.println("Este não é um valor válido, Tente novamente!!!");  
        }else{
            updateMatriz = matriz;     
            int qtdmovimentos = graus / 90;
            for (int i = 0; i < qtdmovimentos; i++) {
                updateMatriz = rotaMatriz(updateMatriz);
            }
            mostraMatrizFinal(updateMatriz); 
        }
    } 
    







    public static void mostraMatrizOriginal(int matriz[][]) {
        System.out.println("Sua Matriz é:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.print("\n");
        }
    }

    public static int[][] rotaMatriz(int matriz[][]) {
        // Rotacionar
        int novamatriz[][] = new int[matriz.length][matriz.length];
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                novamatriz[linha][(matriz.length - 1) - coluna] = matriz[coluna][linha];
            }
        }
        return novamatriz;
    }

    public static void mostraMatrizFinal(int updateMatriz[][]) {
        System.out.println("O Resultado Final da sua Matriz é: ");
        for (int i = 0; i < updateMatriz.length; i++) {
            for (int j = 0; j < updateMatriz.length; j++) {
                System.out.print("[" + updateMatriz[i][j] + "]");
            }
            System.out.print("\n");
        }
    }

}