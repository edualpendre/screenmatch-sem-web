package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    //usa-se o <T> (genérico) pq não se sabe o que o método vai devolver, pode ser uma série, um diretor, etc
    //o segundo argumento, Class, tbm genérico, para indicar qual a classe que deve ser devolvida.

}
