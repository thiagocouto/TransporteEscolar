import { Component } from '@angular/core';
import { AlertController, IonicPage, NavController, NavParams } from 'ionic-angular';

import { RestapiService } from '../../providers/restapi-service';

/**
 * Generated class for the PassageiroChange page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-passageiro-change',
  templateUrl: 'passageiro-change.html',
})
export class PassageiroChange {

  passageiro: any;

  constructor(
    public alertCtrl: AlertController,
    public navCtrl: NavController, 
    public navParams: NavParams,
    public restapiService: RestapiService) {
    this.passageiro = this.navParams.get("passageiro");
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroChange');
  }

  confirmarAlteracaoPassageiro() {
    let confirm = this.alertCtrl.create({
      title: 'Atualizar passageiro?',
      message: 'Deseja confirmar a alteração do passageiro?',
      buttons: [
        {
          text: 'Sim',
          handler: () => {
            this.updatePassageiro();
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

  updatePassageiro() {
    this.restapiService.updatePassageiro(this.passageiro).then((result) => {
      this.showAlertAlteracao();
      this.closePage();
    }, (err) => {
      console.log(err);
    });
  }

  showAlertAlteracao() {
    let alert = this.alertCtrl.create({
      title: 'Alterar passageiro',
      subTitle: 'Passageiro alterado com sucesso!',
      buttons: ['OK']
    });
    alert.present();
  }

  closePage(){
    this.navCtrl.pop();
  }

}
