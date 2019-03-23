import { Funcionario } from './../principal/funcionario';
import { UsuarioStorage } from './../usuario-storage';
import { ListaService } from './lista.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-funcionario',
  templateUrl: './lista-funcionario.component.html',
  styleUrls: ['./lista-funcionario.component.css']
})
export class ListaFuncionarioComponent implements OnInit {
  
  private usuarioStorage = new UsuarioStorage();
  private login = this.usuarioStorage.getSessaoUsuario();
  funcionarios : Funcionario[];
  constructor(
    private listaService : ListaService
  ) { }

  ngOnInit() {
    this.list()
  }

  list(){
    this.listaService.list(this.login).subscribe(
      data => {
        this.funcionarios = data.body;
      }
    )
  }

}
