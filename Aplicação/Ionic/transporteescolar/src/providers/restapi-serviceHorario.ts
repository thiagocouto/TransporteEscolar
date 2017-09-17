import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

/*
  Generated class for the RestapiService provider.

  See https://angular.io/docs/ts/latest/guide/dependency-injection.html
  for more info on providers and Angular 2 DI.
*/
@Injectable()
export class RestapiServiceHorario {

  apiUrlHorario = 'http://localhost:8080/transporte/service/horario';
  
  constructor(public http: Http) {
    console.log('Hello RestapiService Provider Horários');
  }

  //Horarios
  getHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario){

    return new Promise(resolve => {

      let url = this.apiUrlHorario + "?diaSemana=" + diaSemana + "&tipoHorario=" + tipoHorario;

      console.log("url: " + url);

      this.http.get(url)
        .map(res => res.json())
        .subscribe(data => {
          resolve(data);
        });
    });  
  }

}
