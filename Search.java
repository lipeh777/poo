import java.util.ArrayList;

public class Search{

	private String chave;

	public String Search(String chave){
		this.setChave(chave);
	}

	public void setChave(String chave){
		this.chave = chave;
	}

	public String getChave(){
		return this.chave;
	}

	public static String buscar(String chave, ArrayList<String> bd) throws NaoEcontradoException{
		for (String key : bd) {
			if (chave != key)  {
				throw new NaoEcontradoException();
			}

			if (chave == key) {
				return key;
			}
		}
	}

	public static void main(String[] args) {
		Search k = new Search("bola");

		ArrayList<String> bd = new ArrayList<>();

		bd.add("saco");
		bd.add("bola");
		bd.add("moeda");

		try{
			buscar(k.chave, bd);
		} catch (NaoEcontradoException ex){
			System.out.println("Palavra chave nao encontrada");
		}

	}

}