import { Component } from '@angular/core';
import { AlertController, IonicPage, NavController, NavParams } from 'ionic-angular';

import { RestapiServiceViagem } from '../../providers/restapi-serviceViagem';

/**
 * Generated class for the GerarViagem page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-gerar-viagem',
  templateUrl: 'gerar-viagem.html',
})
export class GerarViagem {

  dtInicio: Date;
  dtFim: Date;

  constructor(
    public alertCtrl: AlertController,
    public navCtrl: NavController, 
    public navParams: NavParams,
    public restapiServiceViagem: RestapiServiceViagem) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad GerarViagem');
  }

  confirmarGeracaoViagens() {
    let confirm = this.alertCtrl.create({
      title: 'Gerar viagens',
      message: 'Deseja confirmar a geração de viagens entre ' + this.dtInicio + ' e ' + this.dtFim + '?',
      buttons: [
        {
          text: 'Sim',
          handler: () => {
            this.gerarViagens();
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

  gerarViagens() {
    this.restapiServiceViagem.gerarViagens(this.dtInicio, this.dtFim).then((result) => {
      this.showAlertGerarViagem();
      this.limparCampos();
    }, (err) => {
      console.log(err);
    });
  }

  showAlertGerarViagem() {
    let alert = this.alertCtrl.create({
      title: 'Geração de viagens',
      subTitle: 'Viagens geradas com sucesso!',
      buttons: ['OK']
    });
    alert.present();
  }

  limparCampos(){
    this.dtInicio = null;
    this.dtFim = null;
  }
}
