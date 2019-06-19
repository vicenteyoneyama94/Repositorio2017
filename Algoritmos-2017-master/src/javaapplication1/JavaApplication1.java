package javaapplication1;

public class JavaApplication1 {
    
    public static int conectarBD(){
        
        System.out.println("Conectado com sucesso");
        
        return 57843;
    }

    public static void inserir(String nome, int id){
        
        System.out.println("Dados inseridos");
        
    }
    
    public static void atualizar(int id, String nome){
        
        System.out.println("Dados atualizados");
        
    }

    public static String[] selecionar(String tabela){
        
        String[] lista = new String[10];
        
        lista[0] = "Amauri";
        
        return lista;
        
    }
    
    public static void main(String[] args) {
        System.out.println("Rodando");
        double r = Math.sqrt(148);
        System.out.println("Resultado: "+r);
    }
    
}
