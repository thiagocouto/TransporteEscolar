import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the PassageiroDetail page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-passageiro-detail',
  templateUrl: 'passageiro-detail.html',
})
export class PassageiroDetail {

  passageiro: any;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.passageiro = this.navParams.get("passageiro");
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroDetail');
  }

}
