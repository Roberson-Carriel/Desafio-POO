public class Fabrica  {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Aplicativo de telefone iniciado");{
            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorreioVoz();
        }
        System.out.println(".............................");

        System.out.println("Navegador WEB iniciado"); {
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
            iphone.exibirPagina(null);
        }
        System.out.println(".............................");

        System.out.println("Aplicaivo de musica iniciado");{
            iphone.selecionarMusica();
            iphone.tocar();
            iphone.pausar();
        }
        System.out.println(".............................");
    }
}