import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

/*
  Generated class for the RestapiService provider.

  See https://angular.io/docs/ts/latest/guide/dependency-injection.html
  for more info on providers and Angular 2 DI.
*/
@Injectable()
export class RestapiService {

  data: any;
  //apiUrl = 'https://jsonplaceholder.typicode.com';
  apiUrl = 'http://localhost:8080/transporte/service/passageiro/listar';

  constructor(public http: Http) {
    console.log('Hello RestapiService Provider');
  }

  getPassageiros() {
    if (this.data) {
      return Promise.resolve(this.data);
    }

    return new Promise(resolve => {
      //this.http.get(this.apiUrl+'/users')
      this.http.get(this.apiUrl)
        .map(res => res.json())
        .subscribe(data => {
          this.data = data;
          console.log("dados serviço:" + this.data);
          resolve(this.data);
        });
    });
  }

  saveUser(data) {
      return new Promise((resolve, reject) => {
        this.http.post(this.apiUrl+'/users', JSON.stringify(data))
          .subscribe(res => {
            resolve(res);
          }, (err) => {
            reject(err);
          });
      });
  }

}
