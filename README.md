<h1 align="center">Posts</h1>
O projeto "Posts" é um aplicativo em Kotlin que permite realizar operações CRUD (Create, Read, Update, Delete) em notas. Cada nota possui um título, uma imagem e um texto.

<h3>Funcionalidades</h3>
O projeto "Posts" possui as seguintes funcionalidades:

- Criação de novas notas com título, imagem e texto.
- Visualização da lista de notas existentes.
- Edição de notas existentes, incluindo título, imagem e texto.
- Exclusão de notas.
- Carregamento de imagens usando a biblioteca Glide.
- Utilização de databinding para vincular dados à interface do usuário.
- Utilização de fragments e viewmodel para a arquitetura MVVM (Model-View-ViewModel).
- Utilização de coroutines para operações assíncronas.
- Utilização da biblioteca Room para persistência de dados.
- Injeção de dependência com Koin para gerenciamento de dependências.

<h3>Dependências</h3>
O projeto "Posts" utiliza as seguintes dependências de terceiros:

- Glide: Biblioteca para carregamento e exibição de imagens.
- Room: Biblioteca para persistência de dados SQLite.
- Koin: Biblioteca para injeção de dependência.
- Coroutines: Biblioteca para programação assíncrona e concorrência estruturada.
- AndroidX: Bibliotecas do Android Jetpack, incluindo fragmentos, viewmodel e databinding.

<h3>Arquitetura</h3>
O projeto "Posts" segue a arquitetura MVVM (Model-View-ViewModel), separando as responsabilidades em três camadas principais:

- Model: Responsável pelo acesso aos dados e pela lógica de negócios. Inclui a camada de banco de dados utilizando o Room.
- View: Responsável pela exibição dos dados e interação com o usuário. Inclui os fragments e layouts XML utilizando o databinding.
- ViewModel: Responsável por fornecer os dados da camada Model para a camada View. Gerencia o estado e as interações da interface do usuário.

<h3>Configuração do Projeto</h3>
Para executar o projeto "Posts", siga as etapas abaixo:

- Clone o repositório: git clone https://github.com/phtrebil/Posts.git
- Abra o projeto em no android studio.
- Execute o projeto em um emulador ou dispositivo Android compatível.

<h1 align="center"> Vitrine.dev </h1>

| :placard: Vitrine.Dev |     |
| -------------  | --- |
| :sparkles: Nome        | **Posts**
| :label: Tecnologias | Kotlin, databiding, framents viewmodel, MVVM, coroutines, room, injeção de dependencia com koin, glide e room.
| :rocket: URL         | https://github.com/phtrebil/Posts
| :fire: Desafio     | https://github.com/phtrebil/Posts
