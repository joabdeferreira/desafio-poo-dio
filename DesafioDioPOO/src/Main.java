import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
	
	public static void main(String[]args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso de Java para iniciantes e reiniciantes");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso .NET C#");
		curso2.setDescricao("Curso de DótNet C# para iniciantes e reiniciantes");
		curso2.setCargaHoraria(7);
		
		//Conteudo conteudo1 = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Dicas de Java pra quem está sendento por café");
		mentoria1.setData(LocalDate.now());
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp para amantes de Java e Café (ou ambos)");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev zeDaSilva = new Dev();
		zeDaSilva.setNome("Zé da Silva");
		zeDaSilva.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + zeDaSilva.getConteudosInscritos());
		zeDaSilva.progredir();
		zeDaSilva.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + zeDaSilva.getConteudosInscritos());
		System.out.println("Conteúdos Inscritos: " + zeDaSilva.getConteudosConcluidos());
		System.out.println("XP: "+zeDaSilva.calcularTotalXp());
		
		System.out.println("-------");
		
		Dev mariaDeSouza = new Dev();
		mariaDeSouza.setNome("maria de Souza");
		mariaDeSouza.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + mariaDeSouza.getConteudosInscritos());
		mariaDeSouza.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + mariaDeSouza.getConteudosInscritos());
		System.out.println("Conteúdos Inscritos: " + mariaDeSouza.getConteudosConcluidos());
		System.out.println("XP: "+mariaDeSouza.calcularTotalXp());
		
	}

}
