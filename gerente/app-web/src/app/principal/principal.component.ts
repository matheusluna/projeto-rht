import { FuncionarioService } from './funcionario.service';
import { Funcionario } from './funcionario';
import { UsuarioStorage } from './../usuario-storage';
import { Component, OnInit } from '@angular/core';
import swal from 'sweetalert';
@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent implements OnInit {

  private usuarioStorage = new UsuarioStorage();
  private login = this.usuarioStorage.getSessaoUsuario();
  
  funcionario : Funcionario = {
    id : null,
    nome : '',
    login : '',
    senha : '',
    gerente : this.login,
    resultados : null
  }

  constructor(
    private funcionarioService : FuncionarioService
  ) { }

  ngOnInit() {
  }

  add(){
    this.funcionarioService.add(this.funcionario).subscribe(
      data => {
        swal("Good job!", "You clicked the button!", "success");
        window.location.assign('/principal');
      },
      error => {
        swal("Oops!", "Something went wrong!", "error");
        this.funcionario = {
          id : null,
          nome : '',
          login : '',
          senha : '',
          gerente : this.login,
          resultados : null
        }
      }
    )
  }

  logout(){
    this.usuarioStorage.logout();
    window.location.assign('/login');
  }
}
