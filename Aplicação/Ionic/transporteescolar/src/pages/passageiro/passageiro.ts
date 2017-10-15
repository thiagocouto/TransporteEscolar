import { Component } from '@angular/core';
import { Events, NavController, NavParams } from 'ionic-angular';

import { RestapiService } from '../../providers/restapi-service';

import { PassageiroDetail } from '../passageiro-detail/passageiro-detail';
import { PassageiroInsert } from '../passageiro-insert/passageiro-insert';

/**
 * Generated class for the Passageiro page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@Component({
  selector: 'page-passageiro',
  templateUrl: 'passageiro.html',
})
export class Passageiro {

  passageiros: any;

  constructor(
    public events: Events,
    public navCtrl: NavController,
    public navParams: NavParams,
    public restapiService: RestapiService) {
  }

  getPassageiros() {
    this.restapiService.getPassageiros()
      .then(data => {
        this.passageiros = data;
        console.log(this.passageiros);
      });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Passageiro');
  }

  openPageInsertPassageiro() {
    this.navCtrl.push(PassageiroInsert);
  }

  itemTapped(event, passageiro) {
    this.navCtrl.push(PassageiroDetail, {
      passageiro: passageiro
    });
  }

  refreshPassageiros() {
    this.getPassageiros();
  }

  ionViewDidEnter() {
    console.log('ionViewDidEnter Passageiro');
    this.refreshPassageiros();
  }

}
