import br.com.dio.desafio.dominio.*;

import java.lang.management.MemoryNotificationInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Desenvolvimento de software");
        curso.setDescricao("Programação");
        curso.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprender Java com SpringBoot");

        Mentoria mentodria1 = new Mentoria();
        mentodria1.setData(LocalDate.now());
        mentodria1.setTitulo("Python");
        mentodria1.setDescricao("Aprender Python com Django");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devloper");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp1 =new Bootcamp();
        bootcamp1.setNome("Bootcamp Pythoon Devloper");
        bootcamp1.setDescricao("Descrição do Bootcamp");
        bootcamp1.getConteudos().add(curso);
        bootcamp1.getConteudos().add(mentodria1);

        Dev devloper = new Dev();
        Dev devloper2 = new Dev();

        devloper.setNome("Gabriel");
        devloper.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gabriel: " + devloper.getConteudosInscritos());
        devloper.progredir();
        devloper.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gabriel: " + devloper.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Gabriel: " + devloper.getConteudosConcluidos());
        System.out.println("XP " + devloper.calcularTotalXp());
        System.out.println("----------------");

        devloper.setNome("Vieira");
        devloper2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Vieira " + devloper2.getConteudosInscritos());
        devloper2.progredir();
        devloper2.progredir();
        devloper2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Vieira " + devloper2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Vieira " + devloper2.getConteudosConcluidos());
        System.out.println("XP " + devloper2.calcularTotalXp());








    }
}