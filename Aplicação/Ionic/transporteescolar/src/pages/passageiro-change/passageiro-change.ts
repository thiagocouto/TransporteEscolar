import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

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

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.passageiro = this.navParams.get("passageiro");
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroChange');
  }

}
