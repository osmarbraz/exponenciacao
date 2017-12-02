/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 * Baseado nos slides da aula 01/09/2017 
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {
    
    /**
     * Calcula a exponenciacao da base a no expoente n, a^n
     * Slide 56
     * @param a base
     * @param n expoente
     * @return o resultado da exponenciacao
     */
    public static int exponenciacao(int a, int n){
        if (n==0){
            return 1; //Caso base
        } else {
            int an1 = exponenciacao(a,n-1);
            int an = an1 * a;
            return an;            
        }       
    }

     /**
     * Calcula a exponenciacao da base a no expoente n, a^n
     * Slide 59
     * @param a base
     * @param n expoente
     * @return o resultado da exponenciacao
     */    
    public static int exponenciacaoDC(int a, int n){
        if (n==0){
            return 1; //Caso base
        } else {
            //Divisao
            int an1 = exponenciacao(a,n/2);
            //Conquista
            int an = an1 * an1;
            if ((n%2)==1){
                an = an * a;
            }            
            return an;            
        }       
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado = exponenciacao(2,3);
        System.out.println("Exponenciação:"+resultado);
        
        resultado = exponenciacaoDC(2,3);
        System.out.println("Exponenciação DC:"+resultado);
    }
    
}
