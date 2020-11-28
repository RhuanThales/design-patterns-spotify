# Spotify (Projeto simples com alguns Design Patterns)

Projeto implementado como requisito parcial da disciplina de Análise e Desenvolvimento de Sistemas, do curso de Sistemas de Informação (Centro Universitário de Patos de Minas - UNIPAM), sob a orientação do Professor Filipe Guelber Melo.

## Objetivo

O objetivo deste projeto é aplicar alguns conhecimentos de padrões de projeto adquiridos, na disciplina de Análise e Desenvolvimento de Sistemas, usando a linguagem de programação JAVA.

Esse é um projeto bem simples que foi feito utilizando 3 designs patterns, sendo eles:

* Factory
* Proxy
* Composite

## Cenário

Nosso projeto tenta simular o Spotify, que é um serviço de streaming de música, podcast e vídeo, sendo que ele possui dois tipo de serviços que são o Premium e o gratuito.

Esse projeto é voltado mais para musicas e assim como o Spotify possui dois modos de serviços (free e premium).

## O que cada pattern faz?

* Factory: O factory é responsável por criar instâncias dos players free e premium gerados pelo proxy de uma forma mais simples, rápida e usando menos código.

* Proxy: O proxy é responsável pelo gerenciamento dos players free e premium, onde há limitações ao player free (possui anúncios antes de tocar a música), mas sem ser necessário a criação de um novo código apenas para ele, e a programação do player premium é reutilizada no player free.

* Composite: O composite é usado para a criação de "Singles", "Albuns" e "Playlists", onde é possível criar diversos singles de forma independente e se desejar pode-se gerar um album através destes singles.

## Autores

* m4sterin => Caio Vicente Rodrigues
* RhuanThales => Rhuan Thales de Souza Trajano