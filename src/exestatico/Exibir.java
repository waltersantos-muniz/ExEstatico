
package exestatico;

public class Exibir {
    
    public static void Professor(Professor p){
        System.out.println(p.getNome()+p.getDisciplina());
    }
    public static String Coordernador(Coordernador c){
        return c.getNome()+c.getEscola();
    }
}
