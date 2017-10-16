import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class RestapiServiceViagem {

  apiUrlViagem = 'http://localhost:8080/transporte/service/viagem';

  constructor(public http: Http) {
    console.log('Hello RestapiService Provider');
  }

  gerarViagens(dtInicio, dtFim) {

    let data = {dtInicio: dtInicio , dtFim: dtFim};

    return new Promise((resolve, reject) => {

      let body = JSON.stringify(data);
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });

      console.log("url: " + body);

      this.http.post(this.apiUrlViagem+"/gerarViagens", body, options)
        .subscribe(res => {
          resolve(res);
        }, (err) => {
          reject(err);
        });
    });
  }

  /**
  getPassageiros() {
    return new Promise(resolve => {
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

  updatePassageiro(data) {
    return new Promise((resolve, reject) => {

      let body = JSON.stringify(data);
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });

      this.http.put(this.apiUrlPassageiro, body, options)
        .subscribe(res => {
          resolve(res);
        }, (err) => {
          reject(err);
        });
    });
  }

   */
}
