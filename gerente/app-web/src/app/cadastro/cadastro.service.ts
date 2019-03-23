import { Gerente } from './gerente';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  private url = 'http://localhost:8000/gerente/cadastro';

  constructor(
    private http : HttpClient
  ) { }

  cadastro(gerente : Gerente) : Observable<Gerente>{
    return this.http.post<Gerente>(this.url, gerente);
  }
}
