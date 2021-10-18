package br.unicamp.helply.APIconfig;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

    public class Aluno  implements Serializable{
        @SerializedName("id")
        private int id ;
        @SerializedName("nome")
        private String nome ;
        @SerializedName("email")
        private String email ;
        @SerializedName("senha")
        private String senha ;
        @SerializedName("disponivel")
        private boolean disponivel;
        @SerializedName("avatar")
        private int avatar;
        @SerializedName("serie")
        private int serie;
        @SerializedName("materia")
        private int materia;

    public Aluno(int id, String nome, String email, String senha, boolean disponivel, int avatar, int serie, int materia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.disponivel = disponivel;
        this.avatar = avatar;
        this.serie = serie;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", disponivel=" + disponivel +
                ", avatar=" + avatar +
                ", serie=" + serie +
                ", materia=" + materia +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

}
