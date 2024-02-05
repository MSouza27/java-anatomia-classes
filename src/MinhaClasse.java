public class MinhaClasse {
    public static void main(String[] args){

        String primeiroNome = "Magno";
        String segundoNome = "Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    //Metodo
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
