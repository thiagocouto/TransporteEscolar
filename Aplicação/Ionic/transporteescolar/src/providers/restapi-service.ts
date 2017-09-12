import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
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
  apiUrlPassageiro = 'http://localhost:8080/transporte/service/passageiro';

  constructor(public http: Http) {
    console.log('Hello RestapiService Provider');
  }

  getPassageiros() {
    if (this.data) {
      return Promise.resolve(this.data);
    }

    return new Promise(resolve => {
      //this.http.get(this.apiUrl+'/users')
      this.http.get(this.apiUrlPassageiro)
        .map(res => res.json())
        .subscribe(data => {
          this.data = data;
          console.log("dados serviço:" + this.data);
          resolve(this.data);
        });
    });
  }

  savePassageiro(data) {
      return new Promise((resolve, reject) => {
        
        let body = JSON.stringify(data);
        let headers = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: headers });

        this.http.post(this.apiUrlPassageiro, body, options)
          .subscribe(res => {
            resolve(res);
          }, (err) => {
            reject(err);
          });
      });
  }

}
