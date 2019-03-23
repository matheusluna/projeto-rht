import { Funcionario } from './../principal/funcionario';
import { HttpHeaders, HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class ListaService {
  
  private url = 'http://localhost:8000/funcionario/gerente';
  private
  constructor(
    private http : HttpClient
  ) { }

  list(gerente : string) : Observable<HttpResponse<Funcionario[]>>{
    return this.http.post<Funcionario[]>(this.url, gerente, {observe : 'response'});
  }
}
