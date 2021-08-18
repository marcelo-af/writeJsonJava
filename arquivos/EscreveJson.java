package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJson {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setCpf("55555555555");
		usuario1.setLogin("Teste");
		usuario1.setSenha("123");
		usuario1.setNome("João da Silva");
		
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("88888888888");
		usuario2.setLogin("Teste1");
		usuario2.setSenha("123");
		usuario2.setNome("Maria da Silva");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		//Cria o Json
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//Adiciona a lista no arquivo Json
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		//criar o arquivo json no pc
		FileWriter fileWriter = new FileWriter("C:\\Users\\m.alves.ferreira\\Desktop\\arquivo.json");
		
		//escreve e fecha o arquivo json
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
	}

}
