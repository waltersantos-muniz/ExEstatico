
package exestatico;


public class Start {

   
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setDisciplina("Matemática");
        p.setNome("Rodolfo");
        p.abrirSala();
        p.getDisciplina();
        p.getNome();
        
        Coordernador c = new Coordernador();
        c.setEscola("ETEC de Barcelona");
        c.setNome("Rodolfo de um Universo Distante e Inatingivel");
        c.getEscola();
        c.getNome();
    }
    
}
