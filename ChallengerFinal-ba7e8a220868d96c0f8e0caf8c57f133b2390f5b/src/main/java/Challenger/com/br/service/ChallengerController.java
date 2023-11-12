package Challenger.com.br.service;

import Challenger.com.br.model.RequisicaoChamado;
import org.springframework.web.bind.annotation.*;
import Challenger.com.br.model.Cliente;
import Challenger.com.br.menu.CadastroCliente;
import Challenger.com.br.menu.Chamado;
import Challenger.com.br.menu.Login;
import Challenger.com.br.menu.MenuVeiculo;
import java.util.Scanner;

@RestController
@RequestMapping("/api")
public class ChallengerController {

    @PostMapping("/Login")
    public String fazerLogin(@RequestBody Cliente cliente, VerificadorCadastro verificadorCadastro) {
        Scanner scanner = new Scanner(System.in);
        return Login.realizarLogin(scanner, verificadorCadastro) ? "Login bem-sucedido. Bem-vindo!" : "Login falhou. CPF ou senha incorretos.";

    }

    @PostMapping("/Cadastro")
    public String realizarCadastro(@RequestBody Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        CadastroCliente.realizarCadastro(scanner);
        return "Cadastro realizado com sucesso!";
    }

    @GetMapping("/MenuVeiculo")
    public String mostrarMenuVeiculo() {
        Scanner scanner = new Scanner(System.in);
        return MenuVeiculo.mostrarMenu(scanner, Cliente.getPlaca(), Cliente.getCarro());
    }

    @PostMapping("/Chamado")
    public String realizarChamado(@RequestBody RequisicaoChamado dadosChamado) {
        Scanner scanner = new Scanner(System.in);
        return Chamado.realizarChamado(scanner, dadosChamado) ? "Chamado realizado com sucesso!" : "Erro ao processar o chamado.";
    }
}
