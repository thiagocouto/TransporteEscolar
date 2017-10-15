import { Component } from '@angular/core';
import { AlertController, IonicPage, NavController, NavParams } from 'ionic-angular';

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

  passageiro = {
    agenda: {
      horarios: [
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        },
        {
          diaSemana: '',
          hora: '',
          tipoHorario: '',
          turno: ''
        }
      ]
    },
    email: '',
    endereco: {
      bairro: '',
      complemento: '',
      localizacao: {
        latitude: '',
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
    public alertCtrl: AlertController,
    public navCtrl: NavController,
    public navParams: NavParams,
    public restapiService: RestapiService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroInsert');
  }

  confirmarInclusaoPassageiro() {
    let confirm = this.alertCtrl.create({
      title: 'Incluir passageiro?',
      message: 'Deseja confirmar a inclusão do passageiro?',
      buttons: [
        {
          text: 'Sim',
          handler: () => {
            this.insertPassageiro();
          }
        },
        {
          text: 'Cancelar',
          handler: () => {
            console.log('Disagree clicked');
          }
        }
      ]
    });
    confirm.present();
  }

  insertPassageiro() {
    this.restapiService.savePassageiro(this.passageiro).then((result) => {
      this.showAlertInclusao();
      this.closePage();
    }, (err) => {
      console.log(err);
    });
  }

  showAlertInclusao() {
    let alert = this.alertCtrl.create({
      title: 'Incluir passageiro',
      subTitle: 'Passageiro incluído com sucesso!',
      buttons: ['OK']
    });
    alert.present();
  }

  closePage(){
    this.navCtrl.pop();
  }

}
