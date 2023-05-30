from datetime import datetime, timedelta, date

usuarios = {}
veiculos = {}

def cadastrar_usuario():
    nome = input("Digite o nome do usuário: ")
    if nome in usuarios:
        print("Usuário já cadastrado.")
    else:
        usuarios[nome] = []
        print(f"Usuário {nome} cadastrado com sucesso!")
def cadastrar_veiculo():
    placa = input("Digite a placa do veículo: ")
    
    if placa in veiculos:
        print("Essa placa já foi cadastrada. Não é possível cadastrar novamente.")
    else:
        veiculos[placa] = {'disponivel': True, 'locacao': None}
        print(f"Veículo de placa {placa} cadastrado com sucesso!")

def remover_veiculo():
    placa = input("Digite a placa do veículo a ser removido: ")
    if placa in veiculos:
        if veiculos[placa]['disponivel']:
            del veiculos[placa]
            print(f"Veículo de placa {placa} removido com sucesso!")
        else:
            print("Este veículo não pode ser removido pois está locado.")
    else:
        print("Não existe veículo cadastrado com essa placa.")

def remover_usuario():
    nome = input("Digite o nome do usuário a ser removido: ")
    if nome in usuarios:
        if not usuarios[nome]:
            del usuarios[nome]
            print(f"Usuário {nome} removido com sucesso!")
        else:
            print("Este usuário não pode ser removido pois possui veículos locados.")
    else:
        print("Não existe usuário cadastrado com esse nome.")

def locar_veiculo():
    placa = input("Digite a placa do veículo a ser locado: ")
    if placa in veiculos:
        if veiculos[placa]['disponivel']:
            nome = input("Digite o nome do usuário que irá locar o veículo: ")
            if nome in usuarios:
                inicio = input("Digite a data de início da locação (dd/mm/aaaa): ")
                fim = input("Digite a data de término da locação (dd/mm/aaaa): ")
                try:
                    inicio = datetime.strptime(inicio, "%d/%m/%Y").date()
                    fim = datetime.strptime(fim, "%d/%m/%Y").date()
                    if inicio < datetime.now().date():
                        print("A data de início deve ser igual ou posterior a data atual.")
                    elif fim <= inicio:
                        print("A data de término deve ser posterior à data de início.")
                    else:
                        usuarios[nome].append({'placa': placa, 'locacao': (inicio, fim)})
                        veiculos[placa]['disponivel'] = False
                        veiculos[placa]['locacao'] = (inicio, fim)
                        print(f"Veículo de placa {placa} locado com sucesso para o usuário {nome}.")
                        exibir_usuarios_veiculos(nome)
                except ValueError:
                    print("Data inválida. Digite novamente.")
            else:
                print("Não existe usuário cadastrado com esse nome.")
        else:
            print("Este veículo não está disponível para locação.")
    else:
        print("Não existe veículo cadastrado com essa placa.")
      
def exibir_usuarios_veiculos(nome):
    print("------ USUÁRIOS CADASTRADOS E VEÍCULOS LOCADOS ------")
    if not usuarios and not veiculos:
        print("Não há usuários cadastrados e nenhum veículo locado no momento.")
    else:
        for usuario, veiculos_locados in usuarios.items():
            if veiculos_locados:
                print(f"{usuario} tem os seguintes veículos locados:")
                for veiculo in veiculos_locados:
                    placa = veiculo['placa']
                    data_fim = veiculos[placa]['locacao'][1].strftime('%d/%m/%Y')
                    print(f"- Placa: {placa} (locado até {data_fim})")
            else:
                print(f"{usuario} não tem veículos locados no momento.")

        print("------ VEÍCULOS DISPONÍVEIS ------")
        disponiveis = [placa for placa, veiculo in veiculos.items() if veiculo['disponivel']]
        if disponiveis:
            for placa in disponiveis:
                print(f"Placa: {placa}")
        else:
            print("Não há veículos disponíveis no momento.")
                

while True:
    print("------ MENU ------")
    print("1. Cadastrar usuário")
    print("2. Cadastrar veículo")
    print("3. Remover veículo")
    print("4. Remover usuário")
    print("5. Locar veículo")
    print("6. Exibir usuários cadastrados e veículos locados")
    print("0. Sair do programa")
    opcao = input("Digite a opção desejada: ")

    if opcao == "1":
        cadastrar_usuario()

    elif opcao == "2":
        cadastrar_veiculo()

    elif opcao == "3":
        remover_veiculo()

    elif opcao == "4":
        remover_usuario()

    elif opcao == "5":
        locar_veiculo()

    elif opcao == "6":
        exibir_usuarios_veiculos(None)  # Pass 'None' or remove the argument if 'nome' is not needed here

    elif opcao == "0":
        print("Encerrando o programa...")
        break