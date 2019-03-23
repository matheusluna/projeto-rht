import { UsuarioStorage } from './../usuario-storage';
import { LoginService } from './login.service';
import { Component, OnInit } from '@angular/core';
import swal from 'sweetalert';
import { Login } from './login';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private usuarioStorage = new UsuarioStorage();
  login : Login = {
    login : '',
    senha : ''
  }

  constructor(
    private loginservice : LoginService
  ) { }

  ngOnInit() {
  }

  log(){
    this.loginservice.log(this.login).subscribe(
      data =>{
        if (data.body != null) {
          this.usuarioStorage.setSessaoUsuario(data.body.login);
          window.location.assign('/principal');
        } else swal("Oops!", "Something went wrong!", "error");   
      },
      error => {
        swal("Oops!", "Something went wrong!", "error");
        
        this.login = {
          login : '',
          senha : ''
        }
      }
    );
  }

}
