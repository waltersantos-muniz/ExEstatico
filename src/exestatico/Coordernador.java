
package exestatico;


public class Coordernador implements IControleSala{
    private String escola;
    private String nome;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void abrirSala(){
        System.out.println("Sala aberta novamente");
    }
}
