import { Gerente } from './gerente';
import { CadastroService } from './cadastro.service';
import { Component, OnInit } from '@angular/core';
import swal from 'sweetalert';
@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {
  gerente : Gerente = {
    id : null,
    nome : '',
    login : '',
    senha : '',
    funcionarios : null
  }
  constructor(private cadastroService : CadastroService) { }

  ngOnInit() {
  }

  add() : void{
    this.cadastroService.cadastro(this.gerente).subscribe(
      data => {
        swal("Good job!", "You clicked the button!", "success");
        window.location.assign('/');        
      },
      error => {
        swal("Oops!", "Something went wrong!", "error");
        this.gerente = {
          id : null,
          nome : '',
          login : '',
          senha : '',
          funcionarios : null
        }
      }
    );
  }

}
