package Persistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
	
	public static boolean gravar (Object a, String arquivo) {
		try {
			//Gera o arquivo para armazenar os objetos
			FileOutputStream arquivoGrav = new FileOutputStream(arquivo);
			//Classe respons�vel por inserir os dados
			ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
			//Grava o objeto cliente no arquivo
			objGravar.writeObject(a);
			objGravar.flush();
			objGravar.close();
			arquivoGrav.flush();
			arquivoGrav.close();
			return true;
		}
		catch (Exception e){
			return false;
		}
		
	}
	
	public static Object recuperar (String arquivo) {
		Object obj = null;
		FileInputStream arquivoLeitura = null;
		ObjectInputStream objLeitura= null;
		try {
			//carregar o arquivo
			arquivoLeitura = new FileInputStream(arquivo);
			//classe responsavel por recuperar os objetos do arquivo
			objLeitura = new ObjectInputStream(arquivoLeitura);
			//Le o objeto
			obj = objLeitura.readObject();
			objLeitura.close();
			arquivoLeitura.close();
			//n�o tem m�todo flush
		}
		catch (Exception e) {
			return null;
		}
		return obj;
	}

}
