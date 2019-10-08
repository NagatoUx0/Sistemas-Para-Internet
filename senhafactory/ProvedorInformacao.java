package senhafactory;import java.io.File;import java.io.FileNotFoundException;import java.util.Scanner;/** * @author 		Ermerson Rafael - 816122707 * @category	Aplica��es e Servi�os * @since		21/02/2018 * @version		v1.0.0.4 */public abstract class ProvedorInformacao {	protected abstract String recuperarInformacao();	public void exibirInformacao() {		System.out.println(recuperarInformacao());	}	protected Scanner criarScanner(File arquivo) {		try {			return new Scanner(arquivo);		} catch (FileNotFoundException e) {			System.out.println("Arquivo n�o encontrado: " + arquivo.getPath());			System.exit(1);		}		return null;	}}