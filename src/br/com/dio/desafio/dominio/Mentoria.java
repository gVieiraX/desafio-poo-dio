package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private int cargaHoarario;
    private LocalDate data;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoarario() {
        return cargaHoarario;
    }

    public void setCargaHoarario(int cargaHoarario) {
        this.cargaHoarario = cargaHoarario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoarario=" + cargaHoarario +
                ", data=" + data ;
    }
}
