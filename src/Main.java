import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setCurso("Engenharia de Software");
        curso.setDescricao("Programação");
        curso.setCargaHoraria(8);

        mentoria.setData(LocalDate.now());
        mentoria.setCargaHoarario(10);
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprender Java com SpringBoot");

        System.out.println(curso);
        System.out.println(mentoria);

    }
}