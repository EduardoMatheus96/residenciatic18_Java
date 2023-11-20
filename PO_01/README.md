### 1. Classes e Objetos em Java

**Classe em Java:**
Uma classe em Java é um modelo para criar objetos. Ela define atributos e comportamentos comuns a todos os objetos daquela classe.

**Objeto em Java:**
Um objeto é uma instância de uma classe. Ele representa uma entidade do mundo real e pode ser manipulado através de métodos definidos pela classe.

**Exemplos em Java:**
```java
// Exemplo 1: Classe e Objeto
class Carro {
    String modelo;
    int ano;

    void acelerar() {
        System.out.println("Acelerando o carro.");
    }
}

// Criando um objeto
Carro meuCarro = new Carro();
meuCarro.modelo = "Fusca";
meuCarro.ano = 2020;
meuCarro.acelerar();

```

### 2. Declaração de Variáveis e Tipos de Dados Primitivos em Java

**Declaração em Java:**

```
int numero; // Declaração de uma variável inteira
double preco; // Declaração de uma variável double
String nome; // Declaração de uma variável String

```

**Tipos de Dados Primitivos Comuns:**

> int: Números inteiros.

> double: Números decimais.

> boolean: Valores verdadeiro ou falso.

> char: Caracteres individuais.

**Comparação com C++:**

```
// Exemplo em C++
int numero; // Declaração de uma variável inteira
double preco; // Declaração de uma variável double
string nome; // Declaração de uma variável string (C++)
```

### 3. Herança em Java

**Herança em Java:**
Herança permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). A subclasse pode estender ou modificar o comportamento da superclasse.

**Exemplo em Java:**

```
// Superclasse
class Animal {
    void comer() {
        System.out.println("O animal está comendo.");
    }
}

// Subclasse
class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

// Criando objeto da subclasse
Cachorro meuCachorro = new Cachorro();
meuCachorro.comer(); // Herdado da superclasse
meuCachorro.latir(); // Próprio da subclasse

```
**Paralelo em C++:**
```
// Exemplo em C++
class Animal {
public:
    void comer() {
        cout << "O animal está comendo." << endl;
    }
};

class Cachorro : public Animal {
public:
    void latir() {
        cout << "O cachorro está latindo." << endl;
    }
};

// Criando objeto da subclasse
Cachorro meuCachorro;
meuCachorro.comer(); // Herdado da superclasse
meuCachorro.latir(); // Próprio da subclasse
```

### 4. Ponteiros em Java e C++

**Declaração em Java:**
Em Java, não há manipulação direta de ponteiros como em C++. A passagem de objetos é feita por referência, mas o programador não manipula explicitamente ponteiros.

**Comparação com C++:**
Em C++, a manipulação de ponteiros é comum. O operador * é usado para declarar ponteiros e acessar valores através deles.

```
// Exemplo em C++
int numero = 42;
int *ponteiro = &numero; // Declaração de ponteiro
cout << *ponteiro << endl; // Acesso ao valor através do ponteiro
```
Lembre-se de que em Java, a manipulação direta de ponteiros não é necessária, pois o gerenciamento de memória é feito automaticamente pelo coletor de lixo (garbage collector).
