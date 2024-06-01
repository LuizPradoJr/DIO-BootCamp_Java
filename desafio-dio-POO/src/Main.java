import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 80);

        Curso curso2 = new Curso("Curso Js", "Descrição Curso Js", 70);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição Mentoria Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNomeString("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudosInscritos() );
        System.out.println("XP Camila: " + devCamila.calcularTotalXP());
        devCamila.progredir();
        System.out.println("Conteúdos concluídos Camila " + devCamila.getConteudosConcluidos() );
        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudosInscritos() );
        System.out.println("XP Camila:" + devCamila.calcularTotalXP());

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Luiz " + devLuiz.getConteudosInscritos() );
        System.out.println("XP Luiz: " + devLuiz.calcularTotalXP());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("Conteúdos concluídos Luiz " + devCamila.getConteudosConcluidos() );
        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudosInscritos() );
        System.out.println("XP Luiz: " + devLuiz.calcularTotalXP());

    }
}
