import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

import { RestapiServiceHorario } from '../../providers/restapi-serviceHorario';
import { RestapiService } from '../../providers/restapi-service';

/**
 * Generated class for the PassageiroInsert page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-passageiro-insert',
  templateUrl: 'passageiro-insert.html',
})
export class PassageiroInsert {

  horariosSegundaIda: any;
  horariosTercaIda: any;
  horariosQuartaIda: any;
  horariosQuintaIda: any;
  horariosSextaIda: any;

  horariosSegundaVolta: any;
  horariosTercaVolta: any;
  horariosQuartaVolta: any;
  horariosQuintaVolta: any;
  horariosSextaVolta: any;

  passageiro = {email: '',
                endereco: {bairro: '',
                           complemento: '',
                           localizacao : {latitude: '',
                                          longitude: ''
                                         },
                           logradouro: '',
                           numero: ''
                          },
                nome: '',
                telefone: '',
                turno: ''
               };

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams, 
    public restapiService: RestapiService, 
    public restapiServiceHorario: RestapiServiceHorario) {
      this.getHorariosSegundaIda();       
      this.getHorariosTercaIda();
      this.getHorariosQuartaIda();
      this.getHorariosQuintaIda();
      this.getHorariosSextaIda();
      this.getHorariosSegundaVolta();               
      this.getHorariosTercaVolta();
      this.getHorariosQuartaVolta();
      this.getHorariosQuintaVolta();
      this.getHorariosSextaVolta();
  }

  getHorariosSegundaIda(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEGUNDA', 'IDA')
    .then(data => {
      this.horariosSegundaIda = data;
    });
  }

  getHorariosTercaIda(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('TERCA', 'IDA')
    .then(data => {
      this.horariosTercaIda = data;
    });
  }

  getHorariosQuartaIda(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUARTA', 'IDA')
    .then(data => {
      this.horariosQuartaIda = data;
    });
  }

  getHorariosQuintaIda(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUINTA', 'IDA')
    .then(data => {
      this.horariosQuintaIda = data;
    });
  }

  getHorariosSextaIda(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEXTA', 'IDA')
    .then(data => {
      this.horariosSextaIda = data;
    });
  }

  getHorariosSegundaVolta(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEGUNDA', 'VOLTA')
    .then(data => {
      this.horariosSegundaVolta = data;
    });
  }

  getHorariosTercaVolta(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('TERCA', 'VOLTA')
    .then(data => {
      this.horariosTercaVolta = data;
    });
  }

  getHorariosQuartaVolta(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUARTA', 'VOLTA')
    .then(data => {
      this.horariosQuartaVolta = data;
    });
  }

  getHorariosQuintaVolta(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUINTA', 'VOLTA')
    .then(data => {
      this.horariosQuintaVolta = data;
    });
  }

  getHorariosSextaVolta(){
    this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEXTA', 'VOLTA')
    .then(data => {
      this.horariosSextaVolta = data;
    });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroInsert');
  }

  insertPassageiro(){
    console.log('nome: ' + this.passageiro.nome);
    console.log('turno: ' + this.passageiro.turno);
    this.restapiService.savePassageiro(this.passageiro).then((result) => {
      console.log(result);
    }, (err) => {
      console.log(err);
    });
  }

}
