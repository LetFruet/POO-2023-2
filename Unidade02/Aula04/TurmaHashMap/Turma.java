package Unidade02.Aula04.TurmaHashMap;
import java.util.HashMap;

public class Turma {

//	private ArrayList<Pessoa> alunos;
	private HashMap<Integer, Pessoa> alunos;

	public Turma() {
//		alunos = new ArrayList<Pessoa>();
		alunos = new HashMap<Integer, Pessoa>();
	}

	public void adicionar(Pessoa p) throws IllegalArgumentException {
		if (p == null)
			throw new IllegalArgumentException();

//		if (buscar(p.getCpf()) == null) {
//			alunos.add(p);
		if (!alunos.containsKey(p.getCpf())) {
			alunos.put(p.getCpf(), p);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Pessoa buscar(int cpf) {
//		for (Pessoa p : alunos) {
//			if (p.getCpf() == cpf) {
//				return p;
//			}
//		}

//		if (alunos.containsKey(cpf)) {
//			return alunos.get(cpf);
//		}
//		return null;

		return alunos.get(cpf);
	}

	public boolean excluir(int cpf) {
//		for (int i = 0; i < alunos.size(); i++) {
//			if (alunos.get(i).getCpf() == cpf) {
//				alunos.remove(i);
//				return true;
//			}
//		}
//		return false;

		Pessoa p = alunos.remove(cpf);
		if (p != null) {
			return true;
		}
		return false;
	}

	public boolean atualizar(int cpf, String novoNome) {
//		for (Pessoa p : alunos) {
//			if (p.getCpf() == cpf) {
//				p.setNome(novoNome);
//				return true;
//			}
//		}
//		return false;
		if (alunos.containsKey(cpf)) {
			alunos.get(cpf).setNome(novoNome);
			return true;
		}
		return false;
	}

	public String toString() {
//		String s = "";
//		for (Pessoa p : alunos) {
//			s += p.getNome() + " (" + p.getCpf() + ")\n";
//		}
//		return s;
		
		String s = "";
		for (Pessoa p : alunos.values()) {
			s += p.getNome() + " (" + p.getCpf() + ")\n";
		}
		
		s += "\nLISTA DE CPFs:\n";
		for (Integer cpf: alunos.keySet()) {
			s += cpf + "\n";
		}
		
		return s;
	}
}
