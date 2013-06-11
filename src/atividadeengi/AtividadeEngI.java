
package atividadeengi;

public class AtividadeEngI {
    
    public static void main(String[] args) {
        System.out.println("1 - Criar novo filme");
        System.out.println("2 - Locar filme");
        int option = Keyboard.readInt();
        
        switch(option){
            case 1:
                System.out.println("Digite o nome do filme");
                String filme = Keyboard.readString();
                System.out.println("Digite o codigo de preco do filme");
                int priceCode = Keyboard.readInt();
            break;
                
            case 2:
                System.out.println();
            break;
        }
        
        
    }
}
