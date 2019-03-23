import { Login } from './login';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Gerente } from '../cadastro/gerente';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  private url = 'http://localhost:8000/gerente/login';

  constructor(private http : HttpClient) { }
  
  log(login : Login) : Observable<HttpResponse<Gerente>>{
    return this.http.post<Gerente>(this.url, login, {observe : 'response'});
  }
}
