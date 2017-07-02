import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

import { RestapiService } from '../../providers/restapi-service';

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

  constructor(public navCtrl: NavController, public navParams: NavParams, public restapiService: RestapiService) {
    this.getPassageiros();
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

}
