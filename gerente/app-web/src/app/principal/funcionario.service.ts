import { Observable } from 'rxjs';
import { Funcionario } from './funcionario';
import { HttpHeaders, HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  private url = 'http://localhost:8000/funcionario/cadastro';

  constructor(
    private http : HttpClient
  ) { }

  add(funcionario : Funcionario) : Observable<HttpResponse<Funcionario>>{
    return this.http.post<Funcionario>(this.url, funcionario, {observe : 'response'});
  }
}
