import { Injectable } from '@angular/core';

@Injectable()
export class UsuarioStorage {

    public logout() {
        sessionStorage.clear();
    }

    public setSessaoUsuario(user: string) {
        sessionStorage.removeItem("login");
        sessionStorage.setItem("login", user);
    }

    public getSessaoUsuario(): string {
        return sessionStorage.getItem("login");
    }

}