package Unidade02.Aula04.Turma;
import java.util.ArrayList;

public class Turma {
    private ArrayList<Pessoa> alunos;

    public Turma(){
        alunos = new ArrayList<Pessoa>();
    }

    public void adicionar(Pessoa p) throws IllegalArgumentException{
        if(p == null)
            throw new IllegalArgumentException();

        /* 
        // verifica se o cpf ja esta cadastrado
        boolean existe = false;
        for(Pessoa p2: alunos){
            if(p2.getCpf() == p.getCpf()){
                existe = true;
            }
        }

        // se nao esta, adiciona a pessoa
        if(!existe){
            alunos.add(p);
        }*/

        // maneira otimizada...
        if(buscar(p.getCpf()) == null){
            alunos.add(p);
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    public Pessoa buscar(int cpf){
        for(Pessoa p: alunos){
            if(p.getCpf() == cpf){
                return p;
            }
        }
        return null;
    }

    public boolean excluir(int cpf){
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getCpf() == cpf){
                alunos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean atualizar(int cpf, String novoNome){
        for(Pessoa p: alunos){
            if(p.getCpf() == cpf){
                p.setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String s = "";
        for(Pessoa p: alunos){
            s += p.getNome() + "(" + p.getCpf() + ")\n";
        }
        return s;
    }
}
