
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	
    public void todasAsFuncionalidades() {
    	System.out.println("Testando funcionalidades");
        tocar();
        pausar();
        selecionarMusica("Creepin");
        exibirPagina();
        adicionarNovaAba("https://google.com");
        atualizarPagina();
        ligar("Caio");
        atender();
        iniciarCorreioVoz();
    }
		
    @Override
    public void tocar() {
        System.out.println("Tocando a musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet...");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina da internet...");
    }

    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para o(a): " + contato);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    public static void main(String[] args) {
    	Iphone iphone12 = new Iphone();
    	iphone12.todasAsFuncionalidades();
	}
	
}
