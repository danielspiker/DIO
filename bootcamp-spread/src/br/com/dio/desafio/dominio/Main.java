package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descrição do curos js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição da  mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Tudo que precisas saber sobre Java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria);
		
		Dev devDaniel = new Dev();
		devDaniel.setNome("Daniel");
		devDaniel.inscreverBootcamp(bootcamp1);
		System.out.println(devDaniel.getNome() + " - Inscrito em: " + devDaniel.getConteudosInscritos());
		devDaniel.progredir();
		System.out.println(devDaniel.getNome() + " - Concluiu: " + devDaniel.getConteudosConcluidos());
		System.out.println(devDaniel.getNome() + " - Inscrito em: " + devDaniel.getConteudosInscritos());
		System.out.println("Total XP: " + devDaniel.calcularTotalXp());
		
		
		System.out.println("-------------");
		
		Dev devDoug = new Dev();
		devDoug.setNome("Doug");
		devDoug.inscreverBootcamp(bootcamp1);
		System.out.println(devDoug.getNome() + " - Inscrito em: " + devDoug.getConteudosInscritos());
		devDoug.progredir();
		devDoug.progredir();
		System.out.println(devDoug.getNome() + " - Concluiu: " + devDoug.getConteudosConcluidos());
		System.out.println(devDoug.getNome() + " - Inscrito em: " + devDoug.getConteudosInscritos());
		System.out.println("Total XP: " + devDoug.calcularTotalXp());
	}
	
}
